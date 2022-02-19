import java.util.Scanner;

public class ScannerAreaPerimeter
{
 void main(){
     double length, breadth, area, perimeter;
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the length in double");
     length = sc.nextDouble();

     System.out.println("Enter the breadth in double");
     breadth = sc.nextDouble();
     
     area = length * breadth;
     perimeter = 2*(length+breadth);
     
     System.out.println("The area = "+area);
     System.out.println("The Perimeter = "+ perimeter);
    }
}
