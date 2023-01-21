package application;

import employee.Employee;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        out.print("Enter a data number: ");
        int n = sc.nextInt();
        int o = 0;
        List<Employee> employees = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            out.println("Employeer #" + ++o);
            out.print("id: ");
            int id = sc.nextInt();

            while (hasId(employees, id)) {
                out.print("Id exists, enter a new number!\n");
                id = sc.nextInt();
            }


            out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(name, id, salary));

        }

        // Increase of salary if, id not exists.
        out.print("Enter the employeer id that will have salary increase: ");
        int checkId = sc.nextInt();

        //Employee emp = employees.stream().filter(x -> x.getId() == checkId)
          //      .findFirst().orElse(null);
        //
        // OR To exchange variable pos for emp.

        Integer pos = position(employees, checkId);
        if (pos == null) {
            out.println("Id does not exists!");
        } else {
            out.print("Enter the percentage: ");
            employees.get(pos).incrementSalary(sc.nextInt());
        }




        for (Employee print : employees) {
            out.print(print);
        }


        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
    return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}