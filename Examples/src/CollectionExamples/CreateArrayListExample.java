package CollectionExamples;
import java.util.ArrayList;
import java.util.List;

import ArraysExamples.Employee;

public class CreateArrayListExample {
	public static void main(String[] args) {
        // Creating an ArrayList of String
        List <String> animals = new ArrayList<>();
        List <Boolean> l2;
        List <Employee> l3;
        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);
        System.out.println(animals.get(3));

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

       System.out.println(animals);
       System.out.println(animals.get(3));
	ArrayList<String> l1=new ArrayList<>();
	
	}
}