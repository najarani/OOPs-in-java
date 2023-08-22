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
//function overloading
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}
public class classesandobjects{
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name= "nirajan";
       s1.age = 22;
      s1.printInfo(s1.name,s1.age);
    }
}