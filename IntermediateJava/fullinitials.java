import java.util.*;
public class fullinitials
{
    void main(String s)
    {
        StringTokenizer st=new StringTokenizer(s);
        String w;
        int l=st.countTokens();
        int i;
        for(i=1;i<=l;i++)
        {
            w=st.nextToken();
            System.out.print(w.charAt(0)+".");
        }
    }}