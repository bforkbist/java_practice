package java_practice;

import java.util.Scanner;

class One{
    private int a;
    private String str;
    public String gString(){
        Scanner in = new Scanner(System.in) ;
        String str = in.next();
        return str;
    }
    public int gInteger(){
        Scanner in = new Scanner(System.in) ;
        int str = in.nextInt();
        return str;
    }
    public void display(String s) {
        System.out.println(s);
    }
    public void display(int i) {
        System.out.println(i);
    }
}
class Main{
    public static void main(String[] args) {
        One one = new One();
        int i=one.gInteger();
        String s=one.gString();
        one.display(i);
        one.display(s);
    }
}