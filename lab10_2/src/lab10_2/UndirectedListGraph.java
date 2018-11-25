/*
 * 파일명: UndirectedListGraph.java
 * 작성일: 2018.11.22
 * 작성자: 장은애 
 * 설명: 무방향 그래프를 생성하고 이용하는 프로그램
 */

package lab10_2;

//- UndirectedListGraph 클래스
//	djacency list로 무방향 그래프를 구현하는 클래스임

public class UndirectedListGraph {
	private class Node{
		int vertex;
		Node link;
		Node(int vertex){
			this.vertex = vertex;
		}
 	}
//private 인스턴스 변수:
	// 구현에 필요한 변수들을 선언
	private Node[] list;
	private int n; // 정점 수
	
//public 메소드:
	//생성자 : 정점수 n을 매개변수로 받아 정점은 n개이고 간선은 없는 초기 그래프를 생성
    //	이 때, 정점수 n의 크기를 제한하면 안됨(예를 들어 n이 100 이하만 작동하게 하면 안됨)
	public UndirectedListGraph(int n) {
		this.n= n;
		list = new Node[n];
	}
	
	//hasEdge : 간선을 이루는 두개의 정점 v1, v2를 매개변수로 받아 이 간선 존재 여부를 리턴
	public boolean hasEdge(int v1, int v2) {
		Node tmp = list[v1];
		while(tmp != null) {
			if (tmp.vertex == v2) return true;
			tmp = tmp.link;
		}
		return false;
	}
	
	// addEdge : 간선을 이루는 두개의 정점 v1, v2를 매개변수로 받아 그래프에 간선을 추가
    	//** 무방향 그래프이므로 두 개의 리스트에 노드를 삽입해야 함
		//** 잘못된 정점 번호인 경우 삽입하지 않고 오류 메시지 출력
    	//** 이미 존재하는 간선인 경우(hasEdge 호출) 삽입하지 않고 오류 메시지 출력    
	public void addEdge(int v1, int v2) {
		if(!isValid(v1) || ! isValid(v2))
			System.out.println("잘못된 정점 번호입니다");
		else if(hasEdge(v1,v2))
			System.out.printf("이미 존재하는 간선입니다. (%d,%d)\n", v1, v2);
		else {
			//list[v1]이 가리키는 단순연결리트의 맨 앞에 v2삽입
			Node newNode2 = new Node(v2);
			newNode2.link = list[v1];
			list[v1] = newNode2;
			
			//list[v2]이 가리키는 단순연결리트의 맨 앞에 v1삽입
			Node newNode1 = new Node(v1);
			newNode1.link = list[v2];
			list[v2] = newNode1;
 		}
	}
	//printAdjacentVertices : 정점을 매개변수로 받아 그 정점에 인접한 정점들을 모두 출력
	//	잘못된 정점 번호인 경우 오류 메시지 출력
	public void printAdjacentVertices(int v) {
		Node tmp = list[v];
		while(tmp != null) {
			System.out.print(tmp.vertex + " ");
			tmp = tmp.link;			
		}
		System.out.println();
	}
	
	public boolean isValid(int v) {
		return v >= 0 && v <= n;
	}
	
	
	
}
