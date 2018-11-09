package course4;

class Node {
	int data;
	Node link;
	Node(int data) {
		this.data = data;
		this.link = null;
	}
}

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("course4 : 장은애 ");

		// 선형 리스트 list = (22, 33, 44, 55, 66) 를 단순 연결 리스트로 표현
		Node n1 = new Node(22);
		Node n2 = new Node(33);
		Node n3 = new Node(44);
		Node n4 = new Node(55);
		Node n5 = new Node(66);
		n1.link = n2;
		n2.link = n3;
		n3.link = n4;
		n4.link = n5; 
		Node list = n1;
		n1 = n2 = n3 = n4 = n5 = null;

		// 리스트를 출력
		System.out.println("초기 상태:");
		printList(list);

		// (1) 리스트의 첫번째 원소를 삭제
		Node temp1 = list.link;
		list = temp1;


		// 리스트를 출력
		System.out.println("첫번째 원소 삭제 후:");
		printList(list);

		// (2) 리스트의 맨 앞에 11을 삽입
		Node temp2 = new Node(11);
		temp2.link = list.link;
		list = temp2;




		// 리스트를 출력
		System.out.println("맨 앞에 11 삽입 후:");
		printList(list);

		// (3) 리스트의 마지막 원소 값을 1 증가(+1)
		Node temp3 = list;
		while(temp3.link != null) {
			temp3 = temp3.link;
		}
		temp3.data += 1;




		// 리스트를 출력
		System.out.println("마지막 원소값 1 증가 후:");
		printList(list);

		// (4) 리스트의 두번째 원소를 삭제

		Node temp4 = list.link.link;
		list.link = temp4;




		// 리스트를 출력
		System.out.println("두번째 원소 삭제 후:");
		printList(list);
	}

	// list가 가리키는 단순 연결 리스트의 원소들을 모두 출력하는 메소드
	private static void printList(Node list) {
		Node temp = list;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println();
	}
}
