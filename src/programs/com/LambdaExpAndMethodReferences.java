package programs.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReferences {

	public static void main(String[] args) {
		
		
		List<String>listStr = Arrays.asList("Harish","Ram","Lakshmi","Vijaya","Bharath");
		
		System.out.println("----for loop--------");
		//for loop 
		
		for(int i =0;i<listStr.size();i++) {
			System.out.println(listStr.get(i));
		}
		
		System.out.println("----advance for loop--------");
		//advance for loop
		
		for(String j : listStr) {
			System.out.println(j);
		}
		
		System.out.println("----with Anonymous class--------");
		//1.with Anonymous class
		listStr.forEach(new Consumer<String>() { 

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		
		System.out.println("----Lamda Exp:->");
		
		//2.Lamda Exp:->
		listStr.forEach(str-> System.out.println(str));
		
		System.out.println("-----Method References:");
		
		//3.Method References:
		listStr.forEach(System.out::println);
		
		

	}

}
