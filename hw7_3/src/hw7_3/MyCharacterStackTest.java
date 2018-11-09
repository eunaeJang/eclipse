//***************************
// 파일명: MyCharacterStackTest.java
// 작성자: ...장은애	
// 작성일: ...2018.10.20
// 설명:...스택 활용을 이해한다.
//***************************
package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

//스택 클래스(MyCharacterStack)는 일반적인 문자 스택으로 사용하도록 기본 연산(isEmpty, push, pop, peek 등)만 제공하고,  
//메인 클래스 main 메소드에서 이 스택을 활용하여 괄호 검사를 해야 합니다.
//연결리스트를 이용하여 구현한 문자 스택 클래스
class MyCharacterStack{

	private class Node{
		char data;
		Node link;
		
		Node(char data){
			this.data = data;
		}
	}

	private Node top = null;
	//비어있으면 true 리턴
	public boolean isEmpty() {
		if (top == null) return true;
		return false;
	}
	//사용자로부터 정수값을 하나 입력받아 스택에 삽입(push)
	public void push(char data) {
		Node temp = new Node(data);
		temp.link = top;
		top = temp;

	}
	//스택에서 삭제(pop)하여 리턴된 값을 출력
	public char pop() {
		char popNode = top.data;
		top = top.link;
		return popNode;
	}
	//스택에서 조회(peek)하여 리턴된 값을 출력
	public char peek() {
		return top.data;
	}

}

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_3:장은애");

		MyCharacterStack stack = new MyCharacterStack();
		// pop한 symbol의 변수 pop
		char pop;
		//잘못된 것을 알려주는 변수 tf
		boolean tf = true;
		
		//(1) 한 줄의 수식을 입력받는다.
		Scanner scan = new Scanner(System.in);
		System.out.print("수식 입력: ");
		String s = scan.nextLine();
		
		//괄호의 종류는 두가지만 허용 : (), <>
		//나머지 문자는 모두 무시하면 됨

		//스택(MyCharacterStack)을 이용하여 수식의 괄호가 올바르게 사용되었는가를 검사하여 결과를 알려준다.
	    //(잘못된 괄호 수식이더라도 오류 발생하고 끝내면 안됨)
		if (s.length() == 0)
			tf = false;
		for(int i = 0; i < s.length(); i++) {
			char symbol = s.charAt(i);
			switch(symbol) {
			case '(':
			case '<':
				stack.push(symbol);
				break;
			case ')':
			case '>':
				if (stack.isEmpty()) {
					tf = false;
					break;
				}
				else {
					pop = stack.pop();
					if ((pop == '(' && symbol != ')') || (pop == '<' && symbol != '>')){
						tf = false;
					}
					else break;
				}
			}
		}

		if(stack.isEmpty() && tf)
			System.out.println("올바른 괄호 수식입니다.");
		else 
			System.out.println("잘못된 괄호 수식입니다.");

	}
}





