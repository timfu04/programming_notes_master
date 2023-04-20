import java.util.Objects;

// Before Records
public class EmployeeClass {

    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" + "name='" + name + '\'' + ", employeeNumber=" + employeeNumber + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeClass employee = (EmployeeClass) o;
        return Objects.equals(employeeNumber, employee.employeeNumber)
                && Objects.equals(name, employee.name);
    }
}


