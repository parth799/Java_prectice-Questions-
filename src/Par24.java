class MyThreadRunnable1 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}
public class Par24 {
    public static void main(String[] args) {
        MyThreadRunnable1 mt1 = new MyThreadRunnable1();
        Thread t1 = new Thread(mt1);
        MyThreadRunnable2 mt2 = new MyThreadRunnable2();
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
}










/*MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();*/