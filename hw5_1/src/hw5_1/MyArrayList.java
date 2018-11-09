package hw5_1;


public class MyArrayList {
	private int[] array;//정수 배열
	private int number;//배열에 저장된 항목수
	
	//매개변수가 없는 constuctor - 
	//정수 배열 필드를 크기가 10인 배열로 초기화하고
	//, 항목수 필드는 0으로 초기화
	public MyArrayList() {
		array = new int[10];
		number =0;
	}


	// 원소 삽입 메소드(add) - 정수값을 매개변수로 받아 배열에 삽입
    // 삽입 순서대로 배열의 앞부분부터 채움 
    // 삽입에 성공하면 true 리턴
    // 배열이 가득 차면 삽입하지 않으며, false를 리턴  
	public boolean add(int num) {
		if (number<array.length) {
			array[number]=num;
			number++;
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
		for (int i = 0;i<number;i++) {
			s += array[i] + " ";
		}
		return s;
	}
	
	public int get(int index) {
		return array[index];
	}
	
	public int size() {
		return this.number;
	}
	
	public void add(int index, int element) {
		for(int i = number;i>=index;i--) {
			array[i+1]=array[i];
		}
		array[index] = element;
		this.number++;
	}
	public int remove(int index) {
		int remove = array[index];
		for(int j= index;j<=number;j++) {
			array[j]=array[j+1];
		}
		this.number--;
		return remove;
	}
}





