// **********  Constructors in Inheritance in Java ***********
class Base{
    Base(){
        System.out.println("I Am Contractor!");
    }
    Base(int a){
        System.out.println("I Am Contractor a : " + a);
    }
}
class Derived extends Base{
    Derived(){
//        super(10);
        System.out.println("I Am Derived Class Contractor!");
    }
    Derived(int a,int b){
        super(a);
        System.out.println("I Am Derived Class Contractor b : " + b);
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I Am ChildOfDerived Class Contractor!");
    }
    ChildOfDerived(int a,int b,int c){
        super(a,b);
        System.out.println("I Am ChildOfDerived Class Contractor c : " + c);
    }
}
public class Par18 {
    public static void main(String[] args) {
//        Base b = new Base(10);
//        Derived d = new Derived(58,66);
        ChildOfDerived cd = new ChildOfDerived(12,52,585);
    }
}
