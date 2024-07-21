class MyPhone {
    public void calling(int number) {
        System.out.println("Call this number " + number);
    }

    public void callEnd() {
        System.out.println("Your call is ended");
    }
}

interface Camera {
    void clickPhoto();
    void recording();
    default void recording4k() {
        System.out.println("I am recording video in 4k quality");
    }
}

interface WiFi {
    String[] getInternet();
    void useMobileData();
}

class mySmartPhone extends MyPhone implements Camera, WiFi {
    public void clickPhoto() {
        System.out.println("I am clicking photo using phone camera");
    }

    public void recording() {
        System.out.println("I am recording video using phone");
    }

    public String[] getInternet() {
        System.out.println("Getting list of networks");
        String[] network = {"WiFi 1", "WiFi 2", "WiFi 3"};
        return network;
    }

    public void useMobileData() {
        System.out.println("I am not able to find WiFi, that's why I am using mobile data");
    }
}

public class Par23 {
    public static void main(String[] args) {
        mySmartPhone sm = new mySmartPhone();
        sm.calling(526585965);
        sm.clickPhoto();
        sm.recording();
        String[] arr = sm.getInternet();
        for (String i : arr) {
            System.out.println(i);
        }
        sm.useMobileData();
        sm.recording4k();
        Camera cm = new mySmartPhone();  // concept of polymorphism.. *********
        cm.recording();   // concept of polymorphism , only use camara methods in " cm " variable to use..****
//        cm.useMobileData()  --> you cannot use MySmartphone methods in polymorphism..****
    }
}
