import java.util.Scanner;
public class Palindromes
{
void main(){
    Scanner sc = new Scanner(System.in);
    int rev;
    boolean is_palindrome,is_super_palindrome;
    System.out.println("Enter a number");
    int number = sc.nextInt();
    rev = reverse(number);
    is_palindrome = isPalindrome(number);
    is_super_palindrome = isSuperPalindrome(number);
    
    System.out.println("Reverse: "+rev);
    System.out.println("Is Palindrome: "+is_palindrome);
    System.out.println("Is Super Palindrome: "+is_super_palindrome);
    
    
}
int reverse(int num){
    int r;
    int s=0;
    while(num!=0){
        r = num%10;
        s = s*10+r;
        num /=10;
    }
    return s;

}
boolean isPalindrome(int num){
    int s = reverse(num);
    if (num == s) return true;
    return false;
}

boolean isSuperPalindrome(int num){
    int sq_num = (int)Math.pow(num,2);
    if(isPalindrome(num) && isPalindrome(sq_num)) return true;
    return false;
}
}
