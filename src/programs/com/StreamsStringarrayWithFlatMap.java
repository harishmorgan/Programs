package programs.com;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringarrayWithFlatMap {

	public static void main(String[] args) {
		//2D Array
		
		String data[][]= new String[][] {
			{"A","B"},{"C","D"},{"E","F"}
		};
		
		Stream<String[]> dataStream = Arrays.stream(data);
		
		//Apply flatMap in dataStream 
		Stream<String> data_FlatMapStream  = dataStream.flatMap(x->  Arrays.stream(x));
		
		Stream<String>  data_stream =data_FlatMapStream.filter(x-> "A".equals(x.toString()));
		data_stream.forEach(System.out::println);
		
		//composite Actions
		
		Stream<String> finalSteam = Arrays.stream(data).flatMap(x->Arrays.stream(x)).filter(x->"C".equals(x.toString()));
		finalSteam.forEach(System.out::println);

	}

}
