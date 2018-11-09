package exer1_4;

public class Example04 {
	static String removeO(String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'o')
				continue;
			if(s.charAt(i) == 'O')
				continue;
			result += s.charAt(i);
		}
		return result;	
	}
	public static void main(String[] args) { 
		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" }; 
		for (String s : a) { 
			String temp = removeO(s); 
			System.out.println(temp); 
		} 
	}
}
