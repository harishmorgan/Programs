package programs.com;

import java.util.Arrays;
import java.util.List;

public class StreansFilterfinadtmOrElse {

	public static void main(String[] args) {
		
		List<customer> customersList  = Arrays.asList(
                new customer("Tom", 30),
                new customer("Steve", 31),
                new customer("Peter", 34),
                new customer("Simon", 23)
        );
		customer   customers = 	customersList.stream() //convert the list into streams
		.filter(x-> "Peter".equals(x.getName())) //filter it for peter only
		.findAny() //If it finds then return 
		.orElse(null);
		System.out.println(customers.getName() +" "+customers.getAge()); //Peter
		
		//2.In filter If it did not find any  then return else part
		
		customer customersData = customersList.stream().filter(y-> "Harish".equals(y.getName()))
		.findAny().orElse(null);
		System.out.println(customersData); //null
		
		//3.filter with multiple conditions 
		
		customer customersDataList = customersList.stream().filter(z-> "Tom".equals(z.getName()) && 30 == z.getAge())
				.findAny().orElse(null);
		System.out.println(customersDataList.getName() +" " +customersDataList.getAge()); //null
 
	}

}
