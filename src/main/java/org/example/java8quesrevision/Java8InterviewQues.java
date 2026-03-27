package org.example.java8quesrevision;

import javax.swing.text.html.Option;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8InterviewQues {
    public static void main(String[] args) {
        List<Department> departments = List.of(
                new Department("IT", List.of(
                        new Employee("A", 50000,Arrays.asList("Java","SQL")),
                        new Employee("B", 60000,Arrays.asList("Python","Django"))
                )),
                new Department("HR", List.of(
                        new Employee("C", 40000,Arrays.asList("MS Excel","MS PPT"))
                )));

        //ques1:find total salary of all the employees for all the dept
        double totalSalary = departments.stream()
                .flatMap(x -> x.getEmployees()
                        .stream()
                        .map(s -> s.getSalary())).reduce(Double::sum).get();
        System.out.println(totalSalary);

        List<Order> orders = List.of(
                new Order(List.of(
                        new Item("Pen", 10, 2),
                        new Item("Book", 50, 1)
                )),
                new Order(List.of(
                        new Item("Pencil", 5, 10)
                ))
        );

        //ques2:Total revenue from all orders
        double totalRevenue = orders.stream().flatMap(x -> x.getItems().stream()).map(r -> (r.getTotalPrice())).reduce(Double::sum).get();
        System.out.println(totalRevenue);

        //ques3: count total words across all the sentences
        List<String> sentences = List.of(
                "java streams are powerful",
                "flatmap map reduce"
        );
        int totalWords = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).map(word -> 1).reduce(Integer::sum).get();
        System.out.println(totalWords);

        //ques4: Find max salary across all departments
        double maxSalary = departments.stream().flatMap(x -> x.getEmployees().stream()).map(s -> s.getSalary()).reduce(Double::max).get();
        System.out.println(maxSalary);
       Optional<Employee> maxSal = departments.stream()
                .flatMap(x -> x.getEmployees()
                        .stream())
                .max(Comparator.comparingDouble(Employee::getSalary));
       maxSal.ifPresent(s-> System.out.println(s.getSalary() + " "+s.name));

        double maxSalar = departments.stream().flatMap(x -> x.getEmployees().stream()).mapToDouble(x -> x.getSalary()).max().orElse(0.0);
        System.out.println(maxSalar);

        //ques 5: find high salaried employee name

        Employee ee = departments.stream().flatMap(e->e.getEmployees().stream()).reduce( (e1,e2) -> e1.getSalary()>e2.getSalary() ?e1:e2).get();
        System.out.println(ee.name);

        //ques 6: Count total number of distinct skills across organization
        long countDistinctSkills= departments.stream().flatMap(x->x.getEmployees().stream()).flatMap(x->x.getSkills().stream().map(String::toLowerCase)).distinct().count();
        System.out.println(countDistinctSkills);

        //ques7: Sum of all available account balances(Optional case)
        List<User> users = List.of(
                new User(Optional.of(new Account(1000))),
                new User(Optional.empty()),
                new User(Optional.of(new Account(500)))
        );
        double totalAcctBalance = users.stream().flatMap(x->x.getAccount().stream()).map(Account::getBalance).reduce(Double::sum).get();
        System.out.println(totalAcctBalance);
    }
}
