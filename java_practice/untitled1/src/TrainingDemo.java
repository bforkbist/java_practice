import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student1{
    public int id;
    public String name;
    public int marks;
    Student1(int id, String name , int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class TrainingDemo {
    public static void main(String[] args) {
        Student1[] st2= {
                new Student1(1,"Ankush",70),
                new Student1(2,"Ritu",80),
                new Student1(3,"sam",40),
                new Student1(4,"Aditya",90),
        };
        Stream<Student1> studentStream = Stream.of(st2);
        List<Student1> student1List=studentStream.collect(Collectors.toList());

        System.out.println("using StudentList");
        student1List.stream().forEach(System.out::println);
        System.out.println("/n");
        student1List.stream().filter(e->e.getMarks()>50).forEach(System.out::println);

        //reduce
        int [] i={1,2,3,4,5};
        //0,1->1,2->3
        int x= Arrays.stream(i).reduce(0,(a,b)->a+b);

        System.out.println("\n");
        System.out.println(x);


        //map
        //{1,2,3,4,5}->{2,3,4,5,6}
        Arrays.stream(i).map(e->e+1).forEach(System.out::println);

        //max
        

        //min
        //limit
    }
}
