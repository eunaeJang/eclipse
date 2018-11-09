package ex11_1;

class SharedObjC { 
	int sum = 0;
	synchronized void add(int i) { sum = sum + i; } 
	synchronized void sub(int i) { sum = sum - i; } 
} 

class ThreadK1 extends Thread {
	
	String name;
	int count; 
	SharedObjC sharedObj;
	
	public ThreadK1(String name, int count, SharedObjC sharedObj) {
		this.name = name; 
		this.count = count; 
		this.sharedObj = sharedObj;
	} 
	@Override public void run() {
		for (int i = 1; i <= count; ++i) 
			sharedObj.add(i); 
	}
	
}

class ThreadK2 extends Thread {
	String name;
	int count; 
	SharedObjC sharedObj;
	public ThreadK2(String name, int count, SharedObjC sharedObj) {
		this.name = name;
		this.count = count;
		this.sharedObj = sharedObj;
	}
	@Override public void run() {
		for (int i = 1; i <= count; ++i)
			sharedObj.sub(i);
	}
} 

public class Example10 {
	public static void main(String args[]) {
		SharedObjC sharedObj = new SharedObjC();
		ThreadK1 threadOne = new ThreadK1("one", 100, sharedObj);
		ThreadK2 threadTwo = new ThreadK2("two", 100, sharedObj); 
		threadOne.start(); 
		threadTwo.start();
		try {
			threadOne.join(); 
			threadTwo.join();
		} catch (InterruptedException e) { 

		} 
		System.out.println(sharedObj.sum);
	}
}
