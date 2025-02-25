package sub1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



/*
 * 날짜 : 2024/07/24
 * 이름 : 최영진
 * 내용 : HTTP 통신 실습하기
 */
public class HttpGetTest {
	public static void main(String[] args) {
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
													.uri(URI.create("https://google.com"))
													.GET()
													.build();
		
		HttpResponse<String> response;
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("상태코드 : " + response.statusCode());
			System.out.println("응답내용 : " + response.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
