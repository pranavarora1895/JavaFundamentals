import java.util.*;
public class reverseInitials
{
void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your name: ");
    String s=sc.nextLine();
    s=s.toUpperCase();
    int t=s.indexOf(32);
    System.out.print(s.substring(0,t)+" ");
    int l=s.length();
    int i;
    char ch;
        for(i=t;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch==32) System.out.print(s.charAt(i+1)+".");
    }
    
}
}