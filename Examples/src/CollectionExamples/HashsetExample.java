package CollectionExamples;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set <Integer> mysetnew = new HashSet<>();
		mysetnew.add(new Integer(11));
		mysetnew.add(new Integer(12));
		mysetnew.add(new Integer(13));
		mysetnew.add(12);
		System.out.println(mysetnew);
		HashSet<Double> hs=new HashSet<>();
		hs.add(1.2);
		hs.add(1.20);
		hs.add(null);
		System.out.println(hs.size());
		hs.remove(1.2);
		System.out.println(hs);
		//hs.remove(null);
  if(hs.contains(null))
  {
	  System.out.println("yes");
  }
		//hs.clear();
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());

		
		
		
		
	
	
	}

}
