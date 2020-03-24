package exceptions.exercise2;

public class Ex2 {
    private static Integer i = null;
    public static void main(String [] args){
        try{
            System.out.println(i.toString());
        } catch (NullPointerException e){
            System.err.println("Caught nullpointerexception.");
            e.printStackTrace();
        }

    }
}
