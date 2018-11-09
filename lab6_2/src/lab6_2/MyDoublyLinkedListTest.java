//***************************
// 파일명: MyDoublyLinkedListTest .java
// 작성자: ...장은애
// 작성일: ...2018.10.4
// 설명:...이중 연결리스트 구현을 준비한다.
//***************************
package lab6_2;

public class MyDoublyLinkedListTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2: 장은애");
		MyDoublyLinkedList list = new MyDoublyLinkedList();//(1) MyDoublyLinkedList 객체를 생성(list라고 하자)
		System.out.println(list.toString());//(2) list를 출력(toString 호출)
		list.addFirst(2);//(3) list에 2를 맨앞삽입
		list.addFirst(-3);//(4) list에 -3을 맨앞삽입
		list.addFirst(0);//(5) list에 0을 맨앞삽입
		System.out.println(list.toString());//(6) list를 출력(toString 호출)
		list.printList();//(7) list를 왕복하며 출력(printList 호출)
	}

}
