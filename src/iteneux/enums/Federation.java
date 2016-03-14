package iteneux.enums;

public enum Federation {

	UEFA("UEFA"),
	CONMEBOL("CONMEBOL"),
	AFC("AFC"),
	CAF("CAF"),
	CONCACAF("CONCACAF"),
	OFC("OFC");

	private String value;

	Federation(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
