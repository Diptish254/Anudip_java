package opps2;

public class DataType {

	int a=20;
	
	
	
	
	public DataType() {
		super();
	}




	public DataType(int a) {
		super();
		this.a = a;
	}




	void display()
	{
		System.out.println( a);
		System.out.println( "i am a Data type");
	}
	
}



class Number extends DataType{
	
	int a=2;

	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Number(int a) {
		super();
		this.a = a;
	}
	

	void display()
	{
		System.out.println( a);
		System.out.println( "i am a int  type");
	}
	
}


class Char extends DataType{
	
	char a='c';

	public Char() {
		super();
	}

	public Char(char a) {
		super();
		this.a = a;
	}
	
	void display()
	{
		System.out.println( a);
		System.out.println( "i am a char  type");
	}
}

class Boolean extends DataType{
	
	public Boolean() {
		super();
	}

	public Boolean(boolean a) {
		super();
		this.a = a;
	}

	boolean a= true;
	void display()
	{
		System.out.println( a);
		System.out.println( "i am a boolean  type");
	}
}


