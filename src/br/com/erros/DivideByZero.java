package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

		public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			boolean proceed = true;
			
		do {
			try {
				
			System.out.print("Number: ");
			int a = s.nextInt();
			System.out.print("Divider : ");
			int b = s.nextInt();
	
			System.out.println(a / b);
	
		}
			catch(InputMismatchException e1) {
				System.err.println("Please enter whole numbers!");
				s.nextLine(); // discard invalid input
			}
			catch(Throwable e2) {
				System.err.println("The divisor must be different from zero!");
			}
			finally {
				System.err.println("Finally executed...");
			}
		} while(proceed);
	}
}
