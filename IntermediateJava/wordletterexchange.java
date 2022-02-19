//Exchange the first and last letter of words in a string
import java.util.*;
public class wordletterexchange
{
    void main(String s)
    {
        System.out.println(s);
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
        int i;
        String w;
        char ch1,ch2;
        for(i=1;i<=l;i++)
        {
            w=st.nextToken();
            ch1=w.charAt(0);
            ch2=w.charAt(w.length()-1);
            StringBuffer sb=new StringBuffer(w);
            sb.setCharAt(0,ch2);
            sb.setCharAt(w.length()-1,ch1);
            w=sb.toString();
            System.out.print(w+" ");
        }
    }}