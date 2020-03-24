package exceptions.excercise4;

public class ex4 extends Exception {
    private String msg;
    ex4(String msg) {
        super(msg);
        System.out.println("Exception4()");
        this.msg = msg;
    }
    protected void showString() {
        System.out.println("Message from Exception4: " + msg);
    }
}
