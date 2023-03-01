package arrays;

import java.util.Random;
import java.util.Scanner;

public class RandomNo {
public static void main(String[] args) 
{
	
	
	
	System.out.println("enter the no. of random number to be generated");
	
	
	Scanner sc =new Scanner(System.in);
	
	int n = sc.nextInt();
	
	Random random =new Random();
	
	random.ints(1, 500).limit(n).forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
