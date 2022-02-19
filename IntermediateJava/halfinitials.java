import java.util.*;
public class halfinitials
{
    void main(String s)
    {
        StringTokenizer st=new StringTokenizer(s);
        String w;String g="";
        int l=st.countTokens();
        int i;
        for(i=1;i<l;i++)
        {
            w=st.nextToken();
            char ch=w.charAt(0);
            g=g+ch+".";
        }
        g=st.nextToken()+" "+g;
        System.out.println(g);
    }}