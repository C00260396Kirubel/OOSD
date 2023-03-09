import java.util.ArrayList;

import java.util.Scanner;

public class MyHr {
    
    public static void main(String[] args) {

        int choice=1;
        int exits=1;
        Scanner input = new Scanner(System.in);
        ArrayList<Office> offices = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        // add some offices to the list
        Office office1 = new Office();
        offices.add(office1);
        Office office2 = new Office();
        offices.add(office2);
        Office office3 = new Office();
        offices.add(office3);
        
      

        // Create up to a maximum of 5 employee records
        

        // Create employees and assign them to offices

        
        
        System.out.println("\n Welcome To MyHr System! \n");
     
        
 
        
        while(choice !=0)
        {
        
        System.out.println("Choose an option below..");
        System.out.println("\n1. List all offices \n");
        System.out.println("\n2. Create a new employee record \n");
        System.out.println("\n3. List all employees \n");
        System.out.println("\n0. To exit \n");
        choice = input.nextInt();
        input.nextLine(); // consume the newline character

        
        switch(choice)
        {
            case 1:
            	
              // iterate through the list of offices
        int i = 0;
        for (Employee employee : employees) {
            office1.addEmployee(employee);
            if(office1.getNumEmployees() == 2)
            {
                office2.addEmployee(employee);
            }
            else if(office2.getNumEmployees() == 2)
            {
                office3.addEmployee(employee);
            }
        }
        
        while (i < offices.size()) {
            Office office = offices.get(i);
            System.out.println(office.toString());
            i++;
        }

            break;


            case 2:
        
            
            
            
            while(employees.size() < 5 && exits != 0)
            {
                

            System.out.println("Enter Employee Address ");

            System.out.println("Street: ");
            String street;
            street = input.nextLine();
            input.nextLine();
          
            System.out.println("City: ");
            String city;
            city = input.nextLine();
            input.nextLine();

            
            System.out.println("County: ");
            String county;
            county = input.nextLine();
            input.nextLine();

          
            System.out.println("Employee Type: ");
            String employeeType;
            employeeType = input.nextLine();
            input.nextLine();

            if(employeeType.equalsIgnoreCase("Manager"))
            {
            
            System.out.println("Add notes about company car: ");
            String companyCar;
            companyCar = input.next();
                Employee e1 = new Employee(street, city, county, employeeType, companyCar);
                employees.add(e1);
            }

            else
            {

                Employee e1 = new Employee(street, city, county, employeeType);
                employees.add(e1);
            }

            System.out.println("Enter 0 to exit or 1 to add another record... ");
                exits = input.nextInt();
            

        }
            



            break;


            case 3:

            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
            
            break;
        }

    }
}
}
