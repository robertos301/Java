package strings.exercise6;

public class Ex6 {
    int i = 0;
    long l = 0;
    float f = 0.0f;
    double d = 0.0;
    Ex6(int i , long l, float f, double d){
        this.i=i;
        this.l=l;
        this.f=f;
        this.d=d;
    }
    public String toString(){
        return String.format("int i este: %d \n long l este: %d \n float f este: %.16g \n double d este: %.16g", i,l,f,d );
    }
public static void main (String [] args){
        Ex6 x = new Ex6(1,120000, 1.23f,2.71231231231);
        System.out.println(x);
}
}

