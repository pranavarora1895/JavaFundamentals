class savingsAcc extends BankAcc
{
   private double rate;
   public void interest(int months)
   {
       double interest;
       interest=(balance*rate/100*months/12);
       balance=balance+interest;
   }
   public savingsAcc(String fn,String sn,String ad,double r)
   {
       super(fn,sn,ad);
       rate=r;
   }
   public static void main()
   {
       BankAcc b1,b2;
       b1=new BankAcc("Rubina","Khan","D.Park");
       b2=new BankAcc("Tupur","Sen","S.Lake");
       b1.deposit(15500);
       b2.deposit(10000);
       b1.display();
       b2.display();
       b1.withdraw(5500);
       b2.withdraw(11000);
       b1.display();
       b2.display();
       savingsAcc depacc;
       depacc=new savingsAcc("Bula","Paul","P.Lane",9.0);
       depacc.deposit(10000);
       depacc.interest(10);
       depacc.display();
    }
}
   