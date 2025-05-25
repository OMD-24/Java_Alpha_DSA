package ArrayLists;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
public class printArraylist {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);

        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+ "  ");
        }
        System.out.println();

        System.out.println(list);
    }

}
