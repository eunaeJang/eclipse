package exer2_1;

public class Example01 {
	static Object[] obj;
	
	static void addData(int count) {
		obj = new Object[count*2];
		int j = 0;
		for(int i = 0; i < count*2 ; i += 2) {
			obj[i] = new Integer(j);
			obj[i+1] = String.valueOf(j);
			j++;
		}
	}
	
	static int findIndex(int value) {
		int index = 0;
		for(int i = 0; i < obj.length;  i++){
			if (obj[i].equals(value)  && obj[i] instanceof Integer) 
				index = i;
			
		}
		return index;
	}
	
	static int findIndex(String value) {
		int index = 0;
		for(int i = 0; i < obj.length;  i++){
			if (obj[i].equals(value) && obj[i] instanceof String) 
				index = i;
			
		}
		return index;
	}

}
