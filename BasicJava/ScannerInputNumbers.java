import java.util.Scanner;
public class ScannerInputNumbers
{
     void main()
     {
         int num1,num2,num3;
         double avg;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter 1st number");
         num1 = sc.nextInt();
         
         System.out.println("Enter 2nd number");
         num2 = sc.nextInt();
         
         System.out.println("Enter 3rd number");
         num3 = sc.nextInt();
         
         avg = num1+num2+num3/3.0;
         
         System.out.println("The average is "+avg);

        sc.close();         
     }
}
