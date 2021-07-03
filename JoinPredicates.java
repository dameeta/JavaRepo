package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
public class JoinPredicates {
	static void display(Predicate<Integer> p, Integer[]arr)
	{ 
		for(Integer i:arr)
		{
			if(p.test(i))
				System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer []arr= {8,9,10,11,12,13,14,15};
//create predicate references
Predicate<Integer> lt,gt;
//lambda true if n>10

gt=(n)->n>10;
//lambda true if n<15
lt=(n)->n<15;

System.out.println("nos greater than 10 and less than 15");

display(gt.and(lt),arr);

System.out.println("nos greater than or equal to 10 and greater than or equal to 15");
display(gt.and(lt).negate(), arr);
//peek()s

List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
list.stream()
    .peek( System.out::println );       //prints nothing
//Stream.peek() without terminal operation
//List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
         
List<Integer> newList = list.stream()
                            .peek(System.out::println)
                            .collect(Collectors.toList());
 
System.out.println(newList);	
//Stream.peek() method can be a useful in visualizing 
//how stream operations behave and understanding the 
//implications and interactions of complex intermediate stream operations.

//Though it is entirely possible to alter the inner state of elements 
//in the stream, 
//but it is never recommended and shall be avoided.
	
	}

}
