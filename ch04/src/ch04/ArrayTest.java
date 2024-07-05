package ch04;
	/*
	 * 날짜: 2024/7/2
	 * 이름: 최영진
	 * 내용: 배열 실습하기
	 *	 
	 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 배열
		int[] arr1 = {1, 2, 3, 4, 5}; //변수 = 데이터(배열)
		char[] arr2 = {'A','B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"}; //각각의 데이터를 원소라 말함
		
		// 배열 원소
		System.out.println("arr1 1번쨰 원소 : " + arr1[0]);
		System.out.println("arr1 2번쨰 원소 : " + arr1[1]);
		System.out.println("arr1 3번쨰 원소 : " + arr1[2]);
		System.out.println("arr2 1번쨰 원소 : " + arr2[0]);
		System.out.println("arr2 3번쨰 원소 : " + arr2[2]);
		System.out.println("arr3 1번쨰 원소 : " + arr3[0]);
		System.out.println("arr3 4번쨰 원소 : " + arr3[3]);
		System.out.println("arr3 5번쨰 원소 : " + arr3[4]);
		
		// 배열 길이 - 배열 원수 갯수
		System.out.println("arr1 배열 길이 : " + arr1.length);
		System.out.println("arr1 배열 길이 : " + arr2.length);
		System.out.println("arr1 배열 길이 : " + arr3.length);
		
		// 배열 반복문
		for(int i=0; i<arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
			System.out.println();//개행
		for(char ch : arr2) {
			System.out.print(ch + " ");
		}
			System.out.println();
		for(String ct : arr3) {
			System.out.print(ct + " ");
		}
		System.out.println();
		// 1차원 배열 - 선형
		int[] scores = {80, 60, 78, 62, 92}; //복수형 영어로 (s)
		
		int total = 0;
		 for(int score : scores ) {
			 total += score;
		 }
		System.out.println("score 배열의 총합 : " + total);
		
		
		// 2차원 배열
		int[][] arr2d = {{1 , 2, 3, 4},	//0,1,2,3
						{ 5 , 6, 7, 8}, //1
						{ 9 ,10,11,12}};//2
			for(int a=0 ; a<3 ; a++) {
				for(int b=0 ; b<4 ; b++) {
			System.out.println("arr2d[" + a + "][" + b + "] : " + arr2d[a][b]);
				}
			}
		// 3차원 배열
				
			
	
			
			int[][][] arr3d = {{{1,  2,  3},
								{4,  5,  6},
								{7,  8,  9}},
							   {{10,11, 12},
								{13,14, 15},
								{16,17, 18}},
							   {{19,20, 21},
								{22,23, 24},
								{25,26,27}}};
			for(int a=0 ; a<3 ; a++) {
				for(int b=0 ; b<3 ;b++) {
					for(int c=0 ; c<3 ; c++) {
						System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c]);
					}
				}
			}
	}
}
