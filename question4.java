package JAVA8;
import java.util.function.Supplier;
class Employee{
    String city;
    String name;
    int age;
    Employee(String name, int age, String city){
        this.name  = name;
        this.age = age;
        this.city = city;
        System.out.println(name+" "+age+" "+city);
    }

}
public class question4 {
    public static void main(String[] args){
        Supplier<Employee> e = ()->new Employee("Harshit",22,"Delhi");
        System.out.println(e.get());
    }

}
