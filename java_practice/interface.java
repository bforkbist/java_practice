interface Interface1 {// interface kisi bhi function ko decalre krta h taaki baar baar confusion na ho
   default public void display(){ /*default ka kaam h ke jo bhi call kre is fuction ko toh apni value 
                                    define kre nhi toh default value aayegi */
        System.out.println("hey we are in default and inplementing interface1");
    }
}
interface Interface2 {
    public void output();
}
class A implements Interface1{// single interface
    public void display(){
        System.out.println("hey we are in class a and inplementing interface1");
    }
}
class B implements Interface1,Interface2{// multiple interface
    
    public void output(){
        System.out.println("hey we are in class b and inplementing interface2");
    }
    public B(){
        System.out.println("constructor of b");
    }
}
class C{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.display();
        b.display();
        b.output();
    }
}