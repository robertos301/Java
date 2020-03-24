public class LazyLoadedClass {
    private String s1="Asignare";
    private int i;
    private String s2; //empty variable
    private CompositionLazyLoad cll;

    LazyLoadedClass(){
        this.i = 25;
        cll = new CompositionLazyLoad();
    }

    public String toString(){
        if(s2 == null)
            s2="s2 loaded after constructor";
        return "s1= " + s1 +"\n" +
                "s2= " + s2 +"\n" +
                this.cll;
    }

}
