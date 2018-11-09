/*
 * 이름:장은애
 * 작성일:2018.9.4
 * 파일이름:Main.java
 * 주제:최소값 검색과 교환 
 */
package course1;

import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("course1:장은애");
		Random random = new Random();
		int[] array = new int[10];
		for(int i=0;i<10;i++) {
			array[i] = random.nextInt(101);
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		int min=array[0];
		int index=0;
		for(int j=1;j<10;j++) {
			if (array[j]<min) {
				min = array[j];
				index=j;
			}
		}
		System.out.println("최소값 = "+ min);
		System.out.println("최소값 인덱스 = "+ index);
		swap(array,index,0);

		for(int l=0;l<10;l++) {
			System.out.print(array[l] + " ");
		}


	}
	public static void swap(int[] array,int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp; 
	}


}
