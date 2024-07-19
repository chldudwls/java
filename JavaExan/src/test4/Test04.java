package test4;

public class Test04 {
	public static void main(String[] args) {
		
			
	     String filename = "HelloWorld.java";
	        
	        // 파일명에서 마지막 점(.)의 인덱스를 찾습니다.
	        int idx = filename.lastIndexOf(".");
	        
	        // 파일명과 확장자를 분리합니다.
	        String title = filename.substring(0, idx);
	        String ext = filename.substring(idx + 1);
	        
	        // 결과를 출력합니다.
	        System.out.println("파일명 : " + title);
	        System.out.println("확장자 : " + ext);
	        
	        
	        String strScores = "60, 75, 90, 59, 100";
	        String[] scores = strScores.split(", ");
	        
	        int total = 0;
	        
	        for (String score : scores) {
	            total += Integer.parseInt(score.trim());
	        }
	        System.out.println("총점 : " + total);
	    }
	}
