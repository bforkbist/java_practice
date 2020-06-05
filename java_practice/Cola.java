import java.util.Scanner;

class Cola{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n= in.nextInt();
        String s="";
        int r = 1;
        while (r * 5 < n){
            n -= r * 5;
            r *= 2;
        }    
        s=names[(n - 1) / r] ;        
        System.out.println(s);
        in.close();
    }
}