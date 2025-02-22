import java.util.Scanner; 
  
 public class Calci { 
  
     public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in); 
  
         System.out.println("Enter first number: "); 
         double firstNumber = scanner.nextDouble(); 
  
         System.out.println("Enter an operator (+, -, *, /): "); 
         char operator = scanner.next().charAt(0); 
  
         System.out.println("Enter second number: "); 
         double secondNumber = scanner.nextDouble(); 
  
         double result; 
  
         switch (operator) { 
             case '+': 
                 result = firstNumber + secondNumber; 
                 break; 
             case '-': 
                 result = firstNumber - secondNumber; 
                 break; 
             case '*': 
                 result = firstNumber * secondNumber; 
                 break; 
             case '/': 
                 if (secondNumber != 0) { 
                     result = firstNumber / secondNumber; 
                 } else { 
                     System.out.println("Error! Division by zero."); 
                     return; 
                 } 
                 break; 
             default: 
                 System.out.println("Error! Invalid operator."); 
                 return; 
         } 
  
         System.out.println("The result is: " + result); 
     } 
 }