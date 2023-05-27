package programs.com;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntArrayWithFLatMap {

	public static void main(String[] args) {
		
		int data[]  = {1,2,3,4,5,6,7,8,9};
		
		Stream<int[]>StreamArray = Stream.of(data);
		
		IntStream intstream = StreamArray.flatMapToInt(x-> Arrays.stream(x));
		intstream.forEach(x->System.out.println(x));
		

	}

}
