// ******** this and super keyword in Java ********
class one {
    int x;
    public int getX() {
        return x;
    }
    one(int x) {
        this.x = x;
    }
}
public class Par19 {
    public static void main(String[] args) {
        one o= new one(10);
        System.out.println(o.getX());
    }
}
