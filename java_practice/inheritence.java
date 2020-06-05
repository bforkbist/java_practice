class A{
    public int x=56;
    public void out(){
        System.out.println("parent");
    }
}

class B extends A{
    public int y=44;
    
    public void out1(){
        int z= x+y;
        System.out.println("z = "+z);
    }
}
class inheritence {
    public static void main(String[] args) {
        B b =new B();
        System.out.println("hello");
        b.out();
        b.out1();
    }
}