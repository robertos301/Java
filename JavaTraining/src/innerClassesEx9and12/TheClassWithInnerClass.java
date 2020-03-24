package innerClassesEx9and12;
/*

public class TheClassWithInnerClass {
    public TheInterface metodaRetInterfata(){
        class InnerClass implements TheInterface {
            private String label ;
            private InnerClass(String text){
                label=text;
            }
            public void print(){System.out.println("label: "+label);}
        }
        return new InnerClass("tuica");

    };

    public static void main (String[] args){
        TheClassWithInnerClass cwic = new TheClassWithInnerClass();
        TheInterface ti = cwic.metodaRetInterfata();
        ti.print();
    }
}
*/

/*
public class TheClassWithInnerClass {
    private int oi = 1;
    private void hi() { System.out.println("Outer hi"); }
    public TheInterface inner() {
        return new TheInterface() {
            public void modifyOuter() {
                oi *= 2;
                hi();
            }
        };
    }
    public void showOi() { System.out.println(oi); }
    public static void main(String[] args) {
        TheInterface out = new TheInterface();
        out.showOi();
        out.inner().modifyOuter();
        out.showOi();
    }
}
*/