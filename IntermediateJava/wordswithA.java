import java.util.*;
public class wordswithA
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
            char ch=w.charAt(0);
            if(ch=='A'||ch=='a')
            System.out.println(w);
            
        }
    }}