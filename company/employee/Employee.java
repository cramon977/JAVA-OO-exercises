package employee;

public class Employee {

    private String name;
    private int id;

    private double salary;

    public Employee(){}
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void incrementSalary (double value) {
        double increase = getSalary() + getSalary() * value / 100.0;
        setSalary(increase);
    }

    public String toString(){
        return String.format("%d, ", id)
                + String.format("%s, ",name)
                + String.format("%.2f\n",salary);
    }

}