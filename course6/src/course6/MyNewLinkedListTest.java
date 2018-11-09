package course6;

//MyNewLinkedList 클래스를 테스트하는 클래스
public class MyNewLinkedListTest {
	public static void main(String[] args) {
		System.out.println("course6: 장은애");
		MyNewLinkedList list=new MyNewLinkedList();

		System.out.println("list = " + list); // 출력:
		list.addFirst(1);
		System.out.println("list = " + list); // 출력: 2
		list.addFirst(2);
		System.out.println("list = " + list); // 출력: 2 1
		list.addLast(33);
		System.out.println("list = " + list); // 출력: 2 1 33
		list.addLast(44);
		System.out.println("list = " + list); // 출력: 2 1 33 44

		MyNewLinkedList list2 = new MyNewLinkedList();
		list2.addLast(55);
		System.out.println("list2 = " + list2); // 출력: 55
		list2.addLast(66);
		System.out.println("list2 = " + list2); // 출력: 55 66

	}
}



//선형 리스트를 단순 연결 리스트로 구현한 클래스
//기존 클래스에 마지막 노드를 가리키는 변수를 추가함
class MyNewLinkedList {
	private class Node {
		int data;
		Node link;
		Node(int item) {
			data = item;
			link = null;
		}
	}

	private Node head = null; // 리스트의 첫번째 노드를 가리킴
	private Node last = null; // 리스트의 마지막 노드를 가리킴

	// (1) 첫번째 원소 item을 삽입하는 메소드 - 수행 시간은 O(1) 이어야 함
	public void addFirst(int item) {
		Node n = new Node(item);
		if(head == null) {
			head = n;
			last = n;
		}
		else {
			n.link = head;
			head = n;
		}
	}

	// (2) 마지막 원소 item을 삽입하는 메소드 - 수행 시간은 O(1) 이어야 함
	public void addLast(int item) {
		Node n = new Node(item);
		if (last == null) {
			head = n;
			last = n;
		}
		else {
			last.link = n;
			last = n;
		}


	}

	@Override
	public String toString() {
		String result = "";
		Node tmp = head;
		while(tmp != null) {
			result += tmp.data + " ";
			tmp = tmp.link;
		}
		return result;
	}
}