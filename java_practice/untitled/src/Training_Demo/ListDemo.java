package Training_Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ram");
        arrayList.add(0,"sam");
        arrayList.add("Ritu");
        for(String s: arrayList ){
            System.out.println(s);
        }


        LinkedList<Integer> linkList =new LinkedList();
        linkList.add(5);
        linkList.add(7);
        linkList.add(8);
        linkList.add(5);
        linkList.add(7);
        System.out.println(linkList.contains(8));
        linkList.remove(2);
        for(int i : linkList){
            System.out.println(i);
        }
        System.out.println(linkList.contains(8));


    }


}
