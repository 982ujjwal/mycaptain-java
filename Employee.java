package eclipse1;


class A{
	String name;
	int year;
	String address;
	
	A(String name,int year,String address){
		this.name=name;
		this.year=year;
		this.address=address;
	}
}



public class Empolyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A("Robert",1994, "64C- WallsStreet");
		A b=new A("Sam", 2000, "68D- WallsStreet");
		A c=new A("John",1999 ,"26B- WallsStreet");
		
		
		System.out.println(a.name+a.year+a.address);
		System.out.println(b.name+b.year+b.address);
		System.out.println(c.name+c.year+c.address);
		
		System.out.println(a.name+a.year+a.address+b.name+b.year+b.address+c.name+c.year+c.address);
		
		
		
		

	}

}
