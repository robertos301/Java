package polymorphismEX1;

public class Main {
    public static void initiate(Cycle c){
        c.ride();
    }
    public static void main(String [] args){
        Cycle cycle = new Cycle();
        Monocycle monocycle = new Monocycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        initiate(cycle);
        initiate(monocycle);
        initiate(bicycle);
        initiate(tricycle);

    }
}
