package exceptions.excercise6Logger;
import java.io.*;
import java.util.logging.Logger;

public class Exception2 extends Exception {
    private static Logger logger = Logger.getLogger("Logging Exception 222");
    public Exception2(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    };
}
