class Circle{
    public int radius;
    Circle(){
        System.out.println("I am Circle class contractor !");
    }
    Circle(int r){
        System.out.println("I am Circle class contractor !");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Practice11 {
    public static void main(String[] args) {
//        Circle ci=new Circle();
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println(obj.volume());
    }
}
