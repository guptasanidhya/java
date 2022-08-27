public class string_05 {
    public static void main(String[] args) {
        String s="                                     ";
        if (s.trim().length()==0 || s.trim().length()>400000)
        {
            System.out.println(0);
            return;
        }
        String m[] =s.trim().split("[!,?._'@\\s]+");
      System.out.println(m.length);
     for(int i=0;i<m.length;i++){
   System.out.println(m[i]);
      }
    }
}
