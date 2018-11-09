package exer1_6;

public class Example06 {
	static String[] split1(String s) {
		return s.replace(" ","").split(",");
	} 
	static String[] split2(String s) { 
		String[] split = s.split(",");
		for(int i = 0; i < split.length; i++)
			split[i] = split[i].trim();
		return split;
	}
	public static void main(String[] args) {
		String s = "One, Two ,Three , Four,Five"; 
		String[] a1 = split1(s); 
		for (String t : a1) 
			System.out.printf("[%s]\n", t); 
		String[] a2 = split2(s);
		for (String t : a2)
			System.out.printf("[%s]\n", t); 
	}
}
