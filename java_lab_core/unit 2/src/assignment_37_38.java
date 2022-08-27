class employee{
    String first_name;
    String last_name;
    double salary;
    employee(String a,String b ,double c){
        first_name=a;
        last_name=b;
        salary=c;
    }
    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getSalary() {
        return salary;
    }
}

public class assignment_37_38 {
    public static void main(String[] args) {
        employee e=new employee("Sanidhya","Gupta",100000);
        System.out.println(e.getFirst_name()+e.getLast_name()+e.getSalary());
    }


}
