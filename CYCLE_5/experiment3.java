import java.util.*;
import java.io.*;
class experiment5
{
    public static void main(String args[])
    {
        try 
        {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            FileWriter f = new FileWriter("expt3.txt");
            System.out.println("name");
            String name = sc.next();
            System.out.println("address");
            String address = sc1.next();
            f.write(name+"\n");
            f.write(address+"\n");
            f.close();
            FileReader fr = new FileReader("expt3.txt");
            int ch=0;
            while((ch=fr.read())!=-1)
                System.out.print((char)ch);   
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}