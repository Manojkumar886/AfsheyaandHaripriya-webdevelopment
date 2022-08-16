package ApsheyaAndHaripriya.WebdevelopmentinJava;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//scanner object
		System.out.println("Enter your name");
		String name=scan.nextLine();//global variable
		System.out.println("my name is :"+name);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println("my age is : "+age);
		

	}

}
