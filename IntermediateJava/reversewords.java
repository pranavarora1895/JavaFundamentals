import java.util.*;
public class reversewords
{
void  main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a STRING: ");
    String s=sc.nextLine();
    StringTokenizer st=new StringTokenizer(s);
    int l=st.countTokens();
    int i;
    for(i=1;i<=l;i++)
    { String n=st.nextToken();
        int k=n.length();
        String d="";
        for(int j=k-1;j>=0;j--)
        {
        char ch=n.charAt(j);
        d=d+ch;
    }
        System.out.println(d);
    }
}
}
