package fifthclass;

import java.util.ArrayList;

/**
 * Created by boruto on 6/12/17.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(5);
        for(Integer val:list){
            System.out.println(val);
        }
    }
}
