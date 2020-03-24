package exceptions.excercise4;

public class ex4_class {
    public static void f() throws ex4 {
        System.out.println("f()");
        throw new ex4("Ouch from f()");

    }

    public static void main(String[] args) {
        try {
            f();
        } catch(ex4 e) {
            System.err.println("Caught Exception4");
            e.printStackTrace();
            e.showString();
        }
    }

}
