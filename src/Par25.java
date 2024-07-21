class myclass1 extends Thread{
    public myclass1(String a){
        super(a);
    }

    @Override
    public void run() {
        int i =0;
        while (i<=100){
            System.out.println(" hello im parth ! ");
            i++;
        }
    }
}
class myclass2 extends Thread{
    public myclass2(String a){
        super(a);
    }

    @Override
    public void run() {
        while (true){
            System.out.println(" hello im parth !  another thread");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Par25 {
    public static void main(String[] args) {
        myclass1 mc1 = new myclass1("parth");
        myclass2 mc2 = new myclass2("raj");

//        mc1.start();
//        System.out.println("this thread id is : "+ mc1.getId());
//        System.out.println("this thread id is : "+ mc1.getName());
//        mc2.start();
//        System.out.println("this thread id is : "+ mc2.getId());
        mc1.start();
        try {
            mc1.join();        }
        catch (Exception e){
            System.out.println(e);
        }

        mc2.start();
    }
}
