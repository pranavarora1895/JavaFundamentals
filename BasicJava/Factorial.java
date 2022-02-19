import java.util.Scanner;
public class Factorial
{
 void main(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int number = sc.nextInt();
     int factorial = get_factorial(number);
     System.out.println("The factorial of number "+number+" is "+factorial);
     
 }
 
 int get_factorial(int num){
     int factorial_value = 1;
     for(int i=1; i<=num;i++){
         factorial_value *= i;
     }
     return factorial_value;
    }
}
