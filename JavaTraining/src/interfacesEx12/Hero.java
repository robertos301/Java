package interfacesEx12;

import java.awt.*;

public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim(){};
    public void fly(){};
    public void climb(){};
}
