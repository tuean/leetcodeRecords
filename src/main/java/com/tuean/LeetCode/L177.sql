Nth Largest Salary

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary
        from
        Employee
        order by salary desc
        limit 1
        offset N
  );
END


fastest

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare M int;
Set M=N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct Salary from Employee order by Salary desc limit M, 1
  );
END