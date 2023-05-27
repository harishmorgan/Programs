package programs.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		// Represents a predicate (boolean-valued function) of one argument.
		
		 Predicate<Integer>func = abc -> abc>5;
		 
		 List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		 List<Integer> Object =  list.stream().filter(func).collect(Collectors.toList());
		 System.out.println(Object);
		 
		 //predicate with && 
		 List<Integer> andOperator =  list.stream().filter(abc-> abc > 5 && abc < 9).collect(Collectors.toList());
		 System.out.println(andOperator);
		 
		 //predicate with negate()
		 
		 List<String>listStr = Arrays.asList("Harish","Ram","Lakshmi","Vijaya","Bharath");
		 Predicate<String>printNmaes = x -> x.startsWith("Ha");
		 List<String>namesList =listStr.stream().filter(printNmaes.negate()).collect(Collectors.toList());
		 System.out.println(namesList); //[Ram, Lakshmi, Vijaya, Bharath]

	} 

}
