import java.util.*;
public class HelloWorld {

	/*

	Video 1:-
		Q.How does our Java code works?
		A.So inside JDK are some Development tools and JRE and inside JRE there are some libraries and JVM.
		  So the working of our java code happens in 2 steps
		  a.Compilation:-
		  	The source code that we've made goes to the compiler which is inside JVM, the compiler converts the source code into byte code which has the extension .class
		  	
		  **Java is a portable language as it's byte code, the code with extension as .class can be run in any machine which has JRE in it.
		  	This wasn't possible with C++ or any other language.
		  
		  b.Execution:-
		  	Then the byte code goes into JVM wherein the code gets converted in a language which our computer can understand AKA the native language.

	Video 2:-
		//Output:
		 1. System  is a class & print is a function.
		 2. print, prints the string and doesn't moves to the next line. While println prints and then moves to the next line automatically!
		 
		 //Variables & Constants:
		 1. Variables, who doesn't change their values.
		 2. Constants whose values are fixed throughout.
		 
		 //Data-types:
		 Java is a typed language, which means that while initializing any variables you need to tell the type of the variable i.e int, double, float, boolean, string etc.
		 Types of Data Types in Java:
		 1. Primitive:
		 	a. byte (mem.size 1 byte i.e 8 bits.)
		 	b. short (mem.size 2 bytes.)
		 	c. char (mem.size 2 bytes.)
		 	d. boolean (mem.size 1 byte.)
		 	e. int (mem.size 4 bytes.)
		 	f. long (mem.size 8 bytes.)
		 	g. float (mem.size 4 bytes.)
		 	h. double (mem.size 8 bytes.)
		 
		 2. Non-Primitive:
		 	a. String
		 	b. Array
		 	c. Class
		 	d. Object
		 	e. Interface
		 	
		 	//Input:
			  To take inputs in java we have to import a package java.util.*
			  then create an object of the function Scanner, and then store that value in a variable.
			  
		   	  next will take only one token as input whereas nextline will take the whole sentence as input.
			  Similarly nextInt, nextFloat etc. are used.

		 	
		
	*/

	public static void main(String[] args) {
		System.out.println("Hello World! Let's get started!");

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(name);
		sc.nextLine(); // Had to do this so that it prints the first name and then takes the input of second name.
		String name2 = sc.nextLine();
		System.out.println(name2);
		
		System.out.println("Enter the numbers to sum:-");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println(sum);
		
//		Q1.Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

		System.out.println("Enter the radius:-");
		double radius = sc.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println(area);
		
//		Q2.Make a program that prints the table of a number that is input by the user. 
		System.out.println("Enter the number:-");
		int table = sc.nextInt();
		
		System.out.print(table);
		System.out.print(" * 1 = ");
		System.out.print(table * 1);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 2 = ");
		System.out.print(table * 2);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 3 = ");
		System.out.print(table * 3);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 4 = ");
		System.out.print(table * 4);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 5 = ");
		System.out.print(table * 5);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 6 = ");
		System.out.print(table * 6);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 7 = ");
		System.out.print(table * 7);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 8 = ");
		System.out.print(table * 8);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 9 = ");
		System.out.print(table * 9);
		
		System.out.print("\n");
		
		System.out.print(table);
		System.out.print(" * 10 = ");
		System.out.print(table * 10);
		
		System.out.print("\n");
	}

}