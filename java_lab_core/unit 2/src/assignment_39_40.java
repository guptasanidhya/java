class employeetest{
    String name;
    double salary;
    employeetest(String n,double s){
        name=n;
        salary=s;
    }

    public String getName() {
        return name;
    }
    //increase in salary
    public double getSalary() {
        return salary+(salary*10/100);
    }
}

public class assignment_39_40 {
    public static void main(String[] args) {
        employeetest e1,e2;
        e1=new employeetest("sanidhya",100000);
        e2=new employeetest("shanu",500000);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());

    }
}
