-- Insert departments
INSERT INTO department (id, name) VALUES (1, 'Engineering');
INSERT INTO department (id, name) VALUES (2, 'HR');
INSERT INTO department (id, name) VALUES (3, 'Marketing');

-- Insert employees
INSERT INTO employee (id, name, department_id, salary) VALUES (1, 'John Doe', 1, 5000);
INSERT INTO employee (id, name, department_id, salary) VALUES (2, 'Jane Smith', 1, 6000);
INSERT INTO employee (id, name, department_id, salary) VALUES (3, 'Alice Johnson', 2, 15000);
INSERT INTO employee (id, name, department_id, salary) VALUES (4, 'Bob Brown', 3, 70000);
INSERT INTO employee (id, name, department_id, salary) VALUES (5, 'Charlie Davis', 3, 85000);
INSERT INTO employee (id, name, department_id, salary) VALUES (6, 'Eve Martinez', null, 5000); -- Employee without a department
