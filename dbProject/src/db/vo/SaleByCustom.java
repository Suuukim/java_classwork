package db.vo;

public class SaleByCustom {
// v_by_custno view에 있는 4개의 컬럼과 매핑될 필드 선언
	
	private int custno;
	private String custname;
	private String agrade;
	private int asum;
	
	
	//커스텀 생성자, getter/setter, toString 필요에 따라 작성하세요.

	public SaleByCustom() {
		
	}
	
	public SaleByCustom(int custno, String custname, String agrade, int asum) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.agrade = agrade;
		this.asum = asum;
	}
	
	//getter/setter
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAgrade() {
		return agrade;
	}
	public void setAgrade(String agrade) {
		this.agrade = agrade;
	}
	public int getAsum() {
		return asum;
	}
	public void setAsum(int asum) {
		this.asum = asum;
	}
	
	//toString 은 선택적으로 만들거나 또는 문자열 형태 변
	@Override
	public String toString() {		//String 혀ㅛㅇ
//		return  custno + " " + custname + " " + agrade + " " + asum;
		return String.format("%-10s%-10s%-10s%-10s",custno,custname,agrade,asum);
	}
	
	
	
	
	
	
	
	
	
}
