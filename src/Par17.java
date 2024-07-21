class Ghanshyambhai{
    private  int i ;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class Tanvi extends Ghanshyambhai{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Par17 {
    public static void main(String[] args) {
        Tanvi G = new Tanvi();
        G.setI(140);
        System.out.println(G.getI());

    }
}
