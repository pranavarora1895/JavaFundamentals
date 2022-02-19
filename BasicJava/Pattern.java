/*
 * Program to get the pattern of n terms
 */
public class Pattern
{
    void main(){ // initializing the main() function
        int i,j; // declaring variable
        for(i=1;i<=5;i++){ // starting the first loop
            for(j=5;j>=i;j--){ // nested-loop
                System.out.print(j);
            }
            System.out.println(); // newline
        }
    }
void triangleofstars() // initializing the triangleofstars() function 
{
    int i,j,k; // declaring the variables
        
            for(i=1;i<=5;i++) 
            {
                for(j=5-i;j>=1;j--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print("* ");
                 System.out.println();
        }
    }
}
