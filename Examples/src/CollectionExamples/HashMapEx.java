package CollectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hs=new HashMap<>();

hs.put(101, "Abc");
hs.put(102, "Pbc");
hs.put(101, "Dbc");

	
	System.out.println(hs);
	
	for(Map.Entry<Integer, String> entry: hs.entrySet()) {
	//Iterator hsIterator = hs.entrySet().iterator();
	System.out.println(entry.getKey() +" " +entry.getValue());
	}
	}
	}
