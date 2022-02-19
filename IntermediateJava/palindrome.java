public class palindrome
{
void main(String s)
{
    int l=s.length();
    String rev="";
    char ch;
    int i;
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        rev=ch+rev;
    }
    if(rev.equals(s))
    System.out.println(s+" is a palindrome");
    else
    System.out.println(s+" is not a palindrome");
}
}