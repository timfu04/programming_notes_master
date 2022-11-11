import datetime

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
    
    # Use static method when you don't need to access class or instance attributes/variables
    @staticmethod
    def is_workday(day):
        if day.weekday() == 5 or day.weekday() == 6:
            return False
        return True
        
        
if __name__ == "__main__":
    
    my_date = datetime.date(2016, 7, 10)
    my_date2 = datetime.date(2016, 7, 11)

    print(Employee.is_workday(my_date))
    print(Employee.is_workday(my_date2))


