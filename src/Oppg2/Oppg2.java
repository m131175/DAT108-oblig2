package Oppg2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Oppg2 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", "Smith", Gender.MALE, "Bank Teller", 450000),
                new Employee("Mary", "Johnson", Gender.FEMALE, "Banker", 500000),
                new Employee("Linda", "Williams", Gender.FEMALE, "Loan Processor", 550000),
                new Employee("Reginald", "Brown", Gender.MALE, "Credit Analyst", 600000),
                new Employee("Emma", "Jones", Gender.FEMALE, "Investment Banker", 750000)
        );

        Function<Employee, Integer> kroneAddition = (emp) -> emp.getSalary() + 10000;
        Function<Employee, Integer> percentAddition = (emp) -> (emp.getSalary() * 10) / 100 + emp.getSalary();
        Function<Employee, Integer> kroneAdditionLowSalary = (emp) -> (emp.getSalary() < 1000000) ? kroneAddition.apply(emp) : 0;
        Function<Employee, Integer> percentAdditionMale = (emp) -> emp.getGender().equals(Gender.MALE) ? percentAddition.apply(emp) : emp.getSalary();

        printAll(employees);

        salarySettlement(employees, kroneAddition);
        salarySettlement(employees, percentAddition);
        salarySettlement(employees, kroneAdditionLowSalary);
        salarySettlement(employees, percentAdditionMale);

        printAll(employees);
    }

    private static void salarySettlement(List<Employee> employees, Function<Employee,Integer> func) {
        employees.forEach(emp -> emp.setSalary(func.apply(emp)));
    }

    private static void printAll(List<Employee> employees) {
        employees.forEach(emp -> System.out.println(emp.toString() + "\n"));
    }
}
