public class Par28 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10;
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception i ){
            System.out.println(i);
        }
        finally {
            System.out.println("this is finally keyword");
        }
    }
}
