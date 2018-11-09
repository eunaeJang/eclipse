//***************************
//파일명:  MyArrayListTest.java
//작성자: ...장은애
//작성일: ...2018.9.13
//설명:...순차자료구조 구현에 앞서 ArrayList 연산을 이해한다.
//***************************

package hw5_1;
import java.util.Scanner;
import java.util.ArrayList;
public class MyArrayListTest {
	public static void main(String[] args) {
		System.out.println("lab5_장은애");

		Scanner input = new Scanner(System.in);

		// (1) Integer를 타입 매개변수로 하여 ArrayList 객체를 생성(list라는 이름의 변수에 저장)
		MyArrayList list = new MyArrayList(); // 완성하세요.

		// (2) 사용자에게 메뉴를 반복 제공하고 7을 입력하면 반복 종료
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print(" 1:인덱스조회 2:전체조회 3:길이조회 4:삽입 5:인덱스삽입 6:인덱스삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			//1 선택시, 사용자로부터 인덱스를 입력받아 list에서 값을 조회하여 출력(get 호출)
			case 1:
				System.out.println("인덱스 위치의 원소값을 조회합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();
				element = list.get(index)  ; // 완성하세요.
				System.out.println(element);  
				break;
			//2 선택시, list의 전체 내용을 출력(toString 호출)
			case 2:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(        list.toString()              );   // 완성하세요.
				break;
			//3 선택시, list의 길이를 출력(size 호출)	
			case 3:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list. size()  ;  // 완성하세요.
				System.out.println(size);
				break;
			//4 선택시, 사용자로부터 정수값을 입력받아 list에 삽입(add 호출)	
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.add(element)                               ;  // 완성하세요.
				break;
			//5 선택시, 사용자로부터 인덱스와 정수값을 입력받아 list에 삽입(add 호출) ** 주의: 반드시 인덱스, 정수값 순서로 입력받을 것
			case 5:
				System.out.println("인덱스 위치에 원소를 삽입합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();    
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list. add(index,element)                                   ;    // 완성하세요.
				break;
			//6 선택시, 사용자로부터 인덱스를 입력받아 list에서 값을 삭제하여 출력(remove 호출)
			case 6:
				System.out.println("인덱스 위치의 원소를 삭제합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt(); 
				element = list.remove(index)    ;  // 완성하세요.
				System.out.println(element);
				break;
			//7선택 시, 종료	
			case 7:
				System.out.println("종료합니다.");   
				break;
			//1~7외 선택시, 메뉴 선택 오류: 다시 선택하세요. 출력
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}
}
