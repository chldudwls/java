package sub2;
/*
 * 날짜 : 2024/07/16
 * 이름 : 최영진
 * 내용 : 자바 StringBuiler 클래스 실습하기
 */
public class StringTest {
	public static void main(String[] args) {

		//String 불변(immutable) 특상
		String str = "java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "programing";
		System.out.println("str 주소 : " + System.identityHashCode(str));
	
		System.out.println("str : " + str);
		
		
		//String 의 불변 특성을 개선한 StringBuilder
		
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println("sb 주소 :" + System.identityHashCode(sb));
		
		
		sb.append("programing");
		System.out.println("sb 주소 :" + System.identityHashCode(sb));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
