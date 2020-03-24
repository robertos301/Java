package polimorphismEx16;

public class MainClassEx16 {
    public static void main(String[] args){
        Starship starship = new Starship();
        starship.fireAlert();

        starship.changeStatusWarning();
        starship.fireAlert();

        starship.changeStatusCritical();
        starship.fireAlert();
    }
}
