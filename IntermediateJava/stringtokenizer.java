import java.util.*;
public class stringtokenizer
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
    { System.out.println(st.nextToken());
        
    }
}
}