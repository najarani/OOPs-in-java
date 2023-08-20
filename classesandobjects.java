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

public class classesandobjects{
    public static void main(String[] args) {
       Pen pen = new Pen();
       pen.color= "blue";
       pen.type ="gel";
       Pen pen1 = new Pen();
       pen1.color = "Red";
       pen1.type = "Ball";
       pen.printColor();
       pen1.printColor();
       Pen pen2 = new Pen();
       pen2.color = "Green";
       pen2.type = "Ink";
    }
}