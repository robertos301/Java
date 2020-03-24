package nestedClassesEX18;

public class NestedClass {

    private static class BuildContent implements Content {
        private int i = 50;
        public int getNumber(){return i;}
    }

    public static Content content(){
        return new BuildContent();
    }


    public static void main (String[]args){
        Content c = content();
        System.out.println(c.getNumber());
    }
}
