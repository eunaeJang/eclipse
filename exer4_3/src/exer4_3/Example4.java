package exer4_3;

public class Example4 {

	int a = 3, b = 4;

	void doSomethoing() { 
		new InnerClass().swap();
		System.out.printf("%d %d\n", a, b);
	} 

	class InnerClass{
		void swap() {
			int tmp;
			tmp = a;
			a = b;
			b = tmp;	
		}
	}

	public static void main(String[] args) { 
		new Example4().doSomethoing(); 
	}


}
