// we will create an interface for shapes
//it be implemented on different class
//we will also create an abstract class -> area, volume
interface Shapes{
    void size();
    void area();
}
abstract class find implements Shapes{
    int length;
    int width;
    int  primeter(int a, int b){
        int pero=2*(a+b);
        return pero;
    }
    int area(int a,int b){
        System.out.println("I am a rectangle");
        int ar=a*b;;
        return ar;
    }
    int area(int a){
        int ar=a*4;
        System.out.println("I am a square");
        return ar;
    }

}
class Square extends find{

    @Override
    public void size() {
        System.out.println("hi this if from interface");
    }
    @Override
    public void area(){
        System.out.println("I present area");
    }
}
public class TrainingDemo1 {
    public static void main(String[] args) {
        Square sq= new Square();
        int a=sq.area(3);
        System.out.println(a);
        sq.area();
        int r=sq.area(7,8);
        System.out.println(r);
        sq.size();
        int z=sq.primeter(7,8);
        System.out.println(z);

    }
}
