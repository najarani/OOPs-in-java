class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
//single level
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*h*l);
    }
}
//multiple level
class Quadrangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//hierarchial
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class inheritance {
   public static void main(String[] args) {
    
   }
}
