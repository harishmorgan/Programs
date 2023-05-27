package programs.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		List<customer> customersList = Arrays.asList(new customer("Tom", 30), new customer("Steve", 31),
				new customer("Peter", 34), new customer("Simon", 23));

		String name = customersList.stream().filter(abcd -> "Steve".equals(abcd.getName())).map(customer::getName)
				.findAny().orElse(null);
		System.out.println(name);
		
		//Print all the names present in list
		List<String> fetchTheList = customersList.stream().map(customer::getName).collect(Collectors.toList());
		fetchTheList.forEach(System.out::println);
		

	}

}
 