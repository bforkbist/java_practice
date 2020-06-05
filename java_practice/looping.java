package java_practice;

//import java.util.*;

class looping{
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        // for loop when you know the length of iteration
        for (int i = 0; i < 10; i++) {
            System.out.println("hello "+i);
        }
        //while is used when you don't know the no. of iterations
        int i=0;
        while(i<10){
            
            System.out.println("hey"+(i++));
            
        
	}
	// do while loop runs at least once
	do{
        System.out.println("hey we are in do while loop and i ="+i);
        i++;
	}while(i==10);
	
	
    }

}
