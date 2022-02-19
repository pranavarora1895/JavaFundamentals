/*
 * Vegetable Burgers - 4 (Rs. 45 per piece)
 * McPuff Burgers - 3 (Rs. 25 per piece)
 * Discount - Rs. 50 on the final bill
 */

public class McDonaldBill
{
 void bill(){
     // Initializing the variables
     int vegBurgers, mcBurgers, discount, vegBurgersAmount, mcBurgersAmount, totalAmount;
     
     vegBurgers = 4;
     mcBurgers = 3;
     discount = 50;
     
     // Calculating the Bill
     vegBurgersAmount = 4 * 45;
     mcBurgersAmount = 3 * 25;
     totalAmount = vegBurgersAmount + mcBurgersAmount;
     // Applying Discount
     totalAmount = totalAmount - discount;
     //Displaying the result
     System.out.println("--------------------------------------------------------");
     System.out.println("--------------------------------------------------------");
     System.out.println("------------------------McDonald's Bill-----------------");
     System.out.println("--------------------------------------------------------");
     System.out.println("--------------------------------------------------------");
     
     System.out.println("-----------------------Vegetable Burger-----------------");
     System.out.println("Quantity = "+ 4);
     System.out.println("Price per burger = "+ 45);
     System.out.println("Total Price = "+ vegBurgersAmount);
     System.out.println("-------------------------------------------------------");
     
     System.out.println("-----------------------McBurger------------------------");
     System.out.println("Quantity = "+ 3);
     System.out.println("Price per burger = "+ 25);
     System.out.println("Total Price = "+ mcBurgersAmount);
     System.out.println("-------------------------------------------------------");
     System.out.println("Discount on final price = "+ 50);
     
     System.out.println("-----------------------Final Bill------------------------");
     System.out.println("Total Price = "+ totalAmount);
     System.out.println("---------------------------------------------------------");
     System.out.println("-----------------------Thanks for visiting---------------");
 }
}
