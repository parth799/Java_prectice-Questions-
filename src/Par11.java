public class Par11 {
    static void aqw(){
        System.out.println("my name is parth desai");
        System.out.println("I am a good boy");
    }
        int sum(int a,int b){
        int sum;
        if (a>b) {
            sum = a + b;
        } else if (a<b) {
            sum = a-b;
        }else {
            sum = 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        aqw();
        int a = 15;
        int b = 12;
        int c;
        Par11 pa = new Par11();
        c=pa.sum(a,b);
        int a1=10;
        int b1=12;
        int c1;
        c1 =pa.sum(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
