public class Employee {
    private static int nextEmployeeNumber = 1000;
    private int employeeNumber;
    private String address;
    private String employeeType;
    private String companyCar;

    public Employee(String street, String city, String county, String employeeType) {
        this.employeeNumber = nextEmployeeNumber++;
        this.setAddress(street, city, county);
        this.setEmployeeType(employeeType);
    }

    public Employee(String street, String city, String county, String employeeType, String companyCar) {
        this.employeeNumber = nextEmployeeNumber++;
        this.setAddress(street, city, county);
        this.setEmployeeType(employeeType);
        this.setCompanyCar(companyCar);
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setAddress(String street, String city, String county) {
        this.address = street + ", " + city + ", " + county;
    }

    public String getAddress() {
        return address;
    }

    public void setCompanyCar(String companyCar) {
        this.companyCar = companyCar;
    }

    public String getCompanyCar() {
        return companyCar;
    }

    public String toString() {
        String result = "Employee " + employeeNumber + ":\n";
        result += "Address: " + address + "\n";
        result += "Employee Type: " + employeeType + "\n";
        if (employeeType.equals("Manager")) {
            result += "Company Car: " + companyCar + "\n";
        }
        return result;
    }
}
