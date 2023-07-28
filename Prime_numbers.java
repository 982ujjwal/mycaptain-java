package eclipse1;


import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert any number : ");
		
		int num=sc.nextInt();
		boolean isprime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=false;
				break;
				
			}
		}
		
		if(isprime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not prime number");
		}

	}

}
