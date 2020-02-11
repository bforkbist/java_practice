package java_practice;

import java.util.Scanner;

class io{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte b=127;
        char c='a';
        short s=32677;
        int i=1000000;
        long l=100000l;
        float f=150000f;
        double d=15000000;

        //output

        System.out.println("byte: "+b);
        System.out.println("char: "+c);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);

        // input opertaion 
        b=in.nextByte();
        c=in.next().charAt(0);
        s=in.nextShort();
        i=in.nextInt();
        l=in.nextLong();
        f=in.nextFloat();
        d=in.nextDouble();

        System.out.println("byte: "+b);
        System.out.println("char: "+c);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        
        System.out.println(in.next());
        in.close();
        
    }
}