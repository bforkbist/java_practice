package java_practice;

import java.util.Scanner;

class decision_making{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  a=in.nextInt();
        if(a>=0){
            if (a>0 && a<=10)
                System.out.println("greater than 0 less than 10");
            else if(a>10 && a<=100)
                System.out.println("greater than 10 less than 100");
            else if(a>100 && a<=1000)
                System.out.println("greater than 100 less than 1000  ");
            else if(a>1000 && a<=10000)
                System.out.println("greater than 1000 less than 10000  ");
            else if(a>10000 && a<=100000)
                System.out.println("greater than 10000 less than 100000  ");
            else if(a>100000 && a<=1000000)
                System.out.println("greater than 100000 less than 1000000  ");
            else
                System.out.println("greater than 1000000  ");
        }else {
            if(a<0 && a>=-10)
                System.out.println("greater  than -10 less than 0  ");
            else if(a>-100 && a<=-10)
                System.out.println("greater than -100 less than  -10 ");
            else if(a>-1000 && a<=-100)
                System.out.println("greater than -1000 less than -100  ");
            else if(a>-10000 && a<=-1000)
                System.out.println("greater than -10000 less than  -1000 ");            
            else if(a>-100000 && a<=-10000)
                System.out.println("greater than -100000 less than  -10000 ");
            else if(a>-1000000 && a<=-100000)
                System.out.println("greater than -1000000 less than  -100000 ");
            else
                System.out.println("less than -1000000  ");
        }

        char j= in.next().charAt(0);

        //switchcase 
        switch(j){
            case '+': System.out.println("+");
                break;
            case '1': System.out.println("1");
                break;
            case 'a': System.out.println("a");
                break;
            default: System.out.println("worng choice");
        }
        in.close();
        
    }
}
