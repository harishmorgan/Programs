package programs.com;

public class PrimeNumbers {

	// A prime Number is called when it is divided by itself yields 1 as reminder
	// and
	// when it divides by 2 yields 1 as reminder
	// 2 is the lowest prime number
	// 3 is also the second lowest prime number

	public static boolean isPrimeNumber(int num) {

		// edge //corner cases
		if (num <= 1) {

			return false;

		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;

			}

		}
		return true;

	}
	// if we want to print prime numbers between 1 to 20 we can use this method
	public static void getPrimeNumbers(int num) {
		for(int i =2 ;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i +" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("2 is a prime number:" +isPrimeNumber(2));
		System.out.println("3 is a prime number:" +isPrimeNumber(3));
		System.out.println("10 is a prime number:" +isPrimeNumber(10));
		System.out.println("15 is a prime number:" +isPrimeNumber(15));
		System.out.println("0 is a prime number:" +isPrimeNumber(0));
		
		//negative scenarios
		
		System.out.println("-2 is a prime number:" +isPrimeNumber(-2));
		System.out.println("-3 is a prime number:" +isPrimeNumber(-3));
		
		getPrimeNumbers(20);
	}

}
