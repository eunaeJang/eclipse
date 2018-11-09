package e2018.exam1;

public class Exam09 {
	static String reverse(String path) { 
		// 구현할 부분
		String s ="";
		for (int i = path.length() -1 ; i >= 0; i--) 
	         s += path.charAt(i);
		return s;
	} 
	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello world" };
		for (String s : a)
			System.out.println(reverse(s));
	}
}

