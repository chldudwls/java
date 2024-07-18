package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 30000);
		
		
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			
			//직렬화 객체를 내보내기 위한 보조스트림
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//객체 직렬화(내보내기)
			oos.writeObject(apple);
			
			//스트림 해제
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		System.out.println("종료");
		}
	}

