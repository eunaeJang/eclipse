package e2018.exam2;

import java.util.Arrays;

public class Exam02 { 
	static String toString(Person[] a) { 
		return Arrays.toString(a); 
		//String.format("[{\"%s\", %d}, {\"%s\", %d}]", a[0].name, a[0].age, a[1].name, a[1].age);
		
	} 

	public static void main(String[] args) { 
		Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 21) }; 
		System.out.println(toString(a)); 
	} 
}