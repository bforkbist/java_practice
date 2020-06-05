
import  java.util.*;
// keep in mind that static main can call only static fuction so its better
// to have another class object to perfrom operation on fuctions
class Fuctions{
    private static int a;
    private static int b;
    public static void input(){
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        in.close();
    }

    public static int add(final int c, final int d) {
        return c + d;
    }

    public static int sub(final int a, final int b) {
        return a - b;
    }

    public static void main(final String[] args) {
        input();
        final int d = add(4, 5);
        System.out.println(d);
        System.out.println(sub(a,b));
    }   
}