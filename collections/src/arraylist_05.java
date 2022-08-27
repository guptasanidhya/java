//using extra class student and taking object in place of some small datatypes

import java.util.*;
class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name= name;
        this.age=age;
    }
}


public class arraylist_05 {
    public static void main(String[] args) {
        Student s1=new Student(101,"mohini",23);
        Student s2=new Student(102,"Sanidhya",24);
        Student s3=new Student(103,"nitin",25);

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
    Student st = (Student)itr.next();
            System.out.println(st.name+" "+st.age+" "+st.rollno);
        }
    }

}

