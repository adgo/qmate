package org.tud.inf.st.pceditor.emf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.tud.inf.st.pccs.ConcreteSyntax;
import org.tud.inf.st.pceditor.interpreter.PCCSInterpreter;
import org.tud.inf.st.pceditor.interpreter.ParserResult;
import org.tud.inf.st.pceditor.interpreter.ParserWrapper;
import org.tud.inf.st.pceditor.interpreter.Util;

public class PCCSResourceFactoryImpl extends ResourceFactoryImpl {
	private ConcreteSyntax[] syntax;

	public PCCSResourceFactoryImpl(ConcreteSyntax[] stx) {
		this.syntax = stx;
	}

	@Override
	public Resource createResource(URI uri) {
		return new PCCSResourceImpl(uri,syntax);
	}

	public static class PCCSResourceImpl extends ResourceImpl {
		private ParserResult underlyingParserResult;
		private ConcreteSyntax[] syntax;
		private List<Object> imports = new ArrayList<Object>();

		public PCCSResourceImpl(URI uri, ConcreteSyntax[] syntax) {
			super(uri);
			this.syntax = syntax;
		}
		
		public void addImport(Object import_){
			this.imports.add(import_);
		}
		
		public List<Object> getImports() {
			return imports;
		}
		
		protected ParserResult getUnderlyingParserResult() {
			return underlyingParserResult;
		}
		
		public void setUnderlyingParserResult(
				ParserResult underlyingParserResult) {
			this.underlyingParserResult = underlyingParserResult;
		}

		@Override
		public void load(Map<?, ?> options) throws IOException {
			if (this.getResourceSet() != null && !this.isLoaded()) {
				this.setLoaded(true);
				for (ConcreteSyntax cs : syntax)
					EcoreUtil.resolveAll(cs);
				ParserWrapper pw = PCCSInterpreter.interpret(syntax, this);
				try {
					pw.parse(loadText(this.getURI()));
				} catch (Exception e) {
					e.printStackTrace();
					this.setLoaded(false);
				}
			}
		}

		@Override
		protected void doLoad(InputStream inputStream, Map<?, ?> options)
				throws IOException {
			if (this.getResourceSet() != null && !isLoaded()) {
				try {
					setLoaded(true);
					for (ConcreteSyntax cs : syntax)
						EcoreUtil.resolveAll(cs);
					ParserWrapper pw = PCCSInterpreter.interpret(syntax, this);
					pw.parse(loadInputStream(inputStream));
				} catch (Exception e) {
					setLoaded(false);
					throw e;
				}
			}
		}

		@Override
		public void save(Map<?, ?> options) throws IOException {
			if (!getURI().toString().startsWith(Util.TEMP_SCHEME))
				super.save(options);
		}

		@Override
		protected void doSave(OutputStream outputStream, Map<?, ?> options)
				throws IOException {
			if (!getURI().toString().startsWith(Util.TEMP_SCHEME))
				super.doSave(outputStream, options);
		}

		private String loadInputStream(InputStream inputStream) throws IOException {
			StringBuffer content = new StringBuffer();
			Scanner s = new Scanner(inputStream);
			Scanner sd = s.useDelimiter("\\A");
			content.append(sd.next());
			sd.close();
			s.close();
			inputStream.close();
			return content.toString();
		}


		public String loadText(URI uri) throws IOException {
			InputStream is = URIConverter.INSTANCE.createInputStream(uri);
			return loadInputStream(is);
		}
		
	}

}
