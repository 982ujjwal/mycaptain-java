package eclipse1;

public class Fibonacci_recu {
	static int a=0,b=1,c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		System.out.println(a+""+b);
		Fibonacci_recu f=new Fibonacci_recu();
	    f.fibbo(10);	
		

	}
	void fibbo( int i) {
		if(i>1) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			fibbo(i-1);
		}
	}

}
