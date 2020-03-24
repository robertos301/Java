package exceptions.excercise6Logger;

public class ex6  {
    static void f() throws Exception1, Exception2{
        throw new Exception1();
    }
    static void g() throws Exception1, Exception2{
        throw new Exception2();
    }

    public static void main(String [] args){
            try{
                f();
            }
            catch (Exception Exception1 ){}
            try{
                g();
            }
            catch(Exception Exception2){}
    }
        }


