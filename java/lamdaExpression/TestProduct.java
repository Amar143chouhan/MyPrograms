package lamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestProduct {

	public static void main(String[] args) {

//		List<Product> list = new ArrayList<>();

		Product p1 = new Product(101, "java", "book", 100);

		Product p2 = new Product(102, "python", "book", 300);

		Product p3 = new Product(103, ".net", "book", 400);

		Product p4 = new Product(104, "c++", "book", 500);

		Product p5 = new Product(105, "samsug", "phone", 20000);
		
		Product p6 = new Product(106, "iphone", "phone", 50000);
		
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(p4);
//		list.add(p5);
//		list.add(p6);
//		

	List<Product> list1 = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
             list1.stream().filter(p -> p.getCategory().equals("book") 
				&& p.getPrice() >200).forEach(System.out::println);
	}
}
