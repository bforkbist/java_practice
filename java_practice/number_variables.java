
class number{
    public static void main(String[] args) {
        byte b=127;
        char c='a';
        short s=32677;
        int i=1000000;
        long l=100000l;
        float f=150000f;
        double d=15000000;
        System.out.println("byte: "+b);
        System.out.println("char: "+c);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        

        //operators
        System.out.println("byte: "+ (b++));
        System.out.println("char: "+ (c--));
        System.out.println("short: "+ (++s));
        System.out.println("int: "+ (--i));
        System.out.println("long: "+ (+l));
        System.out.println("float: "+ (-f));
        System.out.println("double: "+ (d));


    }
}