public class initialsofname
{
void main(String s)
{
    s=" "+s;
    s=s.toUpperCase();
    int l=s.length();
    String ini="";
    char ch;
    int i;
    System.out.println(s);
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch==32)ini=ini+s.charAt(i+1)+'.';
    }
    System.out.println(ini);
    
}}