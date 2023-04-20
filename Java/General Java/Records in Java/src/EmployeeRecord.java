// Generate all private fields listed in the parameter (e.g. name & employeeNumber)
// Generate all final fields by default listed in the parameter (e.g. name & employeeNumber)
// Generate getter methods, instead of getName(), it is name()
// Generate constructor automatically (called canonical constructor)
// Generate toString, hashCode, equals method automatically
// Does not generate setter methods, because record is immutable
// record cannot extend any other class, because record already extended Record (Java only allow each class to extend maximum one class)
// record is implicitly final class (cannot be extended by other classes)
// record can implement multiple interfaces
// You can override the canonical constructor, e.g. usually to provide validation before setting the values

// This single line of code is equivalent of 44 lines code in EmployeeClass
public record EmployeeRecord(String name, int employeeNumber) {

    // Override canonical constructor (make sure parameters are the same)
//    public EmployeeRecord(String name, int employeeNumber){
//        if(employeeNumber < 0){
//            throw new IllegalArgumentException("employeeNumber cannot be negative");
//        }
//        this.name = name;
//        this.employeeNumber = employeeNumber;
//    }

    // same as above (override canonical constructor), compact constructor, only in record
    public EmployeeRecord{
        if(employeeNumber < 0){
            throw new IllegalArgumentException("employeeNumber cannot be negative");
        }
    }

    // Extra static field
    public static final String DEFAULT_EMPLOYEE_NAME = "George";
    public static String DEFAULT_EMPLOYEE_NAMES = "George";

    // Extra instance method
    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    // Extra static method
    public static void printWhatever(){
        System.out.println("Whatever");
    }
}
