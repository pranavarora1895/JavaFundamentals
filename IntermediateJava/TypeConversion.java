public class TypeConversion
{
    void main(){
        int a; float b; double c;
        c = 10.0;
        a = (int)c;
        b= 4.5f;
        System.out.println(((Object)c).getClass().getSimpleName());
        System.out.println(((Object)b).getClass().getSimpleName());

    }
    
}
