package programs.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreansSetWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Samsung stores");
		
		emp.addDevices("Apple");
		emp.addDevices("Iphone");
		emp.addDevices("Asus");
		emp.addDevices("Carrot");
		
		
		Employee emp2 = new Employee();
		emp2.setName("Market shop");
		
		emp2.addDevices("Tomato");
		emp2.addDevices("Brinjal");
		emp2.addDevices("Carrot");
		emp2.addDevices("Cabbage");
		
		List<Employee> data_belongs = new ArrayList<Employee>();
		data_belongs.add(emp);
		data_belongs.add(emp2);
		
		List<String>devices_List = data_belongs.stream().map(x->x.getDevicesNames()) // map is returning Stream<set<string>> so in that case we can use
		
		//flatMap
	.flatMap(x-> x.stream()) // Stream<String>
		.distinct() //gives unique values
		.collect(Collectors.toList());
		
		devices_List.forEach(x-> System.out.println(x));
		
		
		
		
		
		
	}

}
