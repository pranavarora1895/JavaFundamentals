import java.util.Scanner;
public class Highest
{
 void main(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int num1 = sc.nextInt();
     System.out.println("Enter a number");
     int num2 = sc.nextInt();
     System.out.println("Enter a number");
     int num3 = sc.nextInt();
     int max_val = find_max(num1,num2,num3);
     System.out.println("The maximum value is "+ max_val);
     
 }
 
 int find_max(int a, int b, int c){
     
     if(a>b && a>c)
     {
         return a;
        }
     else if(b>c && b>a)
     {
         return b;
        }
     else 
     {
         return c;
        }
            
 }
}
