public class Conversion
{
    void kmToMiles(){
       int km;
       double miles;
       km = 10;
       miles = 0.621 * km;
       System.out.println("Km = "+ km);
       System.out.println("Miles = "+ miles);
    }
    
    void celToFah(){
        double celcius, fah;
        celcius = 98.6;
        fah = (celcius-32)*5/9;
        System.out.println("Celcius = " + celcius + "degree celcius");
        System.out.println("Fahrenheit = " + fah + "degree fahrenheit");
    }
}
