interface Parts{
    void function();
    void tyres();
}
abstract class Operation implements Parts{
    void drive(){
        System.out.println("I am driving");
    }
    void repair(){
        System.out.println("I need Repairs");
    }
    public void function(){
        System.out.println("My function is to operate");
    }
    public void tyres(){
        System.out.println("My tyres are bald");
    }
}

class Vehicle extends Operation{

    @Override
    public void tyres() {
        super.tyres();
        System.out.println("I have minimum 2 tyres");
    }


}
public class PracticeInAbInt {
    public static void main(String[] args) {
    Vehicle vehicle= new Vehicle();

    vehicle.tyres();
    vehicle.drive();
    vehicle.function();
    vehicle.repair();
    }
}
