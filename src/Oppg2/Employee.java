package Oppg2;

public class Employee {
    private String firstname;
    private String surname;
    private Gender gender;
    private String role;
    private int salary;

    public Employee(String firstname, String surname, Gender gender, String role, int salary) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
