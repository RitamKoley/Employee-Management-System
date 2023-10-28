import java.util.Scanner;

public class Main {
    EmployeeService service=new EmployeeService();
    static boolean ordering=true;
    public static void menu(){
        System.out.println("\n*************** Welcome to Employee Management System ***************"
                +"\n1. Add Employee"
                +"\n2. View Employee"
                +"\n3. Update Employee"
                +"\n4. Delete Employee"
                +"\n5. View all Employee"
                +"\n6. Exit");
    }
    public  void main(String[] args) {
        EmployeeService service=new EmployeeService();
        Scanner sc=new Scanner(System.in);
        do {
            menu();
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add Employee");
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    break;
                case 5:
                    System.out.println("View all Employee");
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank You For Using The Application !!!"); //exit
                    System.exit(0);

                default:
                    System.out.println("Please Enter A Valid Choice");
                    break;
            }

        }while (ordering);

    }
}