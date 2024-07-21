class abc{
    private int id ;
    private String name;
    public abc(String myname,int i){
        id = i;
        name = myname;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String b){
        name=b;
    }
}
public class Par16 {
    public static void main(String[] args) {
        abc qw = new abc("radhe radhe",10);
//        qw.setName("Parth");   ****** i was doing to using contracture ***** line no . 4 to  7;
        System.out.println(qw.getName());
//        qw.setId(10);
        System.out.println(qw.getId());
    }
}
