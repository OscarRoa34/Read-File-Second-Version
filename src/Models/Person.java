package Models;

public class Person {
    private int code;
    private String lastName;
    private String name;
    private char gender;
    private int weight;
    private int salary;

    public Person(int code, String lastName, String name, char gender, int weight, int salary) {
        this.code = code;
        this.lastName = lastName;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.salary = salary;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
