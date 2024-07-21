import java.util.*;
public class Practice6 {
//    static void multiplication(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d X %d = %d\n", n, i, n * i);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your number : ");
//        int a = sc.nextInt();
//        multiplication(a);
//    }
    static void sta(int a){
        for (int i = 0; i <= a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }
                System.out.print("\n");
            }
    }
    static int sum(int x,int ...p){
        int r=x;
        for (int e:p){
            r=r+e;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your number : ");
//        int a = sc.nextInt();
//        sta(a);
        System.out.println("Enter your number :" +sum(5,6,7,8,9));
}
}
