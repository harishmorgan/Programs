package programs.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
		//Represents an operation on a single operand/argument that produces a result of the same type as its operand.
		// This is a specialization of Function for the case where the operand and result are of the same type.
		
		UnaryOperator<Integer>func = (x1) -> x1+9;
		
		int t = func.apply(20);
		
		System.out.println(t);
		
		//FunctionalInterface
		
		Function<Integer,Integer> value = x1 ->x1*45;
		int result  = value.apply(24);
		System.out.println(result);
		
		List<String>str = new ArrayList<String>();
		str.add("java");
		str.add("selenium");
		str.add("cypress");
		System.out.println(str); //[java, selenium, cypress]
		
		str.replaceAll(ele -> ele+"Harish"); //[javaHarish, seleniumHarish, cypressHarish]
		
		System.out.println(str);
		

	}

}
