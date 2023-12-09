package org.example;

public class Person {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private double salary;
    private String birthdate;

    public Person(int id, String name, String gender, Department department, double salary, String birthdate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}