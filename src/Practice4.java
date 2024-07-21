import java.util.*;
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number : ");
            int a = sc.nextInt();
            for (int i = a; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }
                System.out.print("\n");
            }
        }
//        System.out.print("Enter your number : ");
//        int b = sc.nextInt();
//        int sum = 0;
//        for (int i = 0;i<b;i++){
//            sum = sum + (2*i);
//        }
//        System.out.println(sum);

//        for (int i = 10;i>0;i--){
//            System.out.println(b + " X " + i + " = " + b * i);
//        }
//        int f = 1;
//        for(int i = 1; i<=b;i++){
//            f= f*i;
//        }
//        System.out.println(f);

//        int f=1;
//        int i =1;
//        while (i<=b){
//            f=f*i;
//            i++;
//        }
//        System.out.println(f);

        
    }
}
