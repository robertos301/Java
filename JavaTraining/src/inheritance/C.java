package inheritance;

public class C extends A{
    C(int i){
        super(i);
        B b = new B(i);
    }


}
