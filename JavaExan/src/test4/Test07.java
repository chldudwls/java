package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		
		for(int count = 1; count <= 5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	
	public static Set<Integer> makeLotto() {
		Set<Integer> lottoset = new HashSet<>();
		for(;;) {// ;;는 무한루프
			
		int num = (int) Math.ceil(Math.random()*45);
		
		lottoset.add(num);
		
		if(lottoset.size() == 6) {
			break;
		}
	}
		Set<Integer> treeSet = new TreeSet<>(lottoset);
		
		return treeSet;
	}
}
