import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {

//        practice 1
//        float [] as = {12.3f,25.3f,25.3f,14.5f,85.3f};
//        float sum = 0;
//        for (float a:as) {
//            sum = sum + a;
//        }
//        System.out.println("sum is : "+sum);

//        practice 2

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your integer : ");
        int a = sc.nextInt();
        int[] as = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean d = false;
        for (int c : as) {
            if (a == c) {
                d = true;
                break;
            }
        }
        if (d) {
            System.out.println("in array!");
        } else {
            System.out.println("your int is not present in Array!");
        }
    }
}

