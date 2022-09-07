package Program2;
/*
Design an Address class with member variables Street num, city, state and country and
appropriate constructor.Design a Student class with constructor (Student (String USN,
String Name, Address addr)), College class with constructor (College (String Name, Address
addr)) and Employee class with constructor (Employee (String EmpID, String Name, Address
addr)). Write a Java program to create ‘n’ Student objects, College Objects and Employee
objects and print the student, college and employee addresses respectively and
demonstrate passing of object as a parameter to the constructor.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    static Scanner in = new Scanner(System.in);

    static Address askAddress() {
        String street_num,  city,  state,  country;
        System.out.println("Enter Street number");
        street_num=in.nextLine();
        System.out.println("Enter city");
        city=in.nextLine();
        System.out.println("Enter state");
        state=in.nextLine();
        System.out.println("Enter country");
        country=in.nextLine();
        return new Address(street_num, city, state, country);
    }


    static Object askDetails(int flag,int i)
    {
        switch (flag) {
            case 1 -> {
                System.out.println("Enter student-" + i + " name");
                String name = in.nextLine();
                System.out.println("Enter student-" + i + " USN");
                String USN = in.nextLine();
                System.out.println("Enter student-" + i + " Address");
                Address address = askAddress();
                return new Student(USN, name, address);
            }
            case 2 -> {
                System.out.println("Enter college-" + i + " name");
                String name = in.nextLine();
                System.out.println("Enter college-" + i + " Address");
                Address address = askAddress();
                return new College(name, address);
            }
            case 3 -> {
                System.out.println("Enter employee-" + i + " name");
                String name = in.nextLine();
                System.out.println("Enter employee-" + i + " EmpID");
                String EmpID = in.nextLine();
                System.out.println("Enter employee-" + i + " Address");
                Address address = askAddress();
                return new Employee(EmpID, name, address);
            }
        }

        return new Object();

    }


    public static void main(String[] args) {

        String n;

        System.out.println("Enter number of students/college/employee");

        n = in.nextLine();

        ArrayList<Student> student= new ArrayList<>();
        ArrayList<Employee> employee= new ArrayList<>();
        ArrayList<College> college= new ArrayList<>();


        for(int i=0;i<Integer.parseInt(n);i++)
        {
            System.out.println("Enter student-"+(i+1)+" details");
            student.add((Student) askDetails(1,i+1));
        }

        for(int i=0;i<Integer.parseInt(n);i++)
        {
            System.out.println("Enter college-"+(i+1)+" details");
            college.add((College) askDetails(2,i+1));
        }

        for(int i=0;i<Integer.parseInt(n);i++)
        {
            System.out.println("Enter employee-"+(i+1)+" details");
            employee.add((Employee) askDetails(3,i+1));
        }

        while(true)
        {
            System.out.println("Enter a option:\n 1.Student details 2.College details 3.Employee details");
            int opt=Integer.parseInt(in.nextLine());
            switch (opt) {
                case 1 -> {
                    System.out.println("Name\t\t|\t\tUSN\t\t|\t\tAddress");
                    for (int i = 0; i < Integer.parseInt(n); i++) {
                        System.out.println(student.get(i).name + "\t" + student.get(i).USN + "\t" + student.get(i).address.street_num + "," + student.get(i).address.city + "," + student.get(i).address.state + "," + student.get(i).address.country);
                    }
                }
                case 2 -> {
                    System.out.println("Name\t\t|\t\tAddress");
                    for (int i = 0; i < Integer.parseInt(n); i++) {
                        System.out.println(college.get(i).name + "\t" + college.get(i).address.street_num + "," + college.get(i).address.city + "," + college.get(i).address.state + "," + college.get(i).address.country);
                    }
                }
                case 3 -> {
                    System.out.println("Name\t\t|\t\tEmpID\t\tAddress");
                    for (int i = 0; i < Integer.parseInt(n); i++) {
                        System.out.println(employee.get(i).name + "\t" + employee.get(i).EmpID + "\t" + employee.get(i).address.street_num + "," + employee.get(i).address.city + "," + employee.get(i).address.state + "," + employee.get(i).address.country);
                    }
                }
                default ->
                    System.exit(0);

            }
        }


    }



}
