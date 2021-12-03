import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {

	     public static void main(String[] args){
	        List<Integer> list = new ArrayList<Integer>();
	         for(int i = 1; i< 10; i++){
	             list.add(i);
	         }
	         //Here creating a parallel stream
	         Stream<Integer> stream = list.parallelStream(); 
	         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
	         System.out.print(evenNumbersArr);
	         //Collection<Integer> s1;
	        }}