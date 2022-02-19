import java.util.*;
public class vowels
{
void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a String: ");
    String s=sc.nextLine();
    s=s.toUpperCase();
    int l=s.length();
    int i;
    char ch;
    int v=0;
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')v++;
    }
    System.out.println("Total no. of Vowels are : "+v);
}
}