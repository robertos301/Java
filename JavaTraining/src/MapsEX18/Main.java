package MapsEX18;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Map <String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Rowb",new Gerbil(0));
        gerbils.put("Ameno", new Gerbil(1));
        gerbils.put("Aristotel", new Gerbil(2));
        gerbils.put("Dukadam", new Gerbil(3));

        System.out.println(gerbils);

        Set<String> sortedKeys = new TreeSet<String>(gerbils.keySet());
        System.out.println(sortedKeys);

        Map<String,Gerbil> sortedGerbils = new LinkedHashMap<String,Gerbil>();
        for(String s : sortedKeys){
            sortedGerbils.put(s,gerbils.get(s));
        }
        System.out.println();

        System.out.println(sortedGerbils.keySet());
       //it's the same as sortedGebils
        Map<String, Gerbil> sortedGerbils2 = new TreeMap<String,Gerbil>(gerbils);
        System.out.println(sortedGerbils2);
    }
}
