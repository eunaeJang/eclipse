package hw8_1;

import java.util.NoSuchElementException;

class MyCircularQueue{
	private int[] array; // int형 배열을 가리킬 변수
	private int arraySize; //큐의 용량(배열 크기)
	private int count; //큐에 저장된 원소 수
	private int front; // front
	private int rear; //rear

	//생성자 - 배열 크기를 매개변수로 받고, 인스턴스 변수 초기화
	public MyCircularQueue(int n){
		array = new int[n];
		arraySize = n;
		count = 0;
		front = 0;
		rear = 0;
	}

	// isEmpty
	public boolean isEmpty() {
		return count == 0;
	}

	// isFull
	public boolean isFull() {
		return count == arraySize;
	}

	// enQueue - 배열이 가득차서 저장할 수 없을 때는 에러 메시지를 출력함. 예외 발생할 필요 없음
	public void enQueue(int item) {
		if (isFull()) System.out.println("큐가 가득차서 삽입할 수 없습니다.");
		else {
			rear = (rear + 1) % arraySize;
			array[rear] = item;
			count++;
		}
	}

	//deQueue - 배열이 비어서 삭제할 수 없을 때는 예외 발생(java.util 패키지의 NoSuchElementException 예외를 발생시킬 것)
	public int deQueue() {
		if(isEmpty()) throw new NoSuchElementException();
		else {
			front = (front + 1) % arraySize;
			count--;
			return array[front];
		}
	}

	// peek - 배열이 비어서 조회할 수 없을 때는 예외 발생(java.util 패키지의 NoSuchElementException 예외를 발생시킬 것)
	public int peek() {
		if(isEmpty()) throw new NoSuchElementException();
		else {
			return array[(front + 1) % arraySize];
		} 
	}

	// size - 큐에 저장된 원소 수를 리턴
	public int size() {
		return count;
	}


}