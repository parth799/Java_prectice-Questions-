class Morning extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Good morning ");
        }
    }
}
class Welcome extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
public class Practice14 {
    public static void main(String[] args) {
        Morning M = new Morning();
        Welcome W = new Welcome();
        M.setPriority(1);
        System.out.println(M.getPriority());
        W.setPriority(2);
        System.out.println(W.getPriority());
//        M.start();
//        W.start();
    }
}
