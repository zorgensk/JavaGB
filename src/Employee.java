import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;

    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 1000);
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, 25, 1000);
    }

    public int getAge(int age) {
        this.age = age;
        return age;
    }

    public double getSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public String getFullName(String firstName, String lastName) {
        if (firstName == "") {
            this.firstName = "uncknown";
        }
        this.firstName = firstName;
        this.lastName = lastName;
        String fullName = lastName + " " + firstName;
        return fullName;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            this.age = 25;
        }
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 1000;
        }
    }

    @Override
    public String toString() {
        return "Employee: " + "\n\t" + getFullName(firstName, lastName) + "\n"
                + "Age:" + "\n\t" + getAge(age) + "\n"
                + "Salary: " + "\n\t" + getSalary(salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        obj = (Employee) obj;
        return firstName.equals(((Employee) obj).firstName) && lastName == ((Employee) obj).lastName;

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, age);
    }
}




