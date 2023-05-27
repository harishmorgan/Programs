package programs.com;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {
		
		//1.
		 Stream<String> seqStreams =  Stream.of("Apple","Brinjal","Creta","Man");
		// seqStreams.forEach(System.out::println);
		 seqStreams.findFirst().ifPresent(System.out::println);
		 
		 //2.
		 Arrays.asList("a1","a2","a3","a4").stream().findFirst().ifPresent(System.out::println);
		 
		 //3.Range from 1 to 5
		 
		 IntStream.range(1, 20).forEach(System.out::println);
		 
		 //4.
		 Arrays.stream(new int[] {1,2,3,4}).map(n->2*n+1).average().ifPresent(System.out::println);
		 
		 //5.String data objects
		 Stream.of("a1","a2","a3").map(n->n.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println); //3
		 
		 //double to string data
		 Stream.of(1.0,2.4,3.0).mapToInt(Double::intValue)
		 .mapToObj(i -> "a"+i).forEach(System.out::println);
		 
		 //limit
		 Stream.iterate(0, n-> n+1).limit(10).forEach(System.out::println);
		 
		 //odd numbers 
		 
		 Stream.iterate(0, n-> n+1).filter(x-> x%2!= 0).limit(10).forEach(System.out::println);
		 
		 
	}
	
}
