import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<emp> empset=new HashSet<>();

    emp e1=new emp(101,"Ritam",24,"IT",25000);
    emp e2=new emp(101,"Sayan",22,"Tester",45000);
    emp e3=new emp(101,"Aritra",34,"Dev",25000);
    emp e4=new emp(101,"Priyanka",24,"Manager",50000);

    Scanner sc=new Scanner(System.in);
     boolean found=false;

    int id;
    String name;
    int age;
    String department;
    String designation;
    double salary;

    public EmployeeService(){
        empset.add(e1);
        empset.add(e2);
        empset.add(e3);
        empset.add(e4);
    }

    //view emp
    public void viewAllEmps(){
        for(emp e:empset){
        System.out.println(e);
        }
    }
    
    //view emp by id
    public void viewEmp(){
       
        System.out.println("Enter id: ");
        id=sc.nextInt();
        for(emp e:empset){
            if(emp.getId()==id){
                System.out.println(e);
                found=true;
            }
        }
        if(!found){
            System.out.println("This id is not present");
        }
    }

}
