package org.tnsif.sf.c2tc.exceptiondemo;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class IOExceptionDemo {

	public static void main(String[] args) throws Exception
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("Desktop\\Java training Notes\\demo.txt"));
			String data ="";
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
	      
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	

}