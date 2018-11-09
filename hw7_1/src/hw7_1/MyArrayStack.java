package hw7_1;

import java.util.EmptyStackException;

public class MyArrayStack {
	
	// 정수 배열을 가리킬 변수, top
	private int[] list;
	private int top = -1;
	
	//생성자1 - 배열 크기를 5로 초기화 하는 생성자
	MyArrayStack(){
		list = new int[5];
	}
	
	//생성자2 - 배열 크기를 매개변수로 받는 생성자
	MyArrayStack(int size) {
		list = new int[size];
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(top == -1) return true;
		return false;
	}
	
	//isFull
	public boolean isFull() {
		if(top == list.length-1) return true;
		return false;
	}
	//push
	public void push(int data) {
		if (isFull())
			System.out.println("리스트가 꽉 찼습니다.");
		top++;
		list[top] = data;
	}
	//pop
	public int pop() {
		if (isEmpty())
			throw new EmptyStackException();
		return list[top--];
	}
	//peek
	public int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return list[top];
	}
}
