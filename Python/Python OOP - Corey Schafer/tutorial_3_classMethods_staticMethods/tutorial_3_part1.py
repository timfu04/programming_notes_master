class Employee:
    
    raise_amount = 1.04
    num_of_emps = 0
    
    def __init__(self, first, last, pay) -> None:
        self.first = first
        self.last = last
        self.pay = pay
        self.email = f"{first}.{last}@company.com"
        
        Employee.num_of_emps += 1
    
    # Instance method    
    def fullname(self):
        return f"{self.first} {self.last}"
    
    # Instance method
    def apply_raise(self):
        self.pay = int(self.pay * self.raise_amount)

    # Instead of passing "self", pass "cls" which represents class
    @classmethod # this is a decorator
    def set_raise_amt(cls, amount):
        cls.raise_amount = amount

    # Use class method as an alternative constructor
    # Accept and process string to create Employee object
    @classmethod
    def from_string(cls, emp_str):
        first, last, pay = emp_str.split("-")
        return cls(first, last, pay)
        

if __name__ == "__main__":
     
    emp_1 = Employee("Corey", "Schafer", 50000)
    emp_2 = Employee("Clement", "Lee", 80000)


    # Call class method to set new class attribute/variable value
    Employee.set_raise_amt(1.05)


    print(Employee.raise_amount)
    print(emp_1.raise_amount)
    print(emp_2.raise_amount)
    print("\n")


    emp_str_1 = "John-Doe-70000"
    emp_str_2 = "Steve-Smith-30000"
    emp_str_3 = "Jane-Doe-90000"


    new_emp_1 = Employee.from_string(emp_str_1)


    print(new_emp_1.email)
    print(new_emp_1.pay)


