package org.tud.inf.st.pceditor.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.tud.inf.st.pccs.PccsFactory;
import org.tud.inf.st.pccs.QualifiedName;

public class IntmResult {
	private String label;
	private Object o;

	public IntmResult(String label, Object o) {
		this.label = label;
		this.o = o;
	}

	public String getLabel() {
		return label;
	}

	public Object getObject() {
		return o;
	}

	@Override
	public String toString() {
		return label == null ? o + "" : label + " = " + o;
	}

	public Object getByQName(List<String> qname) {
		if (qname.size() == 0)
			return o;
		
		if (o instanceof IntmResult) {
			return ((IntmResult) o).getByQName(qname);
		}
		
		String head = qname.get(0);
		List<String> tail = qname.subList(1, qname.size());

		if (head.equals("this")) {
			return getByQName(tail);
		} else {
			if (o instanceof List<?>) {
				if (head.startsWith("_")) {
					String suffix = head.substring(1);
					int idx = 0;
					if (suffix.length() != 0) {
						idx = Integer.valueOf(suffix);

					}
					Object oc = ((List<?>) o).get(idx);
					if (oc instanceof IntmResult
							&& ((IntmResult) oc).getLabel() != null
							&& ((IntmResult) oc).getLabel().equals(head)) {
						return ((IntmResult) oc).getByQName(tail);
					}
				} else {
					List<Object> result = new ArrayList<>();
					for (Object oc : (List<?>) o) {
						if (oc instanceof IntmResult
								&& ((IntmResult) oc).getLabel() != null
								&& ((IntmResult) oc).getLabel().equals(head)) {
							Object r = ((IntmResult) oc).getByQName(tail);
							if(r instanceof Collection<?>){
								result.addAll((Collection<?>) r);
							} else {
								result.add(r);
							}
						}
					}
					if(result.size()==1)return result.get(0);
					else if(!result.isEmpty()) return result;
				}
			} 
			//no list
				
			if(tail.isEmpty() && (head.equals("this") || head.equals(label))){
					return o;
			}
			
		}
		return null;
	}

	public QualifiedName toQName(String delim) {
		if (o instanceof List<?>) {
			if (((List<?>) o).size() == 0)
				return PccsFactory.eINSTANCE.createQualifiedName();
			else {
				QualifiedName result = PccsFactory.eINSTANCE.createQualifiedName();
				for (Object ao : (List<?>) o) {
					if (ao instanceof IntmResult) {
						result.getSections().addAll(((IntmResult) ao).toQName(delim).getSections());
					} else {
						result.getSections().addAll(new IntmResult(null,ao).toQName(delim).getSections());
					}
				}
				return result;
			}
		} else if (o instanceof String) {
			if (o.toString().equals(delim)) {
				return PccsFactory.eINSTANCE.createQualifiedName();
			} else {
				QualifiedName result = PccsFactory.eINSTANCE.createQualifiedName();
				result.getSections().add((String) o);
				return result;
			}
		} else if (o instanceof IntmResult) {
			return ((IntmResult) o).toQName(delim);
		} else if (o instanceof QualifiedName)return (QualifiedName) o;
		return null;
	}
}
