package programs.com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbersWithParallelStream {
	
	public static boolean isPrime(int number) {
		
		if(number<=1) {
			return false;
		}
		return !IntStream.rangeClosed(2, number/2).anyMatch(x-> number%x == 0);
	}

	public static void main(String[] args) {
		System.out.println(isPrime(7));
		
		long t1 , t2;
		t1 = System.currentTimeMillis();
	Long LongCount = 	Stream.iterate(0, n-> n+1).limit(100000)
		//.parallel()
		.filter(PrimeNumbersWithParallelStream :: isPrime)
		.peek(x-> System.out.println(x))
		.count();
	
	t2 = System.currentTimeMillis();
	
	System.out.println("total prime numbners:" +LongCount);
	
	System.out.println("total time taken:" +(t2-t1)/1000);
	
	//for parallel
	
	//total prime numbers:9592
	//total time taken:1
	
	//for sequential 
	
	//total prime numbers:9592
	// total time taken:2

	}

}
