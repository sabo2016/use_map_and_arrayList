package fifthclass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by boruto on 6/12/17.
 */
public class MapHwTest {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(123,"abc");
        map.put(456,"xyz");

        //Using entry set
        for (Map.Entry<Integer, String> val:map.entrySet()){
            System.out.println(val.getKey()+" => "+val.getValue());
        }

        //Using Iterator and entry set
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> value = iterator.next();
            System.out.println(value.getKey()+" => "+value.getValue());
        }

        //Using keyset()
        for(Integer key:map.keySet()){
            System.out.println(key+ " => "+map.get(key));
        }

    }
}
