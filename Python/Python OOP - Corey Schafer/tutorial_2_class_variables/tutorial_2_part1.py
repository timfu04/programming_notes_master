class Employee:
    
    # class attribute/ variable
    # able to access through class or instance
    raise_amount = 1.04
    num_of_emps = 0
    
    def __init__(self, first, last, pay) -> None:
        self.first = first
        self.last = last
        self.pay = pay
        self.email = f"{first}.{last}@company.com"
        
        # Increment the number of employees by 1 for each Employee object created
        Employee.num_of_emps += 1
        
    def fullname(self):
        return f"{self.first} {self.last}"
    
    def apply_raise(self):
        self.pay = int(self.pay * self.raise_amount)

print(Employee.num_of_emps)
print("\n")        
        
emp_1 = Employee("Corey", "Schafer", 50000)
emp_2 = Employee("Clement", "Lee", 80000)


# Both class and instance can access class attribute/variable
# When accessing a class attribute, it will check whether the instance contains the attribute first. If no, it will check whether the class contains the attribute
print(emp_1.raise_amount)
print(Employee.raise_amount)
print(emp_2.raise_amount)
print("\n")

# There is no "raise_amount" to be found
print(emp_1.__dict__)
print("\n")

# "raise_amount" is in Employee class
print(Employee.__dict__)
print("\n")


# Despite able to access class attribute/variable from both class and instance
# Assign new value through instance would only change value on that particular instance
emp_1.raise_amount = 1.05 # create a new instance attribute/ variable called "raise_amount" with value of 1.05

print(emp_1.raise_amount)
print(Employee.raise_amount)
print(emp_2.raise_amount)
print("\n")


# Assign new value through class would change value across all instances
Employee.raise_amount = 1.06

print(emp_1.raise_amount) # 1.05 because "raise_amount" can already be found in instance level, therefore it will not search in class level
print(Employee.raise_amount)
print(emp_2.raise_amount)
print("\n")

print(Employee.num_of_emps)


