
class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface Animal{
    void Eat();
    void sleep();
}
class Human extends Monkey implements Animal{
    void speck(){
        System.out.println("human are speaking now");
    }
    public void Eat(){
        System.out.println("Animal is Eat now");
    }
    public void sleep(){
        System.out.println("animal is slap now");
    }
}

public class Practice12 {
    public static void main(String[] args) {
        Human Hm = new Human();
        Hm.Eat();
        Monkey m1 = new Human();  // --> polymorphism Example
        m1.bite();
    }

}
