package iteneux.enums;

public enum Phase {

	GROUP("G"),
	KNOCKOUT("K");

	private String value;

	Phase(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
