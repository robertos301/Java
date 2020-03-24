package exceptions;
import java.util.logging.*;
import java.io.*;
public class StringException extends Exception {
    private static Logger logger = Logger.getLogger("Inserted string is not Valid. It is either to long , contains spaces or is not composed from letters only.");
    public StringException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
