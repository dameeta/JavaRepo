package CollectionExamples.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ProdComparator  implements Comparator<Product>{

	

	@Override
	public int compare(Product o1, Product o2) {

		if(o1.id == o2.id) return 0;
		else if(o1.id > o2.id) return 1;
		else return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Product> ts=new TreeSet<>(new ProdComparator());
		ts.add(new Product(98, "Soap"));
		ts.add(new Product(55, "Washing Powder"));
		ts.add(new Product(55, "Washing Powder"));

		ts.add(new Product(71, "Oil"));
		ts.add(new Product(4, "Toothbrush"));
		ts.add(new Product(12, "Shampoo"));
		
		System.out.println(ts);
		//Displaying the sorted arraylisted products
		ArrayList<Product> al=new ArrayList<>();
		al.add(new Product(98, "Soap"));
		al.add(new Product(55, "Washing Powder"));
		al.add(new Product(55, "Washing Powder"));
		al.add(new Product(4, "Toothbrush"));
		al.add(new Product(12, "Shampoo"));
		Collections.sort(al,new ProdComparator());
		System.out.println(al);

	}
	
}
