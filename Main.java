import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // =============== 1 ===============
        // 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input 

        try{
            System.out.print("Input first number: ");
            int numberOne = input.nextInt(); 
    
            System.out.print("Input second number: ");
            int numberTwo = input.nextInt(); 
    
            System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
            System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
            System.out.println(numberOne + " x " + numberTwo + " = " + (numberOne * numberTwo));
            System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
            System.out.println(numberOne + " mod " + numberTwo + " = " + (numberOne % numberTwo));
    
        }catch(ArithmeticException e){
            System.out.println("Error: Cannont divide by zero");
        }catch(InputMismatchException e){
            System.out.println("Error: Please enter a vaild number");
        }



        // =============== 2  ===============
        // 2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        
        try{
            System.out.print("Input a number: ");
            int number = input.nextInt(); 
    
            for(int i = 1; i <= 10; i++ ){
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        
        }catch(InputMismatchException e){
            System.out.println("Error: Please enter a vaild number");
        }


        // =============== 3  ===============
        // 3. Write a Java program to print the area and perimeter of a circle.
        
        try {
            System.out.print("Enter The radius: ");
            float radius = input.nextFloat();

            double pi = 3.141592653589793; 
            double area = pi * radius * radius; 
            double perimeter = 2 * pi * radius;
    
            System.out.printf("Perimeter is = %.14f\n", perimeter);
    
            System.out.printf("Area is = %.14f\n", area);
    
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a vaild floating point number");
        }

        

        // =============== 4  ===============
        // 4. Java program to find out the average of a set of integers
    
        try {
            System.out.print("Enter the count of numbers: ");
            int count = input.nextInt();
            int number; 
            int sum = 0;
    
            for(int i = 1; i <= count; i++){
                System.out.print("Enter integer: ");
                number = input.nextInt(); 
                
                sum += number; 
            } 
            
            float average = (float) sum / count; 
            System.out.println("The average is: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a vaild number");
        }

        // =============== 5  ===============
        // 5. Write a Java program that accepts three integers as input, adds the first two integers together, and then determines whether the sum is equal to the third integer.


        try {
            int firstNumber; 
            int secondNumber; 
            int thirdNumber;
            boolean isEqual; 
    
            System.out.print("Input the first number: ");
            firstNumber = input.nextInt(); 
    
            System.out.print("Input the second number: ");
            secondNumber = input.nextInt();
    
            System.out.print("Input the third number: ");
            thirdNumber = input.nextInt(); 
            if ((firstNumber + secondNumber) == thirdNumber){
                isEqual = true; 
                System.out.println("The result is: " + isEqual);
            }else {
                isEqual = false; 
                System.out.println("The result is: " + isEqual);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erorr: Please enter a vaild number");
        }
            

        // =============== 6  ===============
        // 6. Write a Java program to reverse a word.
        
        try {
            System.out.print("Input a word: ");
            String str = input.nextLine();
    
            isEmpty(str);
            String reverseWord = ""; 
            
            for (int i = str.length() -1; i >= 0; i--){
                    reverseWord += str.charAt(i);
            }
    
            System.out.println("Reverse word: " + reverseWord);
        } catch (Exception e) { // 
            System.out.println("Error: Please Input a string");
        }


        // =============== 7  ===============
        // 7 - Java program to check whether the given number is even or odd
        
        try {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            isZero(number); 

            if(number % 2 == 0){
                System.out.println("The number is Even");
            }else {
                System.out.println("The number is Odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a vaild number");
        }



        // =============== 8  ===============
        // 8 - Java program to convert the temperature in Centigrade to Fahrenheit

        try{

            System.out.print("Enter the Centigrade to Converted to Fehrenheit: ");
            float centigrade = input.nextFloat();

            float fehrenheit = (centigrade * 9 / 5) + 32;
    
            System.out.printf("Temperature in Fehrenheitis: %.1f\n", fehrenheit);

        }catch(InputMismatchException e){
            System.out.println("Error: Please enter a vaild floating point number");
        }


        // =============== 9  ===============
        // 9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        try {

            System.out.print("Input a string: ");
            String str = input.nextLine();
            isEmpty(str);

            System.out.print("Input a number: ");
            int index = input.nextInt(); 

            System.out.println(str.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index is out of bounds of string length");
        } catch(InputMismatchException e){
            System.out.println("Error: Please enter a vaild number");
        }

        // =============== 10 ===============
        // 10. Write a Java program to print the area and perimeter of a rectangle.


        try {
            System.out.print("Enter the width: ");
            float width = input.nextFloat();
    
            System.out.print("Enter the height: ");
            float height = input.nextFloat(); 
    
            float area = height * width;		
        
            float perimeter = 2 * (height + width);
    
            System.out.printf("Area is %.1f * %.1f = %.2f\n", width, height, area);
            System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f\n",width ,height,  perimeter);    
            
        } catch (Exception e) {
            System.out.println("Error: Please enter a vaild floating point numbers");
        }


    }


    // =============== 6  ===============
    // 6. Write a Java program to reverse a word.
    
    // =============== 9  ===============
    // 9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.

    public static void isEmpty(String str)throws EmptyStackException{
        if(str.isEmpty()){
            // System.out.println("``You must type any string``"); 
            throw new EmptyStackException();
        }
    }

    
    // =============== 7  ===============
    // 7 - Java program to check whether the given number is even or odd

    public static void isZero(int number)throws Exception {
        
        if(number <= 0 ){
            throw new Exception("Enter a positive integer"); 
        }
        
    }
}
