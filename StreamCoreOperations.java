import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCoreOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Lina");
		memberNames.add("Lata");
		memberNames.add("Rekha");
		memberNames.add("Rahul");
		memberNames.add("Mansi");
		memberNames.add("Vidya");
		memberNames.add("Priyanka");
		memberNames.add("Sarita");
//Intermediate operations return the stream itself so you can chain multiple 
		//method calls in a row. 
		// Stream.filter()
//Filter accepts a predicate to filter all elements of the stream. This operation is intermediate which enables us to call another stream operation (e.g. forEach) on the result.
		memberNames.stream().filter((s) -> s.startsWith("R"))
        .forEach(System.out::println);
//Stream.map()
//map converts each element into another object via the given function
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
    

//Sorted is an intermediate operation which returns a sorted view of the stream. 
//The elements are sorted in natural order unless you pass a custom Comparator.             
		System.out.println("Sorting..");
		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
//Keep in mind that sorted does only create a sorted view of the stream without manipulating the ordering of the backed collection. 
//The ordering of memberNames is untouched.
		
		//Terminal operations

		//Terminal operations return a result of a certain type instead of again 
		//a Stream.
		
		//Stream.forEach()
		
		memberNames.forEach(System.out::println);
		//Stream.collect()
	//	collect() method used to receive elements from a stream and store them in a collection and mentioned in parameter function.
		List<String> memNamesInUppercase = memberNames.stream().sorted()
		                            .map(String::toUpperCase)
		                            .collect(Collectors.toList());
		         
		System.out.println(memNamesInUppercase);
		
		//Stream.match()
//Various matching operations can be used to check whether a 
//certain predicate matches the stream. All of those operations are 
		//terminal and return a boolean result.	
		
		boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

System.out.println(matchedResult);

matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

System.out.println(matchedResult);

matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

System.out.println(matchedResult);	

//Stream.count()

//Count is a terminal operation returning 
//the number of elements in the stream as a long.

long totalMatched = memberNames.stream()
.filter((s) -> s.startsWith("A"))
.count();

System.out.println(totalMatched);
//Stream.reduce()

//This terminal operation performs 
//a reduction on the elements of the stream with the given function. 
//The result is an Optional holding the reduced value.

Optional<String> reduced = memberNames.stream()
.reduce((s1,s2) -> s1 + "#" + s2);

reduced.ifPresent(System.out::println);
//Stream Though, stream operations are performed on all elements inside a 
//collection satisfying a predicate, It is often desired to break 
//the operation whenever a matching element is encountered during iteration. In external iteration, you will do with if-else block. 
//In internal iteration, there are certain methods you can use for this purposeshort-circuit operations

//Stream.anyMatch()
boolean matched = memberNames.stream()
.anyMatch((s) -> s.startsWith("A"));

System.out.println(matched);
//Stream.findFirst()
//It will return first element from stream and then will not process 
//any more element.
String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst().get();
 
System.out.println(firstMatchedName);
	
	}

}
