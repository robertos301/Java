package interfacesEx12;

public class Adventure {
    public static void t (CanFight x) {x.fight();}
    public static void u (CanSwim x) {x.swim();}
    public static void v (CanFly x) {x.fly();}
    public static void w (ActionCharacter x) {x.fight();}
    public static void ww (CanClimb x) {x.climb();}
    public static void main (String [] args)
    {
        Hero h = new Hero();
        t(h); //this is a CanFight object
        u(h); //this is a CanSwimObject
        v(h); //this is a CanFly
        w(h); //this is an AcitionCharacter
        ww(h); //this is a CanClimb
    }
}
