package exer1_2;

public class Example02 {
	static int getVowelCount(String s) {
		//String.charAt 메소드를 활용
		int count = 0;
		char[] vowel = new char[] {'a','e','i','o','u','A','E','I','O','U'};
		for(int i = 0; i < s.length(); i++) {
			for(char j : vowel) {
				if (s.charAt(i) == j)
					count ++;
			}
		}
		return count;
	} 
	public static void main(String[] args) { 
		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" }; 
		for (String s : a) {
			int count = getVowelCount(s); 
			System.out.printf("%s %d\n", s, count); 
		} 
	} 
}

