package programs.com;

public class PalindromeNumber {

	
	//151 454 34543 161 78987
	public static void isPalindromeNumber(int num) {
		System.out.println("Given Number is :" +num);
		int remainder = 0;
		int sum= 0;
		int t;
		t=num;
		
		while(num>0) {
			remainder = num%10; // get the remainder
			sum = (sum*10)+remainder;
			num = num/10;
		}
		if(t==sum) {
			System.out.println("palindrome Number");
		}
		else {
			System.out.println("It is not a palindrome Number");
		}
	}
	
	

	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(152);

	}

}
