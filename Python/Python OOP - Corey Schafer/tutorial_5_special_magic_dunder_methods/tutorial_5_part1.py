# Documentation (Special method names): https://docs.python.org/3/reference/datamodel.html#special-method-names
# Special / Magic / Dunder method: methods with double underscore as prefix and suffix

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
        
    # The goal of __repr__ is to be unambiguous (for other developers, like code)   
    def __repr__(self) -> str:
        return f"Employee('{self.first}', '{self.last}', {self.pay})"
        
    # The goal of __str__ is to be readable (for end users, like text)
    def __str__(self) -> str:
        return f"{self.fullname()} - {self.email}"
    
    # Sum up employees' salary
    def __add__(self, other) -> int:
        return self.pay + other.pay
    
    # Return the length of fullname
    def __len__(self):
        return len(self.fullname())


if __name__ == "__main__":
    
    emp_1 = Employee("Corey", "Schafer", 50000)
    emp_2 = Employee("Clement", "Lee", 60000)
    

    # By default, printing object shows something like this: <__main__.Employee object at 0x000001EEFC92BDC0>
    print(emp_1)
    print("\n")
    
    
    # Call __repr__ and __str__ with customized message
    # Both are calling __repr__ method
    print(repr(emp_1))
    print(emp_1.__repr__())
    print("\n")
    
    
    # Both are calling __str__ method
    print(str(emp_1))
    print(emp_1.__str__())
    print("\n")
    
    
    # Both are calling __add__ method
    # Example of operator overloading
    print(1 + 2)
    print(int.__add__(1, 2))
    
    
    # __add__ method concats strings
    print(str.__add__('a', 'b'))
    print("\n")
    

    print(emp_1 + emp_2)
    
    
    # Both are calling __len__ method
    print(len("test"))
    print(str.__len__("test"))
    
    
    print(len(emp_1))


