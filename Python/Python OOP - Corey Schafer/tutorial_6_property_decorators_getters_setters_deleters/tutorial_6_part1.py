class Employee:
    
    def __init__(self, first, last) -> None:
        self.first = first
        self.last = last
    
    # Define email like a method, but call it as an attribute
    # Getter
    @property
    def email(self):
        return f"{self.first}.{self.last}@email.com" 
    
    # Getter 
    @property
    def fullname(self):
        return f"{self.first} {self.last}"

    # Setter
    @fullname.setter
    def fullname(self, name):
        first, last = name.split(" ")
        self.first = first
        self.last = last        
        
    # Deleter
    @fullname.deleter
    def fullname(self):
        print("Delete fullname")
        self.first = None
        self.last = None


if __name__ == "__main__":
    
    emp_1 = Employee("John", "Smith")
    
    emp_1.first = "Jim"
    
    print(emp_1.first)
    print(emp_1.email)
    print(emp_1.fullname)
    
    emp_1.fullname = "Corey Schafer"
    
    print(emp_1.first)
    print(emp_1.email)
    print(emp_1.fullname)
    
    del emp_1.fullname
    
    print(emp_1.first)
    print(emp_1.email)
    print(emp_1.fullname)
    
    
    