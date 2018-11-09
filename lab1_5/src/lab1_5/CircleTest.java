//***************************
// 파일명:CircleTest.java
// 작성자:장은애
// 작성일:2018.9.9
// 설명:클래스 작성, 객체 생성과 사용을 연습한다.
//**************************
package lab1_5;
import java.util.Random;
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5:장은애");
		//(1) 원 객체를 생성(circle1)
		Circle circle1 = new Circle();
		//(2) circle1의 반지름을 2로 수정
		circle1.setRadius(2);
		//(3) 원 객체를 생성하되, 1~4 범위의 랜덤 정수값으로 반지름을 초기화하도록 생성(circle2)
		Random random = new Random();
		Circle circle2 = new Circle(random.nextInt(4)+1);
		//(4) circle1를 출력 - toString 호출
		System.out.println(circle1.toString());
		//(5) circle2를 출력 - toString 호출
		System.out.println(circle2.toString());
		//(6) circle1과 circle2가 동일한지를 알아보아 결과를 출력 - equals 호출
		System.out.println(circle1.equals(circle2));
		//(7) circle1의 hashCode를 출력 - hashCode 호출
		System.out.println(circle1.hashCode());
		//(8) circle2의 hashCode를 출력 - hashCode 호출
		System.out.println(circle2.hashCode());
		//(9) circle1의 면적을 출력 - 면적계산 메소드 호출
		System.out.println(circle1.area());
		//(10) circle2의 면적을 출력 - 면적계산 메소드 호출
		System.out.println(circle2.area());
	}

}
