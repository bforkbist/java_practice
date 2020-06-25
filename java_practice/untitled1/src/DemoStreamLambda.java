import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    private int id;
    public String name;
    public int marks;
    Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

}
public class DemoStreamLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aditya");
        list.add("Ankush");
        list.add("Ritu");
        list.add("rashika");
        list.add("Deepak");
        list.add("Abhinay");
        int[] arr={1,2,3,4,5,6,7,8,9};
        list.stream().reduce((string1,string2)-> string2+" "+string1).toString();//to add string
        List <Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        int sum =intList.stream().reduce(0,(a,b)->a+b);//to add no.s
        System.out.println(sum);

        System.out.println(list.stream().reduce((word,word1)->word.length()<word1.length()?word:word1));//larger

        System.out.println(intList.stream().max(Comparator.comparing(Integer::valueOf)).get());
        Student[] st= {
                new Student(1,"aditya",100),
                new Student(2,"Ritu",80),
                new Student(3,"Ankush",90)
        };
        Stream<Student> studentStream = Stream.of(st);
        List<Student> studentList= studentStream.collect(Collectors.toList());
        studentList.forEach(e->System.out.println(e));
        studentList.forEach(System.out::println);

        studentList.stream().filter(e->e.getMarks()>80).forEach(System.out::println);//geting the filter to work
        System.out.println(studentList.stream().reduce((word,word1)->word.getMarks()>word1.getMarks()?word:word1));



    }
}
