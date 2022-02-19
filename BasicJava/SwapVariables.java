public class SwapVariables
{
    void withThirdVariable(){
        System.out.println("Swapping with using third variable");
        int a,b,c;
        a = 5;
        b = 7;
        System.out.println("--------------Before Swapping--------------------");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        
        // Interchanging the values of a and b using c
        c = a; 
        a = b;
        b = c;
    
        
        System.out.println("---------------After Swapping-----------------------");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    
    void withoutThirdVariable(){
        System.out.println("Swapping without using third variable");
        int a,b;
        
        a = 5;
        b = 7;
        
        System.out.println("--------------Before Swapping--------------------");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        
        // Interchanging the values of a and b without using third variable
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("---------------After Swapping-----------------------");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
