public class Employee {
    private String name;
    private int age;
    private int yearsAtCompany;
    private double salary;


    public Employee(String name, int age, int yearsAtCompany, double salary) {
        this.name = name;
        this.age = age;
        this.yearsAtCompany = yearsAtCompany;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
