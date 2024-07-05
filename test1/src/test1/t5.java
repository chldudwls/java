package test1;

public class t5 {
public static void main(String[] args) throws Exception{
	outter: for(char upper='A'; upper<='Z';upper++) {
		for(char lower='a';lower<='z'; lower++) {
			System.out.println(upper + "-" + lower);
			if(lower=='g') {
				break outter;
				
			}
		}
	}
	System.out.println("프로그램 실행 종료");
	
	for(int i=1 ; i <= 10; i++) {
		if(i%2 != 0) {
			continue;
		}
		System.out.println(i+" ");
		
	} 
}
}
