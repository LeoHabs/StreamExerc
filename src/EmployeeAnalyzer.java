import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAnalyzer {

    public int numberOfEmployeesMinYears(Departement departement, int minYears) {
        return departement.getEmployees().stream().filter(e -> e.getYearsAtCompany() > minYears).toList().size();
    }

    public List<Employee> employeesEarningMoreThan(Departement departement, double salary) {
        return departement.getEmployees().stream().filter(e -> e.getSalary() > salary).collect(Collectors.toList());
    }

    public List<Employee> employeesOlderThan(Departement departement, int age){
       return departement.getEmployees().stream().filter(e -> e.getAge() > age).collect(Collectors.toList());
    }

    public List<Employee> oneEmployeeOlder(Departement departement, int age){
        return departement.getEmployees().stream().filter(e-> e.getAge() >= age).findFirst().stream().toList();
    }

    public double averageSalary(Departement departement){
        List<Double> salaries = departement.getEmployees().stream().map(e -> e.getSalary()).collect(Collectors.toList());
       return salaries.stream().mapToDouble(Double::doubleValue).sum()/ salaries.size();
    }

    public List<Employee> commonNames(Departement firstDepartement, Departement secondDepartement){
        return firstDepartement.getEmployees().stream().filter(second -> secondDepartement.getEmployees().stream()
                        .anyMatch(first -> first.getName().equals(second.getName())))
                .collect(Collectors.toList());

    }
}
