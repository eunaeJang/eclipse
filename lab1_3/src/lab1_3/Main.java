/*
 * 파일명:Main.java
 이름:장은애
 작성일:2018.8.30
 설명:랜덤 넘버 생성과 반복문을 연습한다
 */
package lab1_3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3:장은애");
		Random random = new Random(); //Random객체 생성
		System.out.print("랜덤 넘버 =");
		int[] array = new int[10]; //랜덤 숫자가 들어갈 배열 생성
		int[] count = new int[] {0,0,0,0}; //숫자를 셀 배열 생성, 0으로 초기화
		for(int i=0;i<10;i++) {
			array[i] = (random.nextInt(4)+1); //1~4범위의 랜덤 넘버 0개를 생성
			System.out.print(" "+array[i]);
		}
		System.out.print("\n");
		for(int j=0;j<10;j++) {
			switch(array[j]) {
			case 1:
				count[0]++; //array[j]가 1이면 count[0]에 1을 더한다
				break;
			case 2:
				count[1]++; //array[j]가 2이면 count[1]에 1을 더한다
				break;
			case 3:
				count[2]++; //array[j]가 3이면 count[2]에 1을 더한다
				break; 
			case 4:
				count[3]++; //array[j]가 4이면 count[3]에 1을 더한다
				break;
			}
		}
		for(int i=0;i<4;i++) {
			System.out.printf("%d의 갯수 = %d\n", i+1,count[i]); //각 넘버가 몇개씩 생성되었는가 출력 
		}
	}

}
