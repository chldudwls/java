package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
/*
 * 날짜 : 2024/07/24
 * 이름 : 최영진
 * 내용 : 소켓 통신 실습하기
 */
public class SocketClient {
	public static void main(String[] args) {
		
		System.out.println("[Client]");
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("연결 요청...");
			socket.connect(new InetSocketAddress("127.0.0.1", 50001));//127.0.0.1 에 127=시스템 주소
						 											//System IP Address loop back localhost					
			System.out.println("연결 성공...");
			
			
			//데이터 송신 (Client -> Server)
			OutputStream os = socket.getOutputStream();
			String message = "Hello Server";
			byte[] messageBytes = message.getBytes();

			os.write(messageBytes);
			os.flush();
			
			System.out.println("데이터 송신 완료...");
			//데이터 수신 (Client <- Server)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readbytes = is.read(bytes);
			
			String sendMessge = new String(bytes, 0, readbytes, "UTF-8");
			System.out.println(sendMessge);
			
			System.out.println("데이터 수신 완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Client 종료....");
	}
}
