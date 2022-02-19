import java.util.*;
import java.io.*;
public class longInitialswithgender
{
void main()throws IOException
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your name: ");
    String s=sc.nextLine();
    System.out.print("enter your gender(M/F): ");
    char gender=(char)System.in.read();
    s=" "+s.toUpperCase();
    int l=s.length();
    int i;
    char ch;
    int x=s.lastIndexOf(32);
    if(gender=='M')System.out.print("Mr. ");
    if(gender=='F')System.out.print("Ms. ");
    for(i=0;i<x;i++)
    {
        ch=s.charAt(i);
        if(ch==32) System.out.print(s.charAt(i+1)+".");
    }
    System.out.print(s.substring(x));
}
}
