//***************************
// 파일명:MyArrayListTest.java
// 작성자:장은애
// 작성일:2018.9.10
// 설명:클래스 작성, 객체 생성과 사용을 연습한다.
//**************************
package lab1_6;

public class MyArrayListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("lab1_6:장은애");
		//(1) MyArrayList 객체를 생성(list라고 하자)
		MyArrayList list = new MyArrayList();
		//(2)list를 출력
		System.out.println(list.toString());
		//(3) list에 2를 삽입
		list.add(2);
		//(4) list에 -3을 삽입
		list.add(-3);
		//(5) list에 0을 삽입
		list.add(0);
		//(6) list를 출력
		System.out.println(list.toString());
	}
}
