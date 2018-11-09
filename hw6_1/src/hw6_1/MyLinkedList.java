package hw6_1;

public class MyLinkedList {
	//단순 연결리스트의 노드를 표현하는 노드 클래스
	class Node{
		int data;
		Node link;
		
		Node(int data){
			this.data=data;
		}
	}
	//리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
	private Node head = null;
	//size - 리스트의 길이를 리턴
	public int size() {
		int size=0;
		Node temp = head;
		while(temp != null) {
			temp = temp.link;
			size += 1;
		}
		return size;
	}
	//맨앞 삽입 메소드(addFirst) - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
	public void addFirst(int data) {
		Node temp = new Node(data);
		temp.link=head;
		head=temp;
	}
	//addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입 
	public void addLast(int data) {
		Node temp = new Node(data);
		if(head == null) {
			this.head = temp;
		}
		else {
			Node pre = head;
			while(pre.link !=null) {
				pre = pre.link;
			}
			pre.link = temp;
		}
	}
	//removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
	public int removeFirst() {
		Node removeNode = head;
		Node temp = head.link;
		head = temp;
		return removeNode.data;
	}
	//removeLast - 리스트의 마지막 원소(정수값)을 삭제하여 리턴  
	public int removeLast() {
		Node pre, temp, last;
		if(head.link == null) {
			last = head;
			head = null;
			return last.data;
		}
		else {
			pre = head;
			temp = head.link;
			while(temp.link !=null) {
				pre = temp;
				temp = temp.link;
			}
			last = pre.link;
			pre.link = null;
			return last.data;
		}
		
	}
	//toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
	@Override
	public String toString() {
		Node temp = head;
		String s="";
		while(temp != null) {
			s+=temp.data+" ";
			temp = temp.link;
		}
		return "list = " + s;
	}

}
