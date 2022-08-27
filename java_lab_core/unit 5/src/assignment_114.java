import java.util.StringTokenizer;
public class assignment_114{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("i Am sanidhya GuPTA"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}  