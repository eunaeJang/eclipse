package lab6_2;

public class MyDoublyLinkedList {
	//이중 연결리스트의 노드를 표현하는 private 노드 클래스(data, rlink, llink 필드)
	private class Node{
		int data;
		Node rlink;
		Node llink;
		
		Node(int data){
			this.data = data;
		}
	}
	// 리스트의 첫번째 노드를 가리킬 변수(head) - null로 초기화 됨
	private Node head = null;
	
	// addFirst - 정수값을 매개변수로 받아 리스트의 맨 앞에 삽입
	public void addFirst(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}
		else {
			temp.rlink =  head;
			head.llink = temp;
			head = temp;
		}
	}
	
	// toString 오버라이드 - 리스트에 저장된 항목 전체를 문자열로 리턴
	@Override
	public String toString() {
		Node temp = head;
		String s="";
		while(temp != null) {
			s+=temp.data+" ";
			temp = temp.rlink;
		}
		return "list = " + s;
	}
	// printList - 리스트를 왕복하며 순방향, 역방향으로 원소를 모두 출력 *** 아래 첨부한 코드 참고
	public void printList() {
		  if(head == null) {
		   System.out.println("( )( )");
		  }
		  else {
		   System.out.print("(");
		   Node temp = head;
		   while(temp.rlink != null) {
				System.out.print(temp.data+" ");
				temp = temp.rlink;
			}
		   System.out.print(temp.data);
		   System.out.print(") ");
		   System.out.print("(");
		   while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.llink;
			}
		   System.out.print(") ");
		   
		  }
	}
}
