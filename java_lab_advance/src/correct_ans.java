import java.sql.SQLOutput;
import java.util.*;
public class correct_ans {
    public static void main(String[] args) {

        int count = 1;
        ArrayList person = new ArrayList();
        Scanner sc = new Scanner(System.in);
        do {
            String q = "what is the national animal of india ?\n" +
                    "Option A:lion\n"
                    + "Option B:tiger\n"
                    + "Option C:wolf\n"
                    + "Option D:Elephant\n";
            System.out.println(q);
            System.out.println("enter person name");
            String name = sc.next();
            System.out.println("Person:" + count + "\nname:" + name + "\nenter your option:");
            String z = sc.next();
            if (z == "A" || z == "C" || z == "D" || z == "a" || z == "c" || z == "d" ) {
                count=count+1;
                System.out.println("count increased");
            } else if(z == "B" || z == "b") {
                person.add(name);
                count++;
                System.out.println("count increased");
            }
        } while (count <= 5);
//        Object[] objects=person.toArray();
//       for(int i = 0;i<3;i++)
//        System.out.println(objects[i]);
        if(person.size()>3) {
            for (int i = 0; i < 3; i++) {
                System.out.println("THE FIRST BEST THREE Correct answer ARE:"+i);
                System.out.println(person.get(i));
            }
        }
        else {
            for (int i = 0; i < person.size(); i++) {
                System.out.println("THE correct answer ARE:"+i);
                System.out.println(person.get(i));
        }

    }
}
}