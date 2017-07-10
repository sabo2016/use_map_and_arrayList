package fifthclass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by boruto on 6/12/17.
 */
public class MyStackMain {
    public static void main(String[] args) {
        MyStack obj= new MyStack();
        /*obj.push("abc");
        obj.push("bcd");
        obj.push("xyz");*/

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Elements on Stack");
        for(String val:list){
            System.out.println(val);
        }
*/
        boolean flag = obj.isEmpty();
        while(flag){
        System.out.println("1.push\n2.pop\n3.display");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter String to push");
                String value = scanner.next();
                obj.push(value);
                break;

            case 2:
                String returnValue = obj.pop();
                System.out.println(returnValue + " is popped out.");
                break;
            case 3:
                ArrayList<String> list = obj.getList();
                System.out.println("Elements in Stack:");
                for(int i=list.size()-1;i>=0;i--){
                    System.out.println(list.get(i));
                }
                break;

            case 4:
                flag = false;
                break;


        }
        }
    }
}
