package e2018.exam1;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{
	 @Override 
	 public int compare(Product p1, Product p2) { 
		 int r = p1.name.compareTo(p2.name); // 먼저 나이(age)를 비교한다. 
		 if (r != 0) return r; // 나이가 같지 않다면, 나이 비교 결과를 리턴한다. 
		 return  p1.price - p2.price;// 나이가 같다면, 이름(name) 비교 결과를 리턴한다. }
	 }
}

