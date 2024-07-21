import java.util.*;
public class Par9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("while loops :");
//        while (true) {
//            System.out.print("enter your number to print loops : ");
//            int a = sc.nextInt();
//            int i = 1;
//            while (i <= 10) {
//                System.out.println(a + " X " + i + " = " + a * i);
//                i++;
//            }
//        }
//        System.out.println("For loops");
//        while (true) {
//            System.out.print("enter your odd number to print : ");
//            int a = sc.nextInt();
//            for (int i = 1; i <= a; i = i + 2) {
//                System.out.println(i);
//            }
//        }
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        for(int i = a; i!=0 ; i-- ){
            System.out.println(i);
        }
    }
}
