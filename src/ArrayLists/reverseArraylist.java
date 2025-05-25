package ArrayLists;

import java.util.ArrayList;

public class reverseArraylist {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println("----Reversed Array----");



        for(int i=list.size()-1; i >= 0; i--){

            System.out.print(list.get(i)+ "  ");
        }
        System.out.println();


    }

}
