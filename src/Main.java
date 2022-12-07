import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Employee leo = new Employee("Leo",22,2,1000);
    Employee gabi = new Employee("Gabi",21,4,2000);
    Employee pedro = new Employee("Pedro",19,3,2500);
    Employee costa = new Employee("Costa",18,1,5000);
    Employee leo2 = new Employee("Leo",32,1,900);

    Departement departementOne = new Departement();
    Departement departementTwo = new Departement();

    EmployeeAnalyzer analyzer = new EmployeeAnalyzer();


    departementOne.getEmployees().add(gabi);
    departementOne.getEmployees().add(pedro);
    departementOne.getEmployees().add(leo);

    departementTwo.getEmployees().add(costa);
    departementTwo.getEmployees().add(leo2);

    
    }
}