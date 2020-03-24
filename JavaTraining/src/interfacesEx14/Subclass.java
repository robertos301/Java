package interfacesEx14;

public class Subclass extends BaseClass implements InterfaceCombinatron {
    public void methodOne(){System.out.println("Method one from subclass");}
    public void methodTwo(){System.out.println("Method two from subclass");}
    public void methodThree(){System.out.println("Method three from subclass");}
    public void methodFour(){System.out.println("Method four from subclass");}
    public void methodSeven(){System.out.println("Method seven from subclass");}
    public void methodFive(){System.out.println("Method five from subclass");}
    public void methodSix(){System.out.println("Method six from subclass");}

    public static void interOne(InterfaceOne i){
        System.out.println("SC as interface one: ");
    }
    public static void interTwo(InterfaceTwo i){
        System.out.println("SC as interface two: ");
    }
    public static void interThree(InterfaceThree i){
        System.out.println("SC as interface three: ");
    }
    public static void interFour(InterfaceCombinatron i){
        System.out.println("SC as interface four: ");
    }



}
