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
   
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}
public class classesandobjects{
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name= "nirajan";
       s1.age = 22;
       Student s2 = new Student(s1);
       s2.printInfo();
    }
}