import sqlite3
from employee import Employee

# Create database connection (if .db file do not exist, create .db file and connect database, otherwise connect database only)
conn = sqlite3.connect('employee.db')

# Create database cursor
c = conn.cursor()

# c.execute("""CREATE TABLE employees (
#             first text,
#             last text,
#             pay integer
#             )""")

emp_1 = Employee('John', 'Doe', 80000)
emp_2 = Employee('Jane', 'Doe', 90000)

print(emp_1.first)
print(emp_1.last)
print(emp_1.pay)


# Ways to avoid SQL injection
# 1st way - use "?" as DB API placeholder, argument in tuple
# c.execute("INSERT INTO employees VALUES (?, ?, ?)", (emp_1.first, emp_1.last, emp_1.pay))

# conn.commit()

# 2nd way - use ":<name_describing_placeholder>", argument in dictionary
# c.execute("INSERT INTO employees VALUES (:first, :last, :pay)", {"first":emp_1.first, "last": emp_1.last, "pay": emp_1.pay})

# conn.commit()

c.execute("SELECT * FROM employees WHERE last = ?", ('Schafer',))
# print(c.fetchone())
# print(c.fetchmany(1))
print(c.fetchall())

c.execute("SELECT * FROM employees WHERE last = :last", {"last":"Doe"})

print(c.fetchall())

conn.commit()

conn.close()


