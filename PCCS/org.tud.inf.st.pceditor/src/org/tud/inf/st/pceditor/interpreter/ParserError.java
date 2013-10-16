package org.tud.inf.st.pceditor.interpreter;

public class ParserError {
	private Location location;
	private int line;
	private int column;

	private String message;
	private String token;

	public ParserError(int line, int column, Location location, String message,
			String token) {
		this.line = line;
		this.column = column;
		this.message = message;
		this.token = token;
		this.location = location;
		
		System.err.println("Parser error: line "+line+", col "+column+", location "+location+", token "+token+". "+message);
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}

	public String getMessage() {
		return message;
	}

	public String getToken() {
		return token;
	}

	public Location getLocation() {
		return location;
	}

	public boolean append(ParserError toAppend) {
		if (toAppend.getLocation().getIndex() < location.getLength()
				+ location.getIndex()) {
			this.token += toAppend.getToken();
			this.location = new Location(this.location.getIndex(),
					this.location.getLength()
							+ toAppend.getLocation().getLength()
							- toAppend.getLocation().getIndex());
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "@" + line + ":" + column + " " + token + " ERROR " + message;
	}
}
