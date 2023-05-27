package programs.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsConcept {

	public static void main(String[] args) {
		//	Even Numbers
		
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(ele-> ele%2==0).forEach(ele->System.out.println(ele)); //2 4 6 8 10
		
		//append
		
		Stream.of("Hello","world").map(e-> e+"Java").forEach(System.out::println);
		//HelloJava
		//worldJava
		
		String s[] = new String [5];
		s[2]= "I brought a creata car";
		// System.out.println(s[2].length()); // NullPointerException
		
		//To avoid it we use Optional Class
		
		Optional<String> isNull = Optional.ofNullable(s[2]);
		
		if(isNull.isPresent()) {
			System.out.println(s[2] + " " +s[2].length());
		}else {
			System.out.println("Value is not available");
		}
		
		isNull.ifPresent(eles-> System.out.println(eles.length())); // 22
		
		System.out.println("------********-------------****--");
		
		Optional<String> nothing = Optional.empty();
		nothing.ifPresent(elese -> System.out.println(elese.length()));
		
		//J Shell introduced in JDK 9
		
		//In cmd prompt just type jshell --enable-preview and we can try the programs
		
		//factory methods for immutable options
		
	List<Integer> IntData = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
	List<String> StringData = List.of("Java","phython","selenium","ruby");
	StringData.stream().forEach(ele->System.out.println(ele));
	
	//JDK 10 : var keyword
	
	var x = "10";
	System.out.println(x+10);
	
	var h = new HashSet<String>();
	h.add("Naveen");
	
	var h1 = new ArrayList<String>();
	h1.add("automation");
	
	System.out.println(h1.get(0));
	
	//new switch case in JDK 12
	
	//old one 
	
	String browser = "chrome";
	
	switch(browser) {
	case "chrome":
		
		break;
		
	case "firefox":
		break;
	case"IE":
		break;
		
		default:
			break;
	
	}
	
	//new one is like
	
	var n = 3;
	var m = switch(n) {
	case 1 -> "one";
	case 2 -> "two";
	case 3-> "three";
	case 4 -> "four";
	default -> "Number not found ....";
	};
	
	System.out.println(m);
	
	//JDK 13 multi-line support :
	
	//json ,xml
	
	var response = """
{
"name" : "Harish",
"age" : "31",
"place": "KNL"
			
	}""";
	System.out.println(response);

	
	// JDK 14;
	
	Employees e1 = new Employees("Bharath",30,"kurnool");
	System.out.println(e1.name());
	System.out.println(e1.age());
	System.out.println(e1.place());
	
	//JDK 14 instanceOf
	
	//old 
	
	Object obj = new String("Eclipse Test");
	
	if (obj instanceof String) {
		System.out.println(((String)obj).length());
		
	}
	
	//new one 
	

	Object obj1 = new String("Eclipse java JDK 14 Test");
	
	if (obj1 instanceof String str) {
		System.out.println(str.length());
		
	}

}

}
