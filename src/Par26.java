import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I Am Parth";
    }

    @Override
    public String getMessage() {
        return "I am Get Message";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return " your age is above 18";
    }

    @Override
    public String getMessage() {
        return "Your age is under 18";
    }
}
public class Par26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = sc.nextInt();
        if (a<10){
//            try {
////                throw new MyException();
//                throw new ArithmeticException(" I Am ArithmeticException");
//            }
//            catch (Exception e){
//                System.out.println( e.getMessage());
//                System.out.println( e.toString());
//
////                System.out.println(e);
//                e.printStackTrace();

                try {
                throw new MaxAgeException();
            }
            catch (Exception e){
                System.out.println( e.getMessage());
                System.out.println( e.toString());

//                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
