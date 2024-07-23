package sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/*
 * 날짜 : 2024/07/23
 * 이름 : 최영진
 * 내용 : 컬렉션 스트림 맵 실습하기
 */
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class StreamMapTest {
	public static void main(String[] args) {
		
		// Person 리스트 생성
		List<Person> people = new ArrayList<>();
		people.add(new Person("김춘추", 230));
		people.add(new Person("김유신", 31));
		people.add(new Person("장보고", 22));
		people.add(new Person("강감찬", 21));
		people.add(new Person("이순신", 24));
	
		
		//Map 스트림
		List<String> names = people.stream()
				.map((person)->{
					return person.getName(); //새로운 데이터 변환해서 다음 스트림으로 전달
				})
				.collect(Collectors.toList()); // 스트림으로 전송된 데이터 취합해 컬렉션으로 변환
		System.out.println(names);
				
		
		// flatMap스트림
		
		List<List<String>> lists = List.of(
							Arrays.asList("apple","banana"),
							Arrays.asList("cherry","grape"),
							Arrays.asList("orange","mango")
				);
		System.out.println(lists);
		
		List<String> fruits = lists.stream()
				.flatMap((list) -> {
					return list.stream();
				})
				.collect(Collectors.toList());
		System.out.println(fruits);
		
		
	}
}
