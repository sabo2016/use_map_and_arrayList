package fifthclass;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by boruto on 6/12/17.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(123,"abc");
        map.put(456,"xyz");
        System.out.println(map.get(123));

    }
}
