# Python Object-Oriented Programming

class Employee:
    pass

emp_1 = Employee()
emp_2 = Employee()

# Both Employee objects are unique (have different location in memory)
print(emp_1)
print(emp_2)

# Manually create instance attributes/variables for each Employee object
emp_1.first = "Corey"
emp_1.last = "Schafer"
emp_1.email = "Corey.Schafer@company.com"
emp_1.pay = 50000

emp_2.first = "Clement"
emp_2.last = "Lee"
emp_2.email = "Clement.Lee@company.com"
emp_2.pay = 80000

# Print instance attributes/variables
print(emp_1.email)
print(emp_2.email)


