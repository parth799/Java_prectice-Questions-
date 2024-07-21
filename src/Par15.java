class parth{
    String name;
    int id ;
    int seleery;
    int std ;
    public void tre(){
        System.out.println("Employee name is "+name +" Employee id is "+id +" and his standers is "+std +" sci");
//        System.out.println("And your seleery is "+seleery);
    }
    public int getSeleery(){
        return seleery;
    }
}

public class Par15 {
    public static void main(String[] args) {
        System.out.println("this is my class fo each in obj");
        parth a=new parth();
        parth b=new parth();
        a.name="Parth";
        a.id = 01;
        a.std = 12;
        a.seleery=12000;
        b.name="Ravi";
        b.id = 02;
        b.std = 10;
        b.seleery=22000;
        a.tre();
        b.tre();
        int seleery = a.getSeleery();

    }
}
