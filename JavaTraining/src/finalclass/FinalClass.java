package finalclass;

final class FinalClass {
    private String finalClass = "const string";
    FinalClass(String s) {
        this.finalClass = s;
    }
    FinalClass(){
        this.finalClass = "const string modified from default constructor";
    }
    void printText(String s){
        System.out.print(s);
    }
}
