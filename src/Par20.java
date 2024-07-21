/*  *********  Dynamic Method Dispatch  ***********  */
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Par20 {
    public static void main(String[] args) {
        Phone p = new SmartPhone();    //****
        p.on();                        //   **** Dynamic Method Dispatch
        p.showTime();                   //****

    }
}
