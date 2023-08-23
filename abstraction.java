abstract class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        
     
    }
}
