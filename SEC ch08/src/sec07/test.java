package sec07;

public class test {
	public static void main(String[] args) {
		String data = "감, 귤% 사과/ 배& 감귤";
		String[] name = data.split(",|%|/|&");
		
		for(String str : name) {
			System.out.println("str : " + str);
		}
			
		}
}		
