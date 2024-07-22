package sec01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override//Object의 equals()메소드 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member tarrget){//obj가 Member 타입인지 검사하고 타입 변환 후 taget 변수에 대입
			if(id.equals(tarrget.id)) {// id 문자열이 같은지 비교
				return true;
				
			}
		}
		return false;
	}
}
