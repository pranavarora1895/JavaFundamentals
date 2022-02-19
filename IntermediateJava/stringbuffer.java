public class stringbuffer
{
void main(String s)
{   StringBuffer sb=new StringBuffer(s);
    System.out.println(sb);
    sb=sb.append("extra");
    System.out.println(sb);
    sb=sb.insert(4,"between");
    System.out.println(sb);
    sb.setCharAt(4,'d');
    System.out.println(sb);
    sb=sb.delete(5,9);
    System.out.println(sb);
    sb=sb.reverse();
    System.out.println(sb);
}}
    
