import java.util.Scanner;
public class Prime
{
public static void main(){
    Scanner sc = new Scanner(System.in);
    Prime p = new Prime();
    System.out.println("Enter the choice(p=prime/t=twin prime)");
    char ch = sc.next().charAt(0);
    
    switch(ch){
        case 'p':
            System.out.println("Enter a number");
            int number = sc.nextInt();
            boolean isPrime = p.checkPrime(number);
            if(isPrime) System.out.println(number+" is Prime.");
            else System.out.println(number+ "is not prime.");
            break;
        case 't':
            System.out.println("Enter first number");
            int first = sc.nextInt();
            System.out.println("Enter second number");
            int second = sc.nextInt();
            boolean isTwin = p.twinPrime(first,second);
            if(isTwin) System.out.println("The numbers are Twin Prime.");
            else System.out.println("The numbers are not prime.");
            break;
        default:
            System.out.println("Invalid Value");
            
            
    }

    
}

boolean checkPrime(int num){
    for(int i=2;i<num;i++){
        if(num%i==0) return false;
    }
    
    return true;
    
}

boolean twinPrime(int a, int b){
    if (checkPrime(a) && checkPrime(b) && Math.abs(a-b)==2) return true;
    
    return false;
}
}
