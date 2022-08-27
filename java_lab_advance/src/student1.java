//using extra class student and taking object in place of some small datatypes

import java.util.*;

class student{
    int rollno;
    String name;
    int age;
    int phy;
    int chem;
    int maths;
    student(int rollno,String name,int age,int phy,int chem,int maths){
        this.rollno=rollno;
        this.name= name;
        this.age=age;
        this.phy=phy;
        this.chem=chem;
        this.maths=maths;
    }

}


public class student1{
    Scanner sc = new Scanner(System.in);
    ArrayList<student> al=new ArrayList<student>();
    public void input_data(){

        for(int i = 1; i <=3; i++) {
            System.out.println("rollno of student "+i+":");
            int rollno= sc.nextInt();
            System.out.println("Name of Student "+i+":");
            String name=sc.next();
            System.out.println("Age of student "+i+":");
            int age= sc.nextInt();
            System.out.println("phy marks of student "+i+":");
            int phy= sc.nextInt();
            System.out.println("chem marks of student "+i+":");
            int chem= sc.nextInt();
            System.out.println("maths marks of student "+i+":");
            int maths= sc.nextInt();
            al.add(new student(rollno,name,age,phy,chem,maths));
        }
        System.out.println("total five students are added");
    }
    public void show_data(){
        System.out.println("want data of ");
        int i = sc.nextInt();
        student ss = al.get(i);
        System.out.println("rollno: "+ss.rollno+"name: "+ss.name+"age: "+ss.age);
        System.out.println("All marks "+"phy:"+ss.phy+"chem:"+ss.chem+"maths:"+ss.maths);
    }
    public void alldata(){

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            student st = (student)itr.next();
            System.out.println(st.name+" "+st.age+" "+st.rollno);
            System.out.println("All marks "+"phy:"+st.phy+"chem:"+st.chem+"maths:"+st.maths);
        }
    }
    public void deleteData(int index){
        System.out.println("deleted data according to index");
        al.remove(index);
    }

    public static void main(String[] args) {
        student1 sss= new student1();
        sss.input_data();
        sss.show_data();
        sss.alldata();
        sss.deleteData(2);
        sss.alldata();
//        student s1=new student(101,"mohini",23);
//        student s2=new student(102,"Sanidhya",24);
//        student s3=new student(103,"nitin",25);
        // ArrayList<student> al=new ArrayList<student>();
//        al.add(s1);
//        al.add(s2);
//        al.add(s3);

    }

}

