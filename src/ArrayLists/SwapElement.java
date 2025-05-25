package ArrayLists;

import java.util.ArrayList;

public class SwapElement {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);

        System.out.println(list);

      int temp = list.get(1);
      list.set(1, list.get(2)) ;
      list.set(2, temp) ;

        System.out.println("----Swaped----");
        System.out.println(list);

    }
}
