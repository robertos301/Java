package exceptions.exercise3;

public class ex3 {
    private static int[] a = new int[2];
    public static void main(String[] args){
        try {
            a[3] = 12;
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Caught this ArrayOutOfIndexException");
            e.printStackTrace();
        }
    }
}
