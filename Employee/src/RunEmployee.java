import java.util.Scanner;

public class RunEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the employee: ");
        String employeeName = scanner.nextLine();

        System.out.print("Press 'F' for Full Time or 'P' for Part Time: ");
        char employeeType = scanner.next().charAt(0);

        if (employeeType == 'F' || employeeType == 'f') {
            System.out.print("Enter monthly salary: ");
            double monthlySalary = scanner.nextDouble();

            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(employeeName, monthlySalary);

            System.out.println("Employee Information:");
            System.out.println("Name: " + fullTimeEmployee.getName());
            System.out.println("Monthly Salary: P" + fullTimeEmployee.getMonthlySalary());
        } else if (employeeType == 'P' || employeeType == 'p') {
            System.out.print("Enter hourly rate and hours worked (separated by space): ");
            double hourlyRate = scanner.nextDouble();
            int hoursWorked = scanner.nextInt();

            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(employeeName, hourlyRate, hoursWorked);

            System.out.println("Employee Information:");
            System.out.println("Name: " + partTimeEmployee.getName());
            System.out.println("Wage: P" + (partTimeEmployee.getHourlyRate() * partTimeEmployee.getHoursWorked()));
        } else {
            System.out.println("Invalid input. Please enter 'F' for Full Time or 'P' for Part Time.");
        }

        scanner.close();
    }
}
