package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	
	private class Node{
		int data;
		Node link;
		Node(int data){
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
	public void push(int data) {
		Node temp = new Node(data);
		temp.link = top;
		top = temp;
		
	}
	//스택에서 삭제(pop)하여 리턴된 값을 출력
	public int pop() {
		if (top == null)
			throw new EmptyStackException();
		int popNode = top.data;
		top = top.link;
		return popNode;
	}
	//스택에서 조회(peek)하여 리턴된 값을 출력
	public int peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}
}
