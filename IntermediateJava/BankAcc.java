public class BankAcc
{
protected static int nextAccNo=1;
protected String firstName;
protected String surName;
protected String address;
protected int accNo;
protected double balance;

public BankAcc(String fn,String sn,String ad)
{
    firstName=fn;
    surName=sn;
    address=ad;
    balance=1000;
    accNo=nextAccNo;
    ++nextAccNo;
}
public double getBalance()
{
    return balance;
}
public void deposit(double amount)
{
    balance=balance+amount;
}
public void withdraw(double amount)
{
    if((balance-amount)>1000)
    balance=balance-amount;
    else
    System.out.println("Can't withdraw as the min. balance would be < 1000 after this withdrawl");
}
public void display()
{
System.out.println("\nCustomer "+firstName+" "+surName);
System.out.println("Account No.= "+accNo);
System.out.println("Account balance = "+(balance-1000.0));
}
}
