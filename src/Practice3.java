import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first subject mark : ");
        int a = sc.nextInt();
        System.out.print("Enter your second subject mark : ");
        int b = sc.nextInt();
        System.out.print("Enter your third subject mark : ");
        int c = sc.nextInt();
        float par = (a+b+c)/3f;
        System.out.printf("\nyour total percentage is %f",par);
        System.out.println("%");
        if (par>=33)
            System.out.println("you are pass");
        else
            System.out.println("you are fail");
    }
}
