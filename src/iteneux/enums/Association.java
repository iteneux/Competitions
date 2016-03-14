package iteneux.enums;

public enum Association {
	ALB("ALB"),
	AND("AND"),
	ARM("ARM"),
	AUT("AUT"),
	AZE("AZE"),
	BLR("BLR"),
	BEL("BEL"),
	BUL("BUL"),
	BIH("BIH"),
	CRO("CRO"),
	CYP("CYP"),
	CZE("CZE"),
	DEN("DEN"),
	ENG("ENG"),
	EST("EST"),
	FRO("FRO"),
	FIN("FIN"),
	FRA("FRA"),
	GEO("GEO"),
	GER("GER"),
	GIB("GIB"),
	GRE("GRE"),
	HUN("HUN"),
	ISL("ISL"),
	ISR("ISR"),
	ITA("ITA"),
	KAZ("KAZ"),
	LVA("LVA"),
	LIE("LIE"),
	LTU("LTU"),
	LUX("LUX"),
	MKD("MKD"),
	MLT("MLT"),
	MDA("MDA"),
	MNE("MNE"),
	NED("NED"),
	NIR("NIR"),
	NOR("NOR"),
	POL("POL"),
	POR("POR"),
	IRL("IRL"),
	ROU("ROU"),
	RUS("RUS"),
	SMR("SMR"),
	SCO("SCO"),
	SRB("SRB"),
	SVK("SVK"),
	SVN("SVN"),
	ESP("ESP"),
	SWE("SWE"),
	SUI("SUI"),
	TUR("TUR"),
	UKR("UKR"),
	WAL("WAL");

	private String value;

	Association(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
