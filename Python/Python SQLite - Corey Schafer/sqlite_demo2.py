import sqlite3
from employee import Employee

# Create database connection
conn = sqlite3.connect(':memory:') # create in memory (RAM) database, fresh new database on each run (suitable for testing)

# Create database cursor
c = conn.cursor()

# Create database table
c.execute("""CREATE TABLE employees (
            first text,
            last text,
            pay integer
            )""")

# Insert employee
def insert_emp(emp):
    with conn: # context manager
        c.execute("INSERT INTO employees VALUES (:first, :last, :pay)", {"first": emp.first, "last": emp.last, "pay": emp.pay})

# Get employees by name in list
def get_emps_by_name(lastname):
    c.execute("SELECT * FROM employees WHERE last=:last", {"last": lastname})
    return c.fetchall()

# Update employee's pay
def update_pay(emp, pay):
    with conn:
        c.execute("""UPDATE employees SET pay = :pay
                    WHERE first = :first AND last = :last""",
                  {'first': emp.first, 'last': emp.last, 'pay': pay})

# Remove employee
def remove_emp(emp):
    with conn:
        c.execute("DELETE from employees WHERE first = :first AND last = :last",
                  {'first': emp.first, 'last': emp.last})

emp_1 = Employee('John', 'Doe', 80000)
emp_2 = Employee('Jane', 'Doe', 90000)

insert_emp(emp_1)
insert_emp(emp_2)

emps = get_emps_by_name("Doe")
print(emps)

update_pay(emp_2, 95000)
remove_emp(emp_1)

emps = get_emps_by_name("Doe")
print(emps)

conn.close()


