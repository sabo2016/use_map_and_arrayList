package fifthclass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by boruto on 6/12/17.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("xyz");
        set.add("xyz");
        set.add("abcd");

        //Using Iterator
        /*Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        */

        //Using advance for loop
        for(String val:set){
            System.out.println(val);
        }
    }
}
