package IteratorsEX11;
import java.util.*;
public class SomeClass {
    public static void printA(Collection c){
        Iterator it = c.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> al =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        LinkedList<Character> ll =
                new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
        HashSet<Float> hs =
                new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
        TreeSet<Double> ts =
                new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
        LinkedHashSet<Integer> lhs =
                new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
        printA(al);
        printA(ll);
        printA(hs);
        printA(ts);
        printA(lhs);
    }

}
