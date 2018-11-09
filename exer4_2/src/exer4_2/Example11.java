package exer4_2;

import java.util.Arrays; 

public class Example11 {
	static void printSum(int... a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		System.out.println(String.format("배열:%s 합계:%d", Arrays.toString(a), sum));
	} 

	public static void main(String[] args) {
		int[] a = new int[] { 21, 33, 17, 40, 5, 13 }; 
		printSum( 11, 13, 17, 20 );
		printSum( a );
	}
}