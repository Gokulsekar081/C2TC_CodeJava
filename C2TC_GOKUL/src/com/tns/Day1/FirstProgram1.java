package com.tns.Day1;

public class FirstProgram1 {

	public static void main(String[] args) {
		int a = 10;
	        int b = 5;
	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));  
	        System.out.println("a - b = " + (a - b));  
	        System.out.println("a * b = " + (a * b));  
	        System.out.println("a / b = " + (a / b));  
	        System.out.println("a % b = " + (a % b));  
	
	        // Relational (Comparison) Operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("a == b: " + (a == b));  
	        System.out.println("a != b: " + (a != b));  
	        System.out.println("a > b: " + (a > b));    
	        System.out.println("a < b: " + (a < b));    
	        System.out.println("a >= b: " + (a >= b));  
	        System.out.println("a <= b: " + (a <= b));  
	
	        // Logical Operators
	        boolean x = true;
	        boolean y = false;
	        System.out.println("\nLogical Operators:");
	        System.out.println("x && y: " + (x && y));  
	        System.out.println("x || y: " + (x || y));  
	        System.out.println("!x: " + (!x));          
	
	        //  Bitwise Operators
	        int p = 6;  
	        int q = 4; 
	        System.out.println("\nBitwise Operators:");
	        System.out.println("p & q: " + (p & q));  
	        System.out.println("p | q: " + (p | q));  
	        System.out.println("p ^ q: " + (p ^ q));  
	        System.out.println("p: " + (~p));        
	        System.out.println("p << 1: " + (p << 1));  
	        System.out.println("p >> 1: " + (p >> 1));  
	        System.out.println("p >>> 1: " + (p >>> 1)); 
	
	        //  Assignment Operators
	        int c = 20;
	        System.out.println("\nAssignment Operators:");
	        c += 5;  
	        System.out.println("c += 5: " + c);
	        c -= 5;  
	        System.out.println("c -= 5: " + c);
	        c *= 5;  
	        System.out.println("c *= 5: " + c);
	        c /= 5;  
	        System.out.println("c /= 5: " + c);
	        c %= 5;  
	        System.out.println("c %= 5: " + c);
	
	        //  Unary Operators
	        int d = 10;
	        System.out.println("\nUnary Operators:");
	        System.out.println("d++: " + (d++));  
	        System.out.println("++d: " + (++d));  
	        System.out.println("d--: " + (d--));  
	        System.out.println("--d: " + (--d));  
	
	        //  Ternary Operator
	        int age = 20;
	        String result = (age >= 18) ? "Adult" : "Minor";
	        System.out.println("\nTernary Operator:");
	        System.out.println("Age check: " + result);

	}

}
