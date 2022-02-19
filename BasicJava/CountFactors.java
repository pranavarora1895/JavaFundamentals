import java.util.Scanner;
public class CountFactors
{
 void main(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int number = sc.nextInt();
 
     int no_of_factors = calc_factors(number);
     System.out.println("The number of factors of "+number+" are "+no_of_factors);
     
 }
 
 int calc_factors(int num){
     int count=0;
     for(int i=1;i<=num;i++){
         if(num%i==0) count++;
     }
     return count;
 }
}
