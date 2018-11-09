package exer2_1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example01 e = new Example01();
		e.addData(4);
		System.out.println(Arrays.toString(e.obj));
		System.out.println(e.findIndex(2));
		System.out.println(e.findIndex("2"));
	}

}
