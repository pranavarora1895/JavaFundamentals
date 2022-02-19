import java.util.*;
public class COUNTpalindromes
{
void main(String s)
{
    StringTokenizer st=new StringTokenizer(s);
    int l=st.countTokens();
    int i,cp=0;
    System.out.println("The Original String is:");
    System.out.println(s);
    System.out.println("Palindromes are ....");
    for(i=1;i<=l;i++)
    {
        String w=st.nextToken();
        StringBuffer sb=new StringBuffer(w);
        sb=sb.reverse();
        String REV=sb.toString();
        if(REV.equals(w))
        {
            System.out.println(w);
            cp++;
        }
    }
System.out.println("Total No. of Palindromes are: "+cp);
}
    }
