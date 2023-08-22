//It was invented to help people solve real world problems through coding easily with great reference
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
} 
class Student{
    String name;
    int age;


    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        this.age = age;
        this.name = name;
    }
}
public class classesandobjects{
    public static void main(String[] args) {
       Student s1 = new Student("Nirajan",22);
       s1.printInfo();
    }
}