class cyl{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surFaceArea(){
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }
    public  double volume(){
        return 3.14*radius*radius*height;
    }
}
public class Practice9 {
    public static void main(String[] args) {

//       practice 9.1
        cyl as=new cyl();
        as.setHeight(10);
        int q = as.getHeight();
        System.out.println("cylinder height : "+q);
        as.setRadius(12);
        int w = as.getRadius();
//        practice 9.2
        System.out.println("cylinder Radius : "+w);
        System.out.println(as.surFaceArea());
        System.out.println(as.volume());




    }
}
