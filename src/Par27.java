class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class Par27 {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int you(int a,int b)throws ArithmeticException{   //throws keyword ***********
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
        int c = you(6 ,1);
        System.out.println(c);
        double d = area(6);
        System.out.println(d);
        }
        catch (Exception e){
            System.out.println("this is Exception!");
        }
    }
}
