package ja
import java.util.HashMap;
import java.util.Scanner;

class New{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        char[] array=s.split(",");
        HashMap<Character,Integer> h = new HashMap<>();
        for(char i : array){
            if(h.containsKey(i)){
                h.put(i, h.get(i)+1);
            }else{
                h.put(i, 1);
            }
        }
        System.out.println(h);
        in.close();
    }
}