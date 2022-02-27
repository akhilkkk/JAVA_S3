import java.util.*;
public class employee
{
    String name,addrss,phnum;
    int age,salary;
    public static void main(String args[]) 
    {
        Scanner obj = new Scanner(System.in);
        officer off = new officer();
        manager man = new manager();

        System.out.println("Officer :");
        off.input();
        System.out.println("Enter the specialization :");
        off.specialization = obj.next();
        System.out.println("Manager :");
        man.input();
        System.out.println("Enter the Department :");
        man.Department = obj.next();

        System.out.println("Officer :");
        off.print();
        System.out.println("\n specialization : \n"+off.specialization);
        System.out.println("Manager : ");
        man.print();
        System.out.println("\n department : "+man.Department);

    }
    void print_salary(int a)
    {
        System.out.println("The salary is "+a);
    }
    void input()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = obj.nextLine();
        System.out.print("Enter the age : ");
        age = Integer.parseInt(obj.nextLine());
        System.out.println("Enter the phone number : ");
        phnum = obj.nextLine();
        System.out.println("Enter the address : ");
        addrss = obj.nextLine();
        System.out.print("Enter the salary : ");
        salary = obj.nextInt();
    }
    void print()
    {
        System.out.println("\n name :"+name+"\n age : "+age+"\n phone no : "+phnum+"\n address : "+addrss);
        print_salary(salary);
    }
}
class officer extends employee4 
{
    String specialization;
}
class manager extends employee4 
{
    String Department;
}
