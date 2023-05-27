package programs.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		//Represents an operation that accepts a single input argument and returns no result
		
		Consumer<String>cs = x-> System.out.println(x);
		cs.accept("Hi all welcome to my world");
		
		 List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 list.forEach( y -> System.out.println(y));
		 
		 list.forEach(System.out::println);

	}

}
