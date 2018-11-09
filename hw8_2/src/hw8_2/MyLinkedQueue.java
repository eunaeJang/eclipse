package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	class Node{
		private int data;
		private Node link;
		
		public Node(int data) {
			this.data = data;
		}
	}
	private int count; //큐에 저장된 원소 수
	private Node front; // front
	private Node rear; //rear

	//생성자 - 인스턴스 변수 초기화
	public MyLinkedQueue(){
		count = 0;
		front = null;
		rear = null;
	}

	// isEmpty
	public boolean isEmpty() {
		return count == 0;
	}


	// enQueue
	public void enQueue(int item) {
		Node n = new Node(item);
		if (isEmpty()) {
			front = n;
			rear = n;
			count++;
		}
		else {
			rear.link = n;
			rear = n;
			count++;
		}
		
		
	}

	//deQueue - 배열이 비어서 삭제할 수 없을 때는 예외 발생(java.util 패키지의 NoSuchElementException 예외를 발생시킬 것)
	public int deQueue() {
		if(isEmpty()) throw new NoSuchElementException();
		else {
			int data = front.data;
			front = front.link;
			count--;
			return data;
		}
	}

	// peek - 배열이 비어서 조회할 수 없을 때는 예외 발생(java.util 패키지의 NoSuchElementException 예외를 발생시킬 것)
	public int peek() {
		if(isEmpty()) throw new NoSuchElementException();
		else {
			return front.data;
		} 
	}

	// size - 큐에 저장된 원소 수를 리턴
	public int size() {
		return count;
	}
}
