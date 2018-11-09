package lab7_1;

import java.util.Stack;
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1 : 장은애");
		int menu;
		Stack<Integer> stack = new Stack<Integer>();
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:합계 5:종료 -->");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("정수 입력:");
				int data = scan.nextInt();
				stack.push(data);
				break;
			case 2:
				if (stack.empty()) {
					System.out.println("스택이 비어있습니다.");
				}
				else {
					System.out.print("스택에서 삭제 ");
					System.out.println(stack.pop());
				}
				break;
			case 3:
				System.out.print("스택 조회 ");
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.print("스택 모두 삭제한 후 합계");
				int sum = 0;
				while(!stack.empty()) {
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