//***************************
 // 파일명: Main.java
 // 작성자: 장은애
 // 작성일: 2018.8.30
 // 설명:메소드 작성과 호출을 연습한다
 //***************************
package lab1_4;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4:장은애");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 개수 입력:");
		int n = scan.nextInt(); //사용자로부터 정수 개수(n이라고 하자)를 입력받는다.
		int[] array = new int[n]; //입력받을 배열 생성
		System.out.printf("%d개의 정수 입력:",n);
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt(); //사용자로부터 n개의 정수값을 입력받아 크기가 n인 배열에 저장한다.
		}
		System.out.printf("평균 = %.1f" , getAverage(array)); // getAverage 메소드를 호출하여 평균값을 출력
	}
	public static double getAverage(int[] array) { //정수 배열 원소의 평균을 구하는 메소드
		double a=0;
		for(int i=0;i<array.length;i++) {
			a+=array[i]; 
		}
		a=a/array.length; //배열 전체 원소의 평균값을 구한다
		return a;
	}
	
}
