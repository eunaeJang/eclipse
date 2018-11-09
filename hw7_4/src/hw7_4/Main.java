//***************************
 // 파일명:  Main.java
 // 작성자: ...장은애
 // 작성일: ...2018.10.20
 // 설명:...스택 활용을 이해한다.
 //***************************
package hw7_4;
import java.util.Stack;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_4: 장은애");
		
		//- 스택 클래스는 java.util.Stack 을 이용하되, 타입 매개변수를 Double로 하여 스택을 생성할 것
		Stack<Double> stack = new Stack<Double>();
		
		//(1) 한 줄의 후위표기 수식을 입력받는다.
		//모든 토큰(연산자, 피연산자)은 공백으로 분리된다고 가정할 것
		// 피연산자는 실수형이며, 연산자는 이진 연산자 +, -, *, / 만 고려할 것
		Scanner scan = new Scanner(System.in);
		System.out.print("후위표기수식 입력:");
		String s = scan.nextLine();
		String[] list = s.split(" ");
		boolean tf = true;
		double first;
		double second;
		for(String num : list) {
			switch(num) {
			case "+":
				if (stack.empty())
					tf = false;
				else {
					second = stack.pop();
					if (stack.empty())
						tf = false;
					else {
						first = stack.pop();
						stack.push(first + second);
					}
				}
				break;
			case "-":
				if (stack.empty())
					tf = false;
				else {
					second = stack.pop();
					if (stack.empty())
						tf = false;
					else {
						first = stack.pop();
						stack.push(first - second);
					}
				}
				break;
			case "*":
				if (stack.empty())
					tf = false;
				else {
					second = stack.pop();
					if (stack.empty())
						tf = false;
					else {
						first = stack.pop();
						stack.push(first * second);
					}
				}
				break;
			case "/":
				if (stack.empty())
					tf = false;
				else {
					second = stack.pop();
					if (stack.empty())
						tf = false;
					else {
						first = stack.pop();
						stack.push(first / second);
					}
				}
				break;
			default:
				Double tmp = Double.parseDouble(num);
				stack.push(tmp);
				break;
			}

		}
		
		//2) 스택을 이용하여 후위표기 수식의 결과를 구하여 출력한다.
		//수식 계산에서 오류 발생시 잘못된 수식임을 알릴 것
		if (stack.empty())
			System.out.println("잘못된 수식입니다.");
		else {
			Double result = stack.pop();
			if (stack.empty() && tf)
				System.out.println("결과  = " + result);
			else 
				System.out.println("잘못된 수식입니다.");
		}


	}

}
