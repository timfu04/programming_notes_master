class Employee:
    
    # Consider this is initialize / Constructor if from other languages
    # "self" represents the instance of the class (first parameter by default)
    def __init__(self, first, last, pay) -> None:
        self.first = first
        self.last = last
        self.pay = pay
        self.email = f"{first}.{last}@company.com"
        
    # Method
    # "self" should be the first parameter
    def fullname(self):
        return f"{self.first} {self.last}"
        
        
# __init__ method will run automatically when creating an object
# "self" is passed in automatically when creating an object    
emp_1 = Employee("Corey", "Schafer", 50000)
emp_2 = Employee("Clement", "Lee", 80000)


# Print instance attributes/variables
print(emp_1.email)
print(emp_2.email)
    
    
# Print Employee first and last name manually
print(f"{emp_1.first} {emp_1.last}")


# Print Employee first and last name with class method
print(emp_1.fullname())


# Both below do the exact same thing
emp_2.fullname() # use instance to call method, no need to pass instance
#           |
#   emp_2.fullname() converts into Employee.fullname(emp_2) in the background
#           |   
#           V
Employee.fullname(emp_2) # use class to call method, need to pass instance


