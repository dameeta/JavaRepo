package lambda;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class convertstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get the collection and later convert to stream to process elements
		List<Integer> ints = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .collect(Collectors.toList());
		         
		System.out.println(ints);
		 
		//Stream operations directly
		Optional<Integer> max = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .max(Integer::compareTo);
		 
		System.out.println(max);
	//like we can do double long
		List<Long> longs=LongStream.of(1l,2l,3l,4l,5l)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(longs);
	
	}

}
