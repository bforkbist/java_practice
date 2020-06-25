interface Addition{
    public int add(int a, int b);
}
class operate implements Addition{
    @Override
    public int add(int a, int b){
        return a+b;
    }
}
public class FunctionalDemo {
    public static void main(String[] args) {
        Addition ad = new operate();
        int x=ad.add(3,5);
        System.out.println(x);

        Addition ad2 =(a,b)->{
            System.out.println("Hello this is a lambda fuction");
            return a+b; };
        System.out.println(ad2.add(3,5));

    }
}
