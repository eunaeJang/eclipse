package exer1_3;

public class Example03 { 
	static String getFileName1(String path) {
		//String.lastIndexOf 메소드, String.substring 메소드를 사용하여 구현
		int beginIndex = path.lastIndexOf("/");
		return path.substring(beginIndex+1);
	} 
	static String getFileName2(String path) { 
		//String.split 메소드를 사용하여 구현
		String[] s = path.split("/");
		return s[s.length-1];
	}
	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx", 
				       "c:/www/mainpage.html", 
				       "c:/program files/java/javac.exe" };
		for (String s : a) { 
			String fileName1 = getFileName1(s);
			String fileName2 = getFileName2(s);
			System.out.printf("%s, %s\n", fileName1, fileName2); 
		}
	}
}
