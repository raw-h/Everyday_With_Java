import java.util.*;
public class Conditional_Statements {

	public static void main(String[] args) {
/*
	Video 3:-
	
	//Keywords:-
	  These are the predefined words in Java's or any other languages dictionary, 
	  we cannot make variables of these words nor we can interpret these as something else.
	  
	  * %(modulo):- it calculates the remainder.
	    x % y = remainder, after dividing x by y.
	    
	//if - elseif - else:- 
	  * We do not write multiple "if" statements, because when we write multiple ifs then all the statements are checked even if the previous ifs are true,
	    but in case of if-else or if-elseif-else, when the if condition is true the following statements won't be checked. 
	   
	//Switch statement
	  *Break is inside every case because if it isn't there then the following statements will be checked.
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:- ");
		
		
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("You are an adult! Go have some drinks");
		}
		else {
			System.out.println("Go drink horlicks! That's for ya!");
		}
		
		
		System.out.println("Enter the number to check whether even or odd:-");
		int b = sc.nextInt();
		
		if(b % 2 == 0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");		
		}
		
		System.out.println("Enter the number to check whether equal greater or smaller:-");
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(c == d) {
			System.out.print(c);
			System.out.print(" & ");
			System.out.print(d);
			System.out.println(" are equal.");
		}
		else if(c > d) {
			System.out.print(c);
			System.out.print(" is greater than ");
			System.out.print(d);
		}
		else {
			System.out.print(c);
			System.out.print(" is smaller than ");
			System.out.println(d);
		}
		
		System.out.print("Press button 1, 2 or 3:- ");
		int button = sc.nextInt();
		if(button == 1) {
			System.out.println("Hello");
		}
		else if(button == 2) {
			System.out.println("Namaste");
		}
		else if(button == 3){
			System.out.println("Bonjour");
		}
		else {
			System.out.println("Invaid Button");
		}
		
		switch(button){
		case 1: System.out.println("Hello");
				break;
		case 2: System.out.println("Namaste");
				break;
		case 3: System.out.println("Bonjour");
				break;
		default: System.out.println("Invalid Button");
		}
		
/*		Q1.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
		1 : + (Addition) a + b
		2 : - (Subtraction) a - b
		3 : * (Multiplication) a * b
		4 : / (Division) a / b
		5 : % (Modulo or remainder) a % b
		Calculate the result according to the operation given and display it to the user.
*/
		System.out.println("Enter the numbers you want to operate with:- ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter the operaation you want to perform: +, -, *, /, %");
		String operation = sc.next();
		
		switch(operation) {
		case "+": System.out.println(num1 + num2);
				break;
		case "-": System.out.println(num1 - num2);
				break;
		case "*": System.out.println(num1 * num2);
				break;
		case "/": System.out.println(num1 / num2);
				break;
		case "%": System.out.println(num1 % num2);
				break;
		default: System.out.println("Invalid Operation");
		}
	}

}
