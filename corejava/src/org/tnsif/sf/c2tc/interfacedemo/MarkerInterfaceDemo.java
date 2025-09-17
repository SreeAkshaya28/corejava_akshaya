package org.tnsif.sf.c2tc.interfacedemo;

public class MarkerInterfaceDemo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Registerable s1=new Student(12,"bogish",25000.00,"Aiml");
			
			Object obj=new Object();
			if(s instanceof Registerable) {
				System.out.println("Student is registered ");
			}
			else {
				System.out.println("student is not registerd ");
			}
			
		}

	}