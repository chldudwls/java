package sub2;
/*
 * 날짜: 2024/6/28
 * 이름: 최영진
 * 내용: 자바 출력 연습
 *
 */
public class PrintTest {
public static void main(String[] args) {
	System.out.println("hello java");
	System.out.println("hello korea");
	System.out.println("hello busan");

// 한줄출력
System.out.print("welcome"); // ln(줄바꿈) 처리가 안되었기 때문에 그다음 출력문이 이어서 출력됨
System.out.print("java");

//개행처리
System.out.println();//줄바꿈
System.out.print("welcome\n"); // \n 이스케이프 문자로 줄바꿈(개행)처리
System.out.println("korea~");



}
}