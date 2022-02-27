import java.util.*;
import java.io.*;
class experiment6
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream f = new FileInputStream("integer.txt");
            int ch;
                String a;
                int sum =0;
                System.out.println("The Numbers in the file are : ");
                while((ch = f.read())!=-1)
                {
                    String s = Character.toString((char)ch);
                    StringTokenizer st = new StringTokenizer(s);
                    while( st.hasMoreTokens()) 
                    {
                        a = st.nextToken();
                        int b = Integer.parseInt(a);
                        System.out.println(b);
                        sum = sum + b;
                    }
                }
                System.out.println("The sum is "+sum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}