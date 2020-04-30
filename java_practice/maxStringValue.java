import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next()+in.nextLine();
        HashMap<Character,Integer> h = new HashMap<>();
        char a='a';
        for(int i=0;i<26;i++){
            h.put(a++,i+1);
        }
        String[] j=s.toLowerCase().split(" ");
        String t="";
        int sum=0;
        for(int i=0;i<j.length;i++){
            int total=0;
            if(j[i]!=null){
                char[] d =j[i].toCharArray();
                for(char c : d){
                    total=total+h.get(c);
                }
            }
            if(total>sum){
                sum=total;
                t=j[i];
            }
        }
        System.out.println(t);

    }
}