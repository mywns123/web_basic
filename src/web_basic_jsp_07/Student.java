package web_basic_jsp_07;

public class Student {
	private int stdNO;
	private String stdName;
	private int kor;
	private int eng;
	private int math;	
	
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Student() {	
		this.stdNO = 10;
		this.stdName = "김상건";
		this.kor = 90;
	}
	
	public Student(int stdNO, String stdName, int kor) {
		super();
		this.stdNO = stdNO;
		this.stdName = stdName;
		this.kor = kor;
	}

	public int getStdNO() {
		return stdNO;
	}

	public void setStdNO(int stdNO) {
		this.stdNO = stdNO;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public int getAvg() {
		return getTotal()/3;
	}
}
