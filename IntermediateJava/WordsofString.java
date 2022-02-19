import java.util.*;
public class WordsofString
{
void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter any String: ");
    String s=sc.nextLine();
    s=" "+s.toUpperCase();
    int l=s.length();
    int i;
    char ch;
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch==32) System.out.println();
        else
        System.out.print(ch);
    }
}
}
