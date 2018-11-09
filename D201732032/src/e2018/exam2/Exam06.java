//exam6,7 중요, 또 모든 시험 완벽히 소화를 해야 어려운 알고리즘 수업시간에 배우고 더 어려운 회사에서 내는 알고리즘 문제를 풀 수 있어야함


package e2018.exam2;

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.Collection; 
public class Exam06 { 
	
	static void intersection(Collection<String> c1, Collection<String> c2) {
		c1.retainAll(c2);
	} 

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>(); 
		Collection<String> c2 = new ArrayList<String>(); 
		c1.addAll(Arrays.asList("a", "b", "c", "d"));
		c2.addAll(Arrays.asList("b", "d", "e", "f")); 
		//주의할점! asList 리턴하는 List객체는 immutable함
		//addAll 해주면 mutable함
		intersection(c1, c2); 
		System.out.println(c1.toString());
	}
}