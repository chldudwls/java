package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜 : 2024/07/17
 * 이름 : 최영진
 * 내용 : Map 실습하기
 * 
 */
public class MapTest {
	public static void main(String[] args) {
		
		// Map 생성하기
		// HashMap<K키, V벨류>
		HashMap<Character, String> map = new HashMap<>();
		
		// 데이터 입력
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);

	
		// map 크기
		System.out.println("map 크기 : "+map.size());
		
		//데이터 출력
		System.out.println("map A값 : " + map.get('A'));
		System.out.println("map B값 : " + map.get('B'));
		System.out.println("map C값 : " + map.get('C'));
	
		// map 반복문
		for(char k : map.keySet()) {// map의 key를 Set으로 반복
			System.out.println(k + " : " + map.get(k));
		}

		
		//ArrayList와 응용
		
		Map<Integer, Apple> map1 = new HashMap<>();
		map1.put(101,new Apple("한국", 3000));
		map1.put(102,new Apple("중국", 2000));
		map1.put(103,new Apple("일본", 1000));
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(201,new Apple("미국", 3000));
		map2.put(202,new Apple("영국", 2000));
		map2.put(203,new Apple("호주", 1000));
		
		Map<Integer, Apple> map3 = new HashMap<>();
		map3.put(301,new Apple("대만", 3000));
		map3.put(302,new Apple("태국", 2000));
		map3.put(303,new Apple("인도", 1000));
		
		List<Map<Integer, Apple>> applemaps = new ArrayList<>();
		
		applemaps.add(map1);
		applemaps.add(map2);
		applemaps.add(map3);
	
		//한국사과
		Map<Integer, Apple> resultMaps = applemaps.get(0);
		Apple koreaApple = resultMaps.get(101);
		System.out.println(resultMaps.get(101));
		
		System.out.println();
		applemaps.get(0).get(102).show();
		
		//호주사과
		applemaps.get(1).get(203).show();
		
		//태국사과
		applemaps.get(2).get(302).show();
	}
}
