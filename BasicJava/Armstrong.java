import java.util.Scanner;
public class Armstrong
{
    void main()
{
    int r,s=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    int c_num = num;
    while(num!=0){
        r = num % 10;
        s = s+(int)Math.pow(r,3);
        num/=10;
    }
    
    if(s==c_num) System.out.println("It is an armstrong number");
    else System.out.println("It is not an armstrong number");
}
}
