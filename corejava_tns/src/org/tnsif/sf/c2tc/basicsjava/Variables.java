package org.tnsif.sf.c2tc.basicsjava;

public class Variables {
int a=10;//instance variable
	
	void print()

	{
		String msg="hello";//local variable
		System.out.println(msg);
	}
	
	static String message="hello svit";
	
	public static void main(String[] args) {
		 Variables obj=new  Variables();
		 System.out.println("the value of a " +obj.a);
		 obj.print();
		 System.out.println(message);
	}
}
