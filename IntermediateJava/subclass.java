class subclass extends baseclass
{
    void calc()
    {
        double si=p*r*t/100;
        double ci=p*Math.pow((1+r/100),t)-p;
        System.out.println("si= "+si);
        System.out.println("ci= "+ci);
    }
}