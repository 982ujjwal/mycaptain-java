package eclipse1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c;
		System.out.println(a+""+b);
		for(int i=1;i<=9;i++) {
			c=a+b;
			System.out.println(c);
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
		

	}

}
