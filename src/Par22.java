
interface bicycle{
    void Raj();
    void Parth();
}
interface bicycle1{
    void Ravi();
    void Kavi();
}
class Tanvi1 implements bicycle,bicycle1{

    public void Raj() {
        System.out.println("Hello word");
    }
    public void Parth() {
        System.out.println("I am D HEllo ");
    }
    public void Ravi(){
        System.out.println("I am Ravi");
    }
    public void Kavi(){
        System.out.println(" I Am kavi");
    }
}
public class Par22 {
    public static void main(String[] args) {
        Tanvi1 d = new Tanvi1();
        d.Raj();
        d.Parth();
    }
}
