// Java Program illustrating use of io.RandomAccessFile class methods
// read(), read(byte[] b), readBoolean(), readByte(), readInt()
// readFully(byte[] b, int off, int len), readFully(), readFloat()
// readChar(), readDouble(),

import java.io.*;
public class assignment_96
{
    public static void main(String[] args)
    {
        try
        {
            double d = 1.5;
            float f = 14.56f;


            RandomAccessFile Sanidhya = new RandomAccessFile("Etexthere.txt", "rw");

            // Writing to file
            Sanidhya.writeUTF("Hello Sanidhyas ");


            Sanidhya.seek(0);


            System.out.println("Use of read() method : " + Sanidhya.read());

            Sanidhya.seek(0);

            byte[] b = {1, 2, 3};


            System.out.println("Use of .read(byte[] b) : " + Sanidhya.read(b));

            // readBoolean() method :
            System.out.println("Use of readBoolean() : " + Sanidhya.readBoolean());

            // readByte() method :
            System.out.println("Use of readByte() : " + Sanidhya.readByte());

            Sanidhya.writeChar('c');
            Sanidhya.seek(0);

            // readChar() :
            System.out.println("Use of readChar() : " + Sanidhya.readChar());

            Sanidhya.seek(0);
            Sanidhya.writeDouble(d);
            Sanidhya.seek(0);

            // read double
            System.out.println("Use of readDouble() : " + Sanidhya.readDouble());

            Sanidhya.seek(0);
            Sanidhya.writeFloat(f);
            Sanidhya.seek(0);

            // readFloat() :
            System.out.println("Use of readFloat() : " + Sanidhya.readFloat());

            Sanidhya.seek(0);

            byte[] arr = new byte[(int) Sanidhya.length()];

            Sanidhya.readFully(arr);

            String str1 = new String(arr);
            System.out.println("Use of readFully() : " + str1);

            Sanidhya.seek(0);

            // readFully(byte[] b, int off, int len) :
            Sanidhya.readFully(arr, 0, 8);

            String str2 = new String(arr);
            System.out.println("Use of readFully(byte[] b, int off, int len) : " + str2);
        }
        catch (IOException ex)
        {
            System.out.println("Something went Wrong");
            ex.printStackTrace();
        }
    }
}
