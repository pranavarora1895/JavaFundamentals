public class Interest
{
   void simpleInterest(){
       int principal, rate, time;
       double si;
       principal = 1000;
       rate = 10;
       time = 2;
       si = (principal * rate * time)/100;
       System.out.println("Interest = Rs."+si);
   }
   
   void compoundInterest(){
       int principal, rate, time;
       double ci;
       principal = 1000;
       rate = 8;
       time = 2;
       ci = (principal*((1+(rate/100))^time)-1);
       System.out.println("Compound Interest = "+ ci);
   }
}
