import java.net.*;
import java.io.*;
class myserver{
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i=0; int j=0;
        while(i!=(-1)){
            i =Integer.parseInt(din.readUTF());
            System.out.println("client says: "+i);
            j=i+5;
            String str=j+"";
            dout.writeUTF(str);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }}