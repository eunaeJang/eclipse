//***************************
// 파일명: MyCircularQueueTest.java
// 작성자: ...장은애
// 작성일: ...2018.11.2
// 설명:...배열을 이용한 원형 큐 구현을 연습한다.
//***************************
package hw8_1;

import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw8_1: 장은애");
		//(1) 크기가 5인 MyCircularQueue 객체를 생성
		MyCircularQueue queue = new MyCircularQueue(5);
		int menu;
		Scanner scan = new Scanner(System.in);
		//(2) 메뉴 6을 선택할 때까지 다음과 같은 메뉴를 반복하여 제공
		do{
			System.out.print("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료--> ");
			menu = scan.nextInt();
			
			switch(menu) {
			//1 선택시, 사용자로부터 정수값을 하나 입력받아 큐의 맨 뒤에 삽입(enQueue)
			case 1:
				System.out.print("정수 입력: ");
				int item = scan.nextInt();
				queue.enQueue(item);
				break;
			//2 선택시, 큐의 맨 앞 원소를 삭제하여(deQueue) 출력
			case 2:
				System.out.println(queue.deQueue());
				break;
			//3 선택시, 큐의 맨 앞 원소를 조회하여(peek) 출력
			case 3:
				System.out.println(queue.peek());
				break;
			//4 선택시, 큐에 저장된 원소 수를 알아내어(size) 출력
			case 4:
				System.out.println(queue.size());
				break;
			//5 선택시, 큐가 텅 빌때까지 원소를 하나씩 삭제하여(deQueue) 모두 출력
			case 5:
				while(!queue.isEmpty()) {
					System.out.println(queue.deQueue());
				}
				break;
			}
		}while(menu != 6);
	}

}
