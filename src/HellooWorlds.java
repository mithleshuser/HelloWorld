import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HellooWorlds {
    public static void main(String[] args) {
        Department account = new Department("Account", 75);
        Department hr = new Department("HR", 50);
        Department ops = new Department("OP", 25);
        Department tech = new Department("Tech", 150);

        List<Employee> employeeList = Arrays.asList(
                new Employee("David", 32, "Matara", account),
                new Employee("Brayan", 25, "Galle", hr),
                new Employee("JoAnne", 45, "Negombo", ops),
                new Employee("Jake", 65, "Galle", hr),
                new Employee("Brent", 55, "Matara", hr),
                new Employee("Allice", 23, "Matara", ops),
                new Employee("Austin", 30, "Negombo", tech),
                new Employee("Gerry", 29, "Matara", tech),
                new Employee("Scote", 20, "Negombo", ops),
                new Employee("Branden", 32, "Matara", account),
                new Employee("Iflias", 31, "Galle", hr));

        /* .*/
        System.out.println("Find all employees who leave in ‘Matara’ city, sort them by their name and print the names of employees");
        employeeList.stream()
                .filter(e -> e.getCity().equalsIgnoreCase("Matara"))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(e -> System.out.println(e.getName()));

        System.out.println("-----------Find distinct department names that employees work for");
        employeeList.
                stream().
                map(x -> x.getDepartment().getDepartmentName()).
                distinct().forEach(System.out::println);

        System.out.println("Find the department names that these employees work for, where the number of employees in the department is over 50.");
        employeeList.stream().filter(x -> x.getDepartment().getNoOfEmployees() > 50)
                .map(x -> x.getName()).forEach(System.out::println);

        System.out.println("-----------Create a comma separate string of department names sorted alphabetically.");

        String s = employeeList.stream()
                .map(e -> e.getDepartment().getDepartmentName())
                .distinct()
                .sorted()
                .reduce("", (a, b) -> (a + "," + b));
        System.out.println(s);
        /*or*/
   /*     if (employeeList.stream()
                .anyMatch(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("HR"))) {
            System.out.println("-----------Found employees from HR department");
        }
*/
        System.out.println("-----------Are there any employees from HR Department?");
        employeeList.stream()
                .filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("HR"))
                .map(y -> y.getName()).forEach(System.out::println);
       System.out.println("-------------What is the highest number of of employees in all departments?--");
        employeeList.stream()
                .map(e -> e.getDepartment().getNoOfEmployees())
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        System.out.println("-------------Find the department which has the highest number of employees ");
        employeeList.stream()
                .map(Employee::getDepartment)
                .reduce((d1, d2) -> d1.getNoOfEmployees() > d2.getNoOfEmployees() ? d1 : d2)
                .ifPresent(d -> System.out.println(d.getDepartmentName()));
        System.out.println("-------------The same thing can be done as follows using the max() method");
        employeeList.stream()
                .map(Employee::getDepartment)
                .max(Comparator.comparing(Department::getNoOfEmployees))
                .ifPresent(d -> System.out.println(d.getDepartmentName()));
        System.out.println("-------Find the total number of employees in all the departments.");
        employeeList.stream()
                .map(e -> e.getDepartment().getNoOfEmployees())
                .distinct().reduce(Integer::sum)
                .ifPresent(System.out::println);
    }

}