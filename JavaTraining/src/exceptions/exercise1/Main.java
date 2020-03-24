package exceptions.exercise1;

public class Main {
   public static void f() throws ExceptionEx1{
       System.out.println("Throwing exception from f() !");
       throw new ExceptionEx1("From f() !");
   }

    public static void main(String[] args) {

        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hi din finally!");
        }
    }
}