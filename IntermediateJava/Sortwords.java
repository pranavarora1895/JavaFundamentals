import java.util.*;
public class Sortwords
{
void  main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a STRING: ");
    String s=sc.nextLine();
    StringTokenizer st=new StringTokenizer(s);
    int l=st.countTokens();
    int i,j,k;
    String a[]=new String[l];
    for(i=0;i<l;i++)
    a[i]=st.nextToken();
    String d="";
    for(j=0;j<l-1;j++)
    for(k=0;k<l-j-1;k++)
        if(a[k].compareTo(a[k+1])>0)
            {   d=a[k];
                a[k]=a[k+1];
                a[k+1]=d;
            }
    for(i=0;i<l;i++)
    System.out.println(a[i]);
}}
    