package Oppg3;

import Oppg2.Employee;
import Oppg2.Gender;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Oppg3 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Smith", Gender.MALE, "Bank Teller", 450000),
                new Employee("Mary", "Johnson", Gender.FEMALE, "Banker", 500000),
                new Employee("Linda", "Williams", Gender.FEMALE, "Loan Processor", 550000),
                new Employee("Reginald", "Brown", Gender.MALE, "Chief Marketing Officer", 600000),
                new Employee("Emma", "Jones", Gender.FEMALE, "Chief Financial Officer", 750000)
        );

        // a
        List<String> surnames = employees.stream()
                .map(emp -> emp.getSurname())
                .collect(Collectors.toList());

        // b
        long numOfFemales = employees.stream()
                .filter(emp -> emp.getGender() == Gender.FEMALE)
                .count();

        // c
        OptionalDouble avgFemaleSalary = employees.stream()
                .filter(emp -> emp.getGender() == Gender.FEMALE)
                .mapToDouble(emp -> emp.getSalary())
                .average();

        // d
        List<Employee> chiefs = employees.stream()
                .filter(emp -> emp.getRole().contains("Chief"))
                .collect(Collectors.toList());

        chiefs.forEach(emp -> emp.setSalary(((emp.getSalary()*7)/100 + emp.getSalary())));

        for(Employee emp : employees) {
            System.out.println(
                    "Full name: " + emp.getFirstname() + " " + emp.getSurname()
                    + "\nSalary: " + emp.getSalary() + "\n"
            );
        }

        // e
        boolean highSalary = employees.stream()
                .anyMatch(emp -> emp.getSalary() > 800000);

        // f
        employees.forEach(System.out::println); // ER DITTA INNAFOR???

        // g
        Employee lowestSalary = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        // h
        int divisibleByThreeOrFive = IntStream.rangeClosed(1, 1000)
                .filter(num -> num % 3 == 0 || num % 5 == 0).sum();
        System.out.println("Sum of all numbers divisible by 3 or 5 in the range of 1-1000: "
                + divisibleByThreeOrFive);
    }
}
