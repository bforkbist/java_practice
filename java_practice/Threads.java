
class MyThread2 extends Thread {

    MyThread2(String s) {
        super(s);
    }

    public void run() {
        System.out.println("thread running " + Thread.currentThread().getName());
        System.out.println("priority " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("priority of " + Thread.currentThread().getName()+ " is " +Thread.currentThread().getPriority());


    }
}

public class Threads{
    

    public static void main(String[] args) throws InterruptedException {
        MyThread2 mt = new MyThread2("hello");
        MyThread2 mt2 = new MyThread2("hi");
        // mt.setName("hello");
        
        mt.start();
        mt.join();
        mt2.start();
        
        
        
        
        // System.out.println(mt.getPriority());
        // mt.stop();
    }
    
}