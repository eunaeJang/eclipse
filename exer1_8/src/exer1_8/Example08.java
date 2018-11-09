package exer1_8;

public class Example08 {
	public static boolean isNullEmptyBlank(String s) {
		if(s == null || s.trim().length() == 0) return true;
		return false;
	} 
	public static void main(String[] args) {
		String[] a = { null, "", " ", " ", " \t ", " \t\n", " . "};
		for (String s : a)
			System.out.println(isNullEmptyBlank(s));
	}
}

