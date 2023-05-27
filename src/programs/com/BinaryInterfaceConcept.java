package programs.com;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryInterfaceConcept {

	public static void main(String[] args) {
		//Represents an operation upon two operands of the same type, producing a result of the same type as the operands. 
		//This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
		
		
		BinaryOperator<Integer>func = (x1,x2) -> x1+x2;
		
		int t = func.apply(20,30);
		
		System.out.println(t);

		// BiFunction 
		
		BiFunction<Integer,Integer,Integer>func1 = (x1,x2) -> x1+x2;
		
		int t1 = func1.apply(10,30);
		
		System.out.println(t1);

	}

}
