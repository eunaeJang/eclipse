//***************************
// 파일명: MyArrayStackTest.java
// 작성자: ...장은애
// 작성일: ...2018.10.19
// 설명:...스택을 순차 자료구조로 구현한다.
//***************************

package hw7_1;
import java.util.Scanner;
public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1:장은애");
		//(1) 용량(배열 크기)이 5인 MyArrayStack 객체 생성(stack이라고 부르자.)
		MyArrayStack stack = new MyArrayStack();
		//(2) 메뉴 5를 선택할 때까지 다음과 같은 메뉴를 반복하여 제공
		//1:삽입 2:삭제 3:조회 4:합계 5:종료
		int menu;
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:합계 5:종료 --> ");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			switch(menu) {
			//1 선택시 사용자로부터 정수값을 하나 입력받아 스택에 삽입(push)
			case 1:
				System.out.println("정수 입력:");
				int data = scan.nextInt();
				stack.push(data);
				break;
			//2 선택시 스택에서 삭제(pop)하여 리턴된 값을 출력
			case 2:
				System.out.print("스택에서 삭제 ");
				System.out.println(stack.pop());
				break;
			//3 선택시 스택에서 조회(peek)하여 리턴된 값을 출력
			case 3:
				System.out.print("스택 조회 ");
				System.out.println(stack.peek());
				break;
			//4 선택시 스택이 텅 빌때(isEmpty)까지 모두 삭제(pop)하여 합을 출력
			case 4:
				System.out.print("스택 모두 삭제한 후 합계 = ");
				int sum = 0;
				while(!stack.isEmpty()) {
					sum += stack.pop();
				}
				System.out.println(sum);
				break;
			default:
				System.out.println("메뉴 다시 누르기");
				break;
			}

		}while(menu != 5);
	}

}
