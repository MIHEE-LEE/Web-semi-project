package Controller;

public class TB_MEMDTO {
	private String MEM_NM;
	private String BIRTH;
	private String GENDER;
	private String MEM_ID; 
	private String PWD;
	private String PWD_CHECK;
	private String CELLNO;
	private String EMAIL;
	private String ADDR;
	public TB_MEMDTO() {
	}


	//insert
	public TB_MEMDTO(String MEM_NM, String BIRTH, String GENDER, String MEM_ID, String PWD, 
			String PWD_CHECK, String CELLNO, String EMAIL, String ADDR) {
		super();
		this.MEM_NM = MEM_NM;
		this.BIRTH = BIRTH;
		this.GENDER = GENDER;
		this.MEM_ID = MEM_ID;
		this.PWD = PWD;
		this.PWD_CHECK = PWD_CHECK;
		this.CELLNO = CELLNO;
		this.EMAIL = EMAIL;
		this.ADDR = ADDR;
	}

	

	
	@Override
	public String toString() {
		return "TB_MEMDTO [MEM_NM=" + MEM_NM + ", BIRTH=" + BIRTH + ", GENDER=" + GENDER
				+ ", MEM_ID=" + MEM_ID + ", PWD=" + PWD + ", PWD_CHECK=" + PWD_CHECK
				+ ", CELLNO=" + CELLNO + ", EMAIL=" + EMAIL +", ADDR=" + ADDR +"]";
	}


	public String getMEM_ID() {
		return MEM_ID;
	}


	public void setMEM_ID(String mEM_ID) {
		MEM_ID = mEM_ID;
	}


	public String getMEM_NM() {
		return MEM_NM;
	}


	public void setMEM_NM(String mEM_NM) {
		MEM_NM = mEM_NM;
	}


	public String getGENDER() {
		return GENDER;
	}


	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}


	public String getPWD() {
		return PWD;
	}


	public void setPWD(String pWD) {
		PWD = pWD;
	}


	public String getPWD_CHECK() {
		return PWD_CHECK;
	}


	public void setPWD_CHECK(String pWD_CHECK) {
		PWD_CHECK = pWD_CHECK;
	}


	public String getEMAIL() {
		return EMAIL;
	}


	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}


	public String getBIRTH() {
		return BIRTH;
	}


	public void setBIRTH(String bIRTH) {
		BIRTH = bIRTH;
	}


	public String getCELLNO() {
		return CELLNO;
	}


	public void setCELLNO(String cELLNO) {
		CELLNO = cELLNO;
	}


	public String getADDR() {
		return ADDR;
	}


	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}
	
	


}
