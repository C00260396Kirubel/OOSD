import java.util.ArrayList;

public class Office {
    private static int nextRoomNumber = 100;
    private int roomNumber;
    private ArrayList<Employee> employees;

    
    public Office() {
        this.roomNumber = nextRoomNumber++;
        this.employees = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void addEmployee(Employee employee) {
        if (employees.size() < 2) {
            employees.add(employee);
        } else {
            System.out.println("Cannot add more employees to this office.");
        }
    }

    public int getNumEmployees() {
        return employees.size();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String toString() {
        String result = "Office " + roomNumber + ":\n";
        result += "Employees:\n";
        for (Employee employee : employees) {
            result += employee.toString();
        }
        return result;
    }
}
