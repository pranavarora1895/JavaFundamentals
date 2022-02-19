import java.util.*;
public class nameInitials
{
void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your name: ");
    String s=sc.nextLine();
    s=" "+s.toUpperCase();
    int l=s.length();
    int i;
    char ch;
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch==32) System.out.print(s.charAt(i+1)+".");
    }
}
}
