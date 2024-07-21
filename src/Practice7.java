class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
        System.out.println(name);
    }

    public void setId(int i) {
    }
}
public class Practice7 {
    public static void main(String[] args) {
        Employee Parth = new Employee();
        Parth.name= "Desai Parth";
        Parth.salary=150000;
        System.out.println(Parth.getName());
        System.out.println(Parth.getSalary());
        System.out.print("Change name is this ");
        Parth.setName("Ravi");
    }
}
