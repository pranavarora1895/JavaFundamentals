public class Fibonacci
{
 void main(){
     int a,b,c,i;
     a = 0;
     b = 1;
        
     System.out.println(a);
     System.out.println(b);
     
     for(i=0;i<=10;i++){
         c = a+b;
         System.out.println(c);
         a = b;
         b = c;
     }
    }
}
