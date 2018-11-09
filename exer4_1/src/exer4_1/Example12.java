package exer4_1;

import java.util.Arrays; 

class Data3 implements Comparable<Data3> {
	int a; 
	
	public Data3(int a) { 
		this.a = a; 
	} 
	
	@Override public int compareTo(Data3 data) {
		if (this.a > data.a)
			return 1;
		else if (this.a < data.a)
			return -1;
		else
			return 0;
		
	}
	
	@Override public String toString() {
		return String.format("%s",a);
	}
}

public class Example12 {
	public static void main(String[] args) { 
		Data3[] a = new Data3[] { new Data3(3), new Data3(5), new Data3(1) }; 
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); 
	}
}
