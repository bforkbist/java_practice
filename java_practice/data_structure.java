package java_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class data_structure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        // array
//        // creating and initializing
//        int[] a;
//        char b[]= new char[20];
//        a = new int[10];
//        String s= in.next();
//        b=s.toCharArray();
//        for( int j = 0;j < a.length;j++){
//            a[j]= Integer.parseInt(String.valueOf(b[j]));
//            System.out.println(a[j]);
//        }
//        // Strings
//        String s=in.next(); //just commentout above part for s and b
//        char[] d=s.toCharArray();
//        String b = new String(d);
//        System.out.println(s);
//        System.out.println(d);
//        System.out.println(b);
//
//        // hashmap
//        HashMap< Integer, String > map= new HashMap<>();
//        for (int i = 0; i < 2; i++) {
//            map.put(in.nextInt(), in.next());
//        }
//        for (int i : map.keySet()) {
//            System.out.println(i + " : " + map.get(i));
//        }
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.containsValue("aditya"));
//        System.out.println(map);
//        System.out.println(map.remove(1));
//        System.out.println(map);
//        map.clear();
//        System.out.println(map);
//

        // // linkedlist
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.add("A");
        // ll.add("b");
        // ll.add(1);
        // ll.add(-1);
        // ll.add(10000);
        // ll.addFirst(3);
        // ll.addLast(5);
        // ll.add(3,56);
        // System.out.println(ll.get(0));
        // System.out.println(ll.size());
        // System.out.println(ll);
        // System.out.println(ll.remove(4));//removing
        // System.out.println(ll);

        // //iterating through a list\
        // ListIterator ls = ll.listIterator(0);
        // while(ls.hasNext()){
        //     System.out.println(ls.next());
        // }
            

        // //arraylist
        // ArrayList<String> al = new ArrayList<>();
        // Iterator<String> als = al.iterator();
        // al.add("a");
        // al.add("b");
        // System.out.println(al);
        // al.remove(0);
        // System.out.println(al);
        // al.add(1,"5");
        // al.add("7");
        // while(als.hasNext()){
        //     System.out.println(als.next());
        // }
        // System.out.println(al);


        
        in.close();
    }
}