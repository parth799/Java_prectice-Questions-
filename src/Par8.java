import java.util.Scanner;
public class Par8 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you can not Drive");
                break;
            case 20:
                System.out.println("you can Drive");
                break;
            case 15:
                System.out.println("you can  a not Drive");
                break;
            default:
                System.out.println("are not drive");
        }
    }
}
