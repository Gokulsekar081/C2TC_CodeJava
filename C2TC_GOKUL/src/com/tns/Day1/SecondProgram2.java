package com.tns.Day1;

public class SecondProgram2 {

	public static void main(String[] args) {
		//Conditional Statements Example 
		        int number = 25;

		        // 1. if statement
		        if (number > 20) {
		            System.out.println("The number is greater than 20.");
		        }

		        // 2. if-else statement
		        if (number % 2 == 0) {
		            System.out.println("The number is even.");
		        } else {
		            System.out.println("The number is odd.");
		        }

		        // 3. if-else if-else ladder
		        if (number < 10) {
		            System.out.println("The number is less than 10.");
		        } else if (number <= 20) {
		            System.out.println("The number is between 10 and 20.");
		        } else {
		            System.out.println("The number is greater than 20.");
		        }

		        // 4. nested if statement
		        if (number > 0) {
		            if (number < 50) {
		                System.out.println("The number is positive and less than 50.");
		            }
		        }

		        // 5. switch statement
		        int dayOfWeek = 3;
		        switch (dayOfWeek) {
		            case 1:
		                System.out.println("Monday");
		                break;
		            case 2:
		                System.out.println("Tuesday");
		                break;
		            case 3:
		                System.out.println("Wednesday");
		                break;
		            case 4:
		                System.out.println("Thursday");
		                break;
		            case 5:
		                System.out.println("Friday");
		                break;
		            case 6:
		                System.out.println("Saturday");
		                break;
		            case 7:
		                System.out.println("Sunday");
		                break;
		            default:
		                System.out.println("Invalid day");
		                break;
		        }

		        // 6. Ternary operator
		        String result = (number > 50) ? "The number is greater than 50." : "The number is 50 or less.";
		        System.out.println(result);
		        
// looping statement in java 		        
		        
		        // 1. for loop
		        System.out.println("For Loop:");
		        for (int i = 1; i <= 5; i++) {
		            System.out.println("Iteration: " + i);
		        }

		        // 2. while loop
		        System.out.println("\nWhile Loop:");
		        int j = 1;
		        while (j <= 5) {
		            System.out.println("Iteration: " + j);
		            j++;
		        }

		        // 3. do-while loop
		        System.out.println("\nDo-While Loop:");
		        int k = 1;
		        do {
		            System.out.println("Iteration: " + k);
		            k++;
		        } while (k <= 5);

		        // 4. Enhanced for loop (for-each loop)
		        System.out.println("\nEnhanced For Loop:");
		        int[] numbers = {10, 20, 30, 40, 50};
		        for (int num : numbers) {
		            System.out.println("Number: " + num);
		        }

		        // 5. Nested for loop
		        System.out.println("\nNested For Loop:");
		        for (int m = 1; m <= 3; m++) {
		            for (int n = 1; n <= 3; n++) {
		                System.out.println("m = " + m + ", n = " + n);
		            }
		        }

		        // 6. Infinite loop (with a break statement to stop it)
		        System.out.println("\nInfinite Loop with Break:");
		        int count = 0;
		        while (true) {
		            System.out.println("Infinite Loop Iteration: " + count);
		            if (count == 3) {
		                break; // Exiting the infinite loop
		            }
		            count++;
		        }

	}

}
