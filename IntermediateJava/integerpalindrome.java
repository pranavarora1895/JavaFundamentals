public class integerpalindrome
{
void main(int n)
{
    String s=String.valueOf(n);
    int l=s.length();
    char ch;
    String rev="";
    int i;
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        rev=ch+rev;
    }
    if(rev.equals(s))
System.out.println("palindrome integer");
else
System.out.println("Not a plaindrome integer");
}
}