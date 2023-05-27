package programs.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {
	
	 
	 public static List<String> getAlphabetsList() {
		 
        //to print from a-z --> 97-122
		 
		 List<String>alphabets = new ArrayList<>();
		 
		 int n = 97;
		 
		 while(n<=122) {
			 
			 char c = (char)n;
			 alphabets.add(String.valueOf(c));
			 n++;
			  
		 }
		 
		 return alphabets;
		
		 
		 
	 }
	 

	public static void main(String[] args) {
		
		ForkJoinPool corePools = ForkJoinPool.commonPool();
		System.out.println(corePools.getParallelism());//3
		
		 System.out.println("-----------------");
		
		//1.by using parallel() method on stream:
		 Stream<String> seqStreams =  Stream.of("Apple","Brinjal","Creta","Man");
		 // Stream parallelStream =  seqStreams.parallel();
		 
		 Stream.of("Apple","Brinjal","Creta","Man").forEach(System.out::println); //sequential
		 
		 System.out.println("-----------------");
		 
		 Stream.of("Apple","Brinjal","Creta","Man").parallel().forEach(System.out::println); //parallel
		 
		 System.out.println("-----------------");
		 
		 //2.use parallel() Stream method on collections() stream 
		 
		 Arrays.asList("Apple","Brinjal","Creta","Man").parallelStream().forEach(System.out::println);
		 
		 System.out.println("-----------------");
		 
		 // 1 to 10 I want to print
		 System.out.println("-------Normal Stream----------");
		 IntStream.rangeClosed(1, 10).forEach(System.out::println);
		 
		 System.out.println("-------Sequential Stream----------");
		 
		 IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		 
		 //To call getAlphabetsList();
		 
		// System.out.println(getAlphabetsList());
		 
		 System.out.println("-------Normal Stream----------");
		 
		 getAlphabetsList().stream().forEach(System.out::println);
		 
		 System.out.println("-------Parallel Stream----------");
		 
		 getAlphabetsList().parallelStream().forEach(System.out::println);
		 
		//check the stream is running in parallel mode
		 IntStream	range =  IntStream.rangeClosed(1, 10);
		 System.out.println(range.isParallel()); // false
		 
		 IntStream	range1 =  IntStream.rangeClosed(1, 10).parallel();
		 System.out.println(range1.isParallel()); // true
		 
	}

}
