package User2;

public class User2VO {
	
	private String uid;
	private String name;
	private String birth;
	private String addr;
	@Override
	public String toString() {
		return "User2VO [uid=" + uid + ", name=" + name + ", birth=" + birth + ", addr=" + addr + "]";
	}
	public User2VO(){
		
	}
	public User2VO(String uid, String name, String birth, String addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.birth = birth;
		this.addr = addr;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
