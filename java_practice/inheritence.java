package java_practice;

class A{
    public int x=56;
    public void out(){
        System.out.println("parent");
    }
}

class B extends A{
    public int x=44;
    public void out1(){
        System.out.println("child");
    }
}
class inheritence {
    public static void main(String[] args) {
        System.out.println("hello");
        B b =new B();
        b.out();
    }
}