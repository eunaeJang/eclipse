package lecture05;

class Parent {
	public void method1() {
		System.out.println("Parent method1()"); 
	} 
} 
class ChildOne extends Parent {
	@Override 
	public void method1() {
		System.out.println("ChildOne method1()"); 
	} 
}
class ChildTwo extends Parent {
	@Override public void method1() {
		System.out.println("ChildTwo method1()");
	} 
} 
class ChildThree extends Parent {

} 
public class Polymorphism2 {
	static void doSomething(Parent parent) { 
		parent.method1(); 
		// 다형성 호출
	}
	public static void main(String[] args) 
	{ 
		ChildOne obj1 = new ChildOne(); 
		ChildTwo obj2 = new ChildTwo();
		ChildThree obj3 = new ChildThree(); 
		obj1.method1(); 
		// 다형성 호출이 아님
		doSomething(obj1);
		doSomething(obj2);
		doSomething(obj3);
	}
}
