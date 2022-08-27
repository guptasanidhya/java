import java.net.*;
import java.io.*;
class myclient{
    public static void main(String args[])throws Exception{
        Socket s=new Socket("localhost",3333);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       int i=0; int j =0 ;
       String str="";
        while(!str.equals("stop")){
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();
           i =Integer.parseInt(din.readUTF());
            System.out.println("Server says: "+i);
        }

        dout.close();
        s.close();
    }}