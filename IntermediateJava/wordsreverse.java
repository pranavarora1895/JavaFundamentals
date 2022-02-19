import java.util.*;
public class wordsreverse
{
    void main(String s)
    {
        System.out.println(s);
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
        int i;
        String w;
        for(i=1;i<=l;i++)
        {
            w=st.nextToken();
            StringBuffer sb=new StringBuffer(w);
            sb=sb.reverse();
            System.out.println(sb);
        }
    }}