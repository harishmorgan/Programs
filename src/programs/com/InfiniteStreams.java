package programs.com;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		// Infinite Streams is used to generate infinite streams of data
		
		//to generate a stream using iterate() and generate() methods.
		
		//iterate()
		//iterate() methods takes a seed and UnaryOperator to generate the stream of data.
		//static (T seed, UnaryOperator<T> f)
		//return a stream --->Stream<T>
		
		List<Integer> list  = IntStream.iterate(0, n -> n+2).mapToObj(Integer::valueOf)
		.limit(20).collect(Collectors.toList());
		System.out.println(list);
		
		//generate()
		//generate() method takes Supplier interface as an input to generate the stream of data.
		//static (Supplier<T> s)
		//random numbers --100
		
		List<Integer> list1 =  Stream.generate(() -> (new Random())
				.nextInt(100))
				.limit(100)
				.collect(Collectors.toList());
		
		System.out.println(list1);
	}

}
