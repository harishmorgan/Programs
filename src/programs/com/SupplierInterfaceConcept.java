package programs.com;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {
	
	public static void getText(Supplier<String>text) {
		System.out.println(text.get().length());
		
		
	}

	public static void main(String[] args) {
		// Represents a supplier of results.
		//takes no argument and returns a result
		
		getText(() -> "java");
		getText(() -> "is");
		getText(() -> "my Language");
		

	}

}
