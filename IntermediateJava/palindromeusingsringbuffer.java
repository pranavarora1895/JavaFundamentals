
public class palindromeusingsringbuffer
{
void main(String s)
{
    StringBuffer sb=new StringBuffer(s);
    sb=sb.reverse();
    String REV=sb.toString();
    if(s.equals(REV))
    System.out.println("Yes "+s+" is a palindrome");
    else
    System.out.println(s+" is not a palindrome");
}}