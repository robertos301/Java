package exceptions.exercise1;

public class ExceptionEx1 extends Exception {
    public ExceptionEx1 (String text){
        super(text);
        System.out.println("ExceptionEx1(String text)");
    }
}
