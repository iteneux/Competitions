package iteneux.enums;

public enum DistributionType {
	CLG("CLG"), 
	NCLQ4("NCLQ4"), 
	NCLQ3("NCLQ3"), 
	CCLQ4("CCLQ4"), 
	CCLQ3("CCLQ3"), 
	CCLQ2("CCLQ2"), 
	CCLQ1("CCLQ1"),
	
	ELG("CLG"),
	ELQ4("ELQ4"), 
	ELQ3("ELQ3"), 
	ELQ2("ELQ2"), 
	ELQ1("ELQ1");

	private String value;

	DistributionType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
