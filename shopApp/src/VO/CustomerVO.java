package VO;

public class CustomerVO {
	private String custId;
	private String name;
	private String hp;
	private String addr;
	private String rdate;
	
	public CustomerVO() {
	}
	public CustomerVO(String custid, String name, String hp, String addr, String rdate) {
		this.custId = custid;
		this.name = name;
		this.hp = hp;
		this.addr = addr;
		this.rdate = rdate;
	}
	@Override
	public String toString() {
		return "CustomerVo [custid=" + custId + ", name=" + name + ", hp=" + hp + ", addr=" + addr + ", rdate=" + rdate
				+ "]";
	}
	public String getCustid() {
		return custId;
	}
	public void setCustid(String custid) {
		this.custId = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	
	
	
}
