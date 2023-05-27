package programs.com;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		/**
		Interface Function<T,R> Type Parameters:
		*T The type of Input to
		*the function R - the type of the result of the function
		**/
		
		Function<String,Integer> func = x ->x.length();
		int len  = func.apply("This is Java 8 functional concept");
		System.out.println(len);
		
		//chaining Function 
		
		Function<Integer,Integer> funct = x ->x*2;
		
		int result = func.andThen(funct).apply("This is Java 8 functional concept");
		System.out.println(result);

	}

}
