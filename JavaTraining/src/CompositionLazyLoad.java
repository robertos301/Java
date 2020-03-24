public class CompositionLazyLoad {
    private String s;
    CompositionLazyLoad (){
        System.out.println("Constructor CompositionLazyLoad Root");
        s="Construit";
    }

    public String toString() { return s; }
}
