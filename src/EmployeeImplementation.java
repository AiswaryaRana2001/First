//class Employee {
//    String name;
//    String ssn;
//    String dept;
//    int salary;
//
//    public Employee(String name, String ssn, String dept, int salary) {
//        this.name = name;
//        this.ssn = ssn;
//        this.dept = dept;
//        this.salary = salary;
//    }
//}
//
//public class EmployeeImplementation {
//
//    public Employee getEmployeeInfo(String str) {
//        String[] parts = str.split("[@\\-#]");
//        String name = parts[0];
//        String ssn = parts[1];
//        String dept = parts[2];
//        int salary = Integer.parseInt(parts[3]);
//        return new Employee(name, ssn, dept, salary);
//    }
//
//    public String getEmployeeDept(Employee e) {
//        int lastThreeDigits = Integer.parseInt(e.ssn.substring(e.ssn.length() - 3));
//
//        if (lastThreeDigits >= 1 && lastThreeDigits <= 60) {
//            return "L1";
//        } else if (lastThreeDigits >= 61 && lastThreeDigits <= 120) {
//            return "L2";
//        } else if (lastThreeDigits >= 121 && lastThreeDigits <= 180) {
//            return "L3";
//        } else {
//            return "L4";
//        }
//    }
//
//    public static void main(String[] args) {
//        EmployeeImplementation employeeImplementation = new EmployeeImplementation();
//
//        // Example string
//        String employeeString = "Amit Rai@1PC16CS046-ALU#8";
//
//        // Extract employee information
//        Employee employee = employeeImplementation.getEmployeeInfo(employeeString);
//        System.out.println("Employee Name: " + employee.name);
//        System.out.println("Employee SSN: " + employee.ssn);
//        System.out.println("Employee Dept: " + employee.dept);
//        System.out.println("Employee Salary: " + employee.salary);
//
//        // Get employee department
//        String employeeDept = employeeImplementation.getEmployeeDept(employee);
//        System.out.println("Employee Department: " + employeeDept);
//    }
//}
//
