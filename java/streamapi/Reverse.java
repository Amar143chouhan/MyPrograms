package streamapi;

public class Reverse {

	public static void main(String[] args) {

		int num = 5646;

		int rev = 0;

		int rem;

		while (num != 0) {

			rem = num%10;

			rev = rev * 10 + rem;

			num = num/10;

			
			}
		System.out.println("reverse of the number is :" +rev);
		
	}
}
