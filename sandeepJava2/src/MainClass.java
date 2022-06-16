import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {


    static AddressClass askAddress(String who)
    {
        AddressClass address;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter "+who+" address details:");
        System.out.println("Enter street number");
        String number=in.nextLine();
        System.out.println("Enter City name");
        String city=in.nextLine();
        System.out.println("Enter State name");
        String state=in.nextLine();
        System.out.println("Enter Country name");
        String country=in.nextLine();
        address=new AddressClass(number,city,state,country);
        return address;
    }

    public static void main(String[] args) {
        String option;
        String usn;
        String empID;
        String name;
        String nn;
        int n;
        AddressClass address;
        ArrayList<StudentClass> students=new ArrayList();
        ArrayList<EmployeeClass> employees=new ArrayList();
        ArrayList<CollegeClass> colleges=new ArrayList();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the option");
        System.out.println("1 for student\n2 for employee\n3 for College");
        option=in.nextLine();

        switch (option)
        {
            case "1":
                System.out.println("Enter number of students");
                nn=in.nextLine();
                n=Integer.parseInt(nn);
                for(int i=0;i<n;i++)
                {
                    System.out.println("Enter student's USN");
                    usn=in.nextLine();
                    System.out.println("Enter student's Name");
                    name=in.nextLine();
                    address=askAddress("Student");
                    StudentClass st=new StudentClass(usn,name,address);
                    students.add(st);
                }
                display(1,students,employees,colleges,"Student");

                break;
            case "2":
                System.out.println("Enter number of Employee");
                nn=in.nextLine();
                n=Integer.parseInt(nn);
                for(int i=0;i<n;i++)
                {
                    System.out.println("Enter employee's USN");
                    empID=in.nextLine();
                    System.out.println("Enter employee's Name");
                    name=in.nextLine();
                    address=askAddress("Employee");
                    EmployeeClass st=new EmployeeClass(empID,name,address);
                    employees.add(st);
                }
                display(2,students,employees,colleges,"Employee");

                break;
            case "3":
                System.out.println("Enter number of College");
                nn=in.nextLine();
                n=Integer.parseInt(nn);
                for(int i=0;i<n;i++)
                {
                    System.out.println("Enter College USN");
                    usn=in.nextLine();
                    System.out.println("Enter College Name");
                    name=in.nextLine();
                    address=askAddress("College");
                    CollegeClass st=new CollegeClass(name,address);
                    colleges.add(st);
                }
                display(3,students,employees,colleges,"College");

                break;


        }



    }

    static  void display(int flag,ArrayList<StudentClass>s,ArrayList<EmployeeClass>e,ArrayList<CollegeClass>c,String who)
    {
        if(flag==1)
        {
            System.out.println(who+"Name\t\tUSN\t\t\tStreet number\t\t\tCity\t\t\tState\t\t\tCountry");
            for(int i=0;i<s.size();i++)
            {
                System.out.println(s.get(i).name+"\t\t\t\t"+s.get(i).USN+"\t\t\t"+s.get(i).address.street_num+"\t\t\t"+s.get(i).address.city+"\t\t\t"+s.get(i).address.state+"\t\t\t"+s.get(i).address.country);
            }

        }
        else if(flag==2)
        {
            System.out.println(who+" Name\t\tEmpID\t\tStreet number\t\tCity\t\tState\t\tCountry");
            for(int i=0;i<e.size();i++)
            {
                System.out.println(e.get(i).name+"\t\t"+e.get(i).empID+"\t\t"+e.get(i).address.street_num+"\t\t"+e.get(i).address.city+"\t\t"+e.get(i).address.state+"\t\t"+e.get(i).address.country);
            }

        }
        else {
            System.out.println(who+" Name\t\tStreet number\t\tCity\t\tState\t\tCountry");
            for(int i=0;i<c.size();i++)
            {
                System.out.println(c.get(i).name+"\t\t"+c.get(i).address.street_num+"\t\t"+c.get(i).address.city+"\t\t"+c.get(i).address.state+"\t\t"+c.get(i).address.country);
            }
        }

    }




}
