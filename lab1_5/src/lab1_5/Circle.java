package lab1_5;

public class Circle {
	private int radius; // 필드(private 인스턴스 변수):반지름(radius) - 정수형
	
	//매개변수가 없는 생성자(constuctor) - 반지름을 1로 초기화
	public Circle(){
		radius = 1;
	}
	//  반지름을 매개변수로 받아 초기화 하는 생성자(consturctor)
	public Circle(int radius) {
		this.radius = radius;
	}
	// 반지름 getter/setter
	public int getRadius() {
		return radius;
	} 
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//면적을 계산하여 리턴하는 메소드 - 원주율은 3.14 또는 Math 클래스의 상수 이용
	public double area() {
		return radius*radius*3.14;
	}
	// equals/hashCode 오버라이드 - 반지름이 동일하면 동일한 객체로 간주하도록
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle circle = (Circle)obj;
			return radius==circle.radius;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return 31+radius;
	}
	//  toString 오버라이드 - 반지름 정보를 문자열로 리턴
	@Override
	public String toString() {
		return "Circle [radius="+radius+"]";
	}
	
}
