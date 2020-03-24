package exceptions.excercise6Logger;
import java.util.logging.*;
import java.io.*;
public class Exception1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException_String");
    public Exception1(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
