public class Practice2 {
    public static void main(String[] args) {
        String name = "i am Parth";
        String lname= name.toUpperCase();
        System.out.println(lname);
        System.out.println(name.replace(" ",","));
        String letter = "Dear <!name!>, thank A lot . ";
        System.out.println(letter.replace("<!name!>","Parth"));
        System.out.println(name.indexOf(" "));
    }
}
