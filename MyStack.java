package fifthclass;

import java.util.ArrayList;

/**
 * Created by boruto on 6/12/17.
 */
public class MyStack {
    private ArrayList<String> list = new ArrayList<>();
    private String poppedValue;


    public void push(String input){
        list.add(input);
    }

    public String pop(){
        poppedValue = list.get(list.size()-1);
        list.remove(list.size()-1);
        return poppedValue;
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getList(){
        return list;
    }
}
