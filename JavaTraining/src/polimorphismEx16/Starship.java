package polimorphismEx16;

public class Starship {
    private AlertStatus as = new OkayStatus();
    public void changeStatusWarning() { as = new WarningStatus();}
    public void changeStatusCritical(){ as = new CriticalStatus();}
    public void fireAlert(){as.alert();}
}
