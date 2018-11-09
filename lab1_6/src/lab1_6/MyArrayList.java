package lab1_6;

public class MyArrayList {
	private int[] array; //정수 배열
	private int count; //배열에 저장된 항목수

	//매개변수가 없는 constuctor - 
	//정수 배열 필드를 크기가 10인 배열로 초기화하고
	//, 항목수 필드는 0으로 초기화
	public MyArrayList(){
		array = new int[10]; 
		count = 0;
	}

	// 원소 삽입 메소드(add) - 정수값을 매개변수로 받아 배열에 삽입
    // 삽입 순서대로 배열의 앞부분부터 채움 
    // 삽입에 성공하면 true 리턴
    // 배열이 가득 차면 삽입하지 않으며, false를 리턴  
	public boolean add(int num) {
		if (count<array.length) {
			array[count]=num;
			count++;
			return true;
		}
		else {
			return false;
		}

	}
	
	// toString 오버라이드 - 배열에 저장된 항목 전체를 문자열로 리턴
	@Override
	public String toString() {
		String s="";
		for (int i = 0;i<count;i++) {
			s += array[i] + " ";
		}
		return "list = " + s;
	}
}
