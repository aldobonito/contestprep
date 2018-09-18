import java.util.*;

public class MapDemo {

   public static void main(String[] args) {
      /* There are a number of 'associative arrays'
       * in Java, with 'Map' being an 'interface' which
       * they all implement, which gives a way to convert
       * from one to the other
       *
       * The use case of these is to have a memory-efficient
       * way to store values which can be searched in a very
       * small amount of time (linear time or O(1), usually)
       *
       * In collections, you'll find:
       * Set
       * Queue
       * Dequeue
       * HashMap
       * List
       * SortedMap
       * SortedSet
       * ArraySet
       *
       * All of which have various uses, but a HashMap is by
       * far the most common, and the one which you'll use
       * most often, so we'll start with that
       *
       * The declaration is something new here, and it's because
       * a Map is declared with a "Generic" type, so it is not
       * fixed. Passing the data types in <> gives a concrete
       * object which can be worked with
       */
      Map<String, Integer> m = new HashMap<String, Integer>(); 

      /* Each element corresponds 1:1 with an value, so
       * m.get("Ryan") would return my age.
       *
       * You can also get a list of all of the 'keys' (names),
       * values, total number of items, etc
       */
      m.put("Abbas", 16);
      m.put("Ryan", 35);
      m.put("Joey", 37);
      m.put("Yaniv", 56);

      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m + "\n");
   }
}
