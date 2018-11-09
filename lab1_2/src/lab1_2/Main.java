/***************************
이름:장은애
작성일:2018.8.28
주제:
- 사용자로부터 10개의 정수값을 입력받아 배열에 저장한다.
- 정수값 하나를 입력받아 그 정수값이 배열의 어느 위치에 저장되어 있는지 배열 원소를 하나씩 차례대로 검색하여 인덱스를 출력한다.
- 만일 찾는 정수값이 배열에 없으면 -1을 출력한다.
 ***************************/

package lab1_2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_2:장은애");
		int[] array = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하시오.");
		for(int i=0;i<10;i++) {

			int a = scan.nextInt();
			array[i] = a;
		}
		System.out.print("정수를 입력하시오.");
		int b = scan.nextInt();
		for(int j=0;j<10;j++) {
			if (b==array[j]) {
				System.out.print("인덱스:"+j);
				break;
			}
			else {
				if (j==9)
					System.out.print(-1);
				else
					continue;
			}
		}

	}

}
