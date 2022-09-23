create database EmployeeManagement;
use EmployeeManagement;

-- EMPLOYEE TABLE --

CREATE table employee(
	emp_id int NOT NULL PRIMARY KEY,
	emp_name nvarchar(30),
    dob date, 
    gender char(10), 
    emp_no varchar(20), 
    salary varchar(10),
    pincode int,
    CONSTRAINT FK_pincode1
    FOREIGN KEY(pincode)
    REFERENCES pincode(pincode),
    job_id int,
    CONSTRAINT FK_jobid1
    FOREIGN KEY(job_id)
    REFERENCES job(job_id),
    dep_id int,
    CONSTRAINT FK_depid1
    FOREIGN KEY(dep_id)
    REFERENCES department(dep_id)
);

insert into employee values (101,'Mahesh Kumar','1998-11-20','MALE','8627024573','70000',110030,201,301);
insert into employee values (102,'Rajesh Kumar','1990-12-12','MALE','9812024573','60000',110060,202,302);
insert into employee values (103,'Rahul Singh','1992-08-22','MALE','9867546573','80000',110080,203,303);

-- PINCODE TABLE -- 

CREATE table pincode(
	pincode int NOT NULL PRIMARY KEY,
    state char (10),
    city char(10),
    area char(15)
); 
insert into pincode values (110030,'Delhi','New Delhi','Mehrauli');   
insert into pincode values (110060,'Delhi','New Delhi','Saket');   
insert into pincode values (110080,'Delhi','New Delhi','Rajouri garden');   
-- JOB TABLE --

CREATE table job(
	job_id int NOT NULL PRIMARY KEY,
    j_title char (30),
    j_des char(30)
);
drop table job;
insert into job values (201,'Software Engineer','Mangager');
insert into job values (202,'Hr','Sr. Hr'); 
insert into job values (203,'Finance Head','Manager');  
-- DEPARTMENT TABLE --

CREATE table department(
	dep_id int NOT NULL PRIMARY KEY,
    d_code char (10),
    d_des varchar(10)
);        
insert into department values (301,'d-301','It');  
insert into department values (302,'d-302','Hr');  
insert into department values (303,'d-303','Finance');  


-- SELECT --
SELECT * from employee;
SELECT * FROM employee where emp_id='101';

-- ORDERBY --
SELECT * from employee ORDER BY salary;
SELECT * from employee ORDER BY emp_name;

-- UPDATE --
UPDATE employee SET emp_name ='Ekjot Singh' where emp_id =101;
SELECT * from employee;

-- DELETE --
DELETE from employee where emp_id = 103; 


CREATE TABLE voter(
vId INT PRIMARY KEY,
vname VARCHAR(20) NOT NULL,
address VARCHAR(30),
age INT,
CHECK (age>=18)
);

INSERT into voter values (101,'ekjot','delhi',17);
