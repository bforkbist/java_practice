package Training_Demo;

import java.util.HashSet;

public class SetsDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        System.out.println(hs.isEmpty());
        hs.add("Ram");
        hs.add("shaam");
        hs.add("Ram");
        hs.add("sam");
        hs.add("Ram");
        hs.add("John");
        hs.forEach(a->{
            System.out.println(a);
        });
        hs.stream().filter(s->s.endsWith("m")).map(s->s).forEach(System.out::println);
        


    }
}
