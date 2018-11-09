package e2018.exam2;
//inner class로 만드는 이유
//어떤 클래스가 다른 클래스의 멤버변수를 열심히 사용하는 경우 간결해짐
class World {
	String message = "안녕하세요";
	
	public void doSomething() {
		Hello hello = new Hello(); 
		hello.say();
	} 
	
	class Hello {
		
		public void say() { 
			System.out.println(message); 
		}
		
	} 
}

public class Exam12 { 
	public static void main(String[] args) {
		World world = new World(); 
		world.doSomething(); 
	} 
}
