create schema if not exists company;
create table if not exists company.employee(
	Fname varchar(15) NOT NULL,
    Minit char,
    Lname varchar(15) NOT NULL,
    Ssn char(9) NOT NULL,
    Bdate DATE,
    Address varchar(30),
    Sex char,
    Salary decimal(10,2),
    Super_ssn char(9),
    Dno int NOT NULL,
    primary key (Ssn)
);

use company;

create table if not exists departament(
	Dname varchar(15) NOT NULL,
    Dnumber int NOT NULL,
    Mgr_ssn char(9),
    Mgr_start_date date,
    Dept_create_date date,
    primary key (Dnumber),
    Unique (Dname),
    foreign key (mgr_ssn) references employee(Ssn)
);

create table if not exists dept_locations(
	Dnumber int NOT NULL,
    Dlocation varchar(15) NOT NULL,
    primary key (Dnumber, Dlocation),
    foreign key (Dnumber) references departament (Dnumber)
);

create table if not exists project(
	Pname varchar(15) NOT NULL,
    Pnumber int NOT NULL,
    Plocation varchar(15),
    Dnum int NOT NULL,
    primary key (Pnumber),
    unique (Pname),
    foreign key (Dnum) references departament (Dnumber)
);

create table if not exists works_on(
	Essn char(9) NOT NULL,
    Pno int NOT NULL,
    Hours decimal(3,1) NOT NULL,
    primary key (Essn, Pno), 
    foreign key (Essn) references employee (Ssn),
    foreign key (Pno) references project (Pnumber)
);

create table if not exists dependent(
	Essn char(9) NOT NULL,
    Dependent_name varchar(15) NOT NULL,
    Sex char, -- M ou F
    Relationship varchar(8),
    primary key (Essn, Dependent_name),
    foreign key (Essn) references employee (Ssn)
);

-- drop schema company
show tables;

desc project;




