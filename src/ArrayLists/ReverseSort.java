package ArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);

        Collections.sort(list);
        System.out.println("-----Sort-----");
        System.out.println(list);

        System.out.println("----Reverse----");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}