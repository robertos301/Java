package exceptions.exercise20;

public abstract class Inning {
    public Inning() throws BaseballException{}
    public void event() throws BaseballException{}
   // public abstract void atBat() throws Strike, Foul, UmpireArgument;
    public void questionableCall() throws UmpireArgument{}
    public void walk(){} //throws no checked expressions
}
