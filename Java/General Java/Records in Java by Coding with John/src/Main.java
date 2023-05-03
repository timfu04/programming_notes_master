public class Main {
    public static void main(String[] args) {

        EmployeeClass empBeforeRecords = new EmployeeClass("Jerry", 1234);
        System.out.println(empBeforeRecords); // if you pass something not String in System.out.println(), it will invoke toString method
        System.out.println(empBeforeRecords.hashCode());
        System.out.println(empBeforeRecords.getName());
        System.out.println(empBeforeRecords.getEmployeeNumber());

        System.out.println();

        EmployeeRecord employeeAfterRecords = new EmployeeRecord("Tom", 5678);
        System.out.println(employeeAfterRecords); // if you pass something not String in System.out.println(), it will invoke toString method
        System.out.println(employeeAfterRecords.hashCode());
        System.out.println(employeeAfterRecords.name());
        System.out.println(employeeAfterRecords.employeeNumber());
        System.out.println(employeeAfterRecords.nameInUpperCase());
        EmployeeRecord.printWhatever();


//        EmployeeRecord employeeAfterRecords2 = new EmployeeRecord("Jerry", -8888); // this throws exception

    }
}