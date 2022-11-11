# Parent class
class Employee:
    
    raise_amount = 1.04
    
    def __init__(self, first, last, pay) -> None:
        self.first = first
        self.last = last
        self.pay = pay
        self.email = f"{first}.{last}@company.com"
       
    def fullname(self):
        return f"{self.first} {self.last}"
    
    def apply_raise(self):
        self.pay = int(self.pay * self.raise_amount)


# Child class (inherit from Employee class)
class Developer(Employee):
    
    raise_amount = 1.10 # override class variable from 1.04 to 1.10
    
    def __init__(self, first, last, pay, prog_lang) -> None:
        super().__init__(first, last, pay) # Let Employee class handles first, last, pay
        self.prog_lang = prog_lang # Let Developer class handles prog_lang


# Child class (inherit from Employee class)
class Manager(Employee):
    
    def __init__(self, first, last, pay, employees = None) -> None:
        super().__init__(first, last, pay) # Let Employee class handles first, last, pay
        if employees is None: # Let Manager class handles prog_lang
            self.employees = []
        else:
            self.employees = employees
    
    # Add employee
    def add_emp(self, emp):
        if emp not in self.employees:
            self.employees.append(emp)

    # Remove employee
    def remove_emp(self, emp):
        if emp in self.employees:
            self.employees.remove(emp)
            
    # Print all the employees that the Manager supervise
    def print_emps(self):
        for emp in self.employees:
            print(f"--> {emp.fullname()}")
            

if __name__ == "__main__":
    
    # When instantiate a Developer object, it first find the __init__ method in Developer class. If not there, it find from its parent class based on Method Resolution Order
    dev_1 = Developer("Corey", "Schafer", 50000, "Python")
    dev_2 = Developer("Clement", "Lee", 80000, "Java")

    
    # Method resolution order: (read the order from top to down)
    #     Developer (first)
    #     Employee (second)
    #     builtins.object (third) - every object in Python inherits from object class
    
    # print(help(Developer))
    

    # With override "raise_amount" values from Developer class
    print(dev_1.pay)
    dev_1.apply_raise()
    print(dev_1.pay)
    print("\n")
    
    
    # Add instance attribute(prog_lang) in subclass(Developer)
    print(dev_1.email)
    print(dev_1.prog_lang)
    print("\n")


    mgr_1 = Manager("Sue", "Smith", 100000, [dev_1])
    print(mgr_1.email)
    
    mgr_1.add_emp(dev_2)
    mgr_1.print_emps()
    print("\n")
    
    mgr_1.remove_emp(dev_2)
    mgr_1.print_emps()
    print("\n")


    # Check whether instance belongs to the class
    print(isinstance(mgr_1, Manager)) # mgr_1 is an instance of Manager class (True)
    print(isinstance(mgr_1, Employee)) # mgr_1 is an instance of Employee class (True)
    print(isinstance(mgr_1, Developer)) # mgr_1 is not an instance of Developer class (False)
    print("\n")
    
    
    # Check whether class(left) is a subclass of class(right)
    print(issubclass(Manager, Developer)) # Manager is not subclass of Developer (False)
    print(issubclass(Manager, Employee)) # Manager is subclass of Employee (True)
    print(issubclass(Developer, Employee)) # Developer is subclass of Employee (True)


