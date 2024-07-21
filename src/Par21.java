
abstract class parent{
    public void parent(){
        System.out.println("good morning");
    }
    abstract public void grite();
}
class child extends parent{
    @Override
    public void grite(){
        System.out.println("hello ! ,good afternoon");
    }
}
public class Par21 {
    public static void main(String[] args) {
        child c = new child();
        c.grite();
    }
}
