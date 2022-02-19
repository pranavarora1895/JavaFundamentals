import java.util.Scanner;
public class MathClass
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double r;
        int max_val;
        int r_int;
        System.out.println("Enter the maximum value till where you want the random numbers");
        max_val = sc.nextInt();
        r = Math.random() * max_val;
        r = Math.round(r);
        r_int = (int)r;
        
        System.out.println("The random value is: "+ r_int);
        
    }
}
