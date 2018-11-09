package lab6_1;

public class MyLinkedList {
	private class Node{
		int data;
		Node link;
		
		Node(int data){
			this.data=data;
		}
	}
	private Node head = null;
	public void addFirst(int data) {
		Node temp = new Node(data);
		temp.link = head;
		head = temp;
		
	}
	
	@Override
	public String toString() {
		Node temp = head;
		String s="";
		while(temp != null) {
			s+=temp.data+" ";
			temp = temp.link;
		}
		return "list = " + s;
	}
}
