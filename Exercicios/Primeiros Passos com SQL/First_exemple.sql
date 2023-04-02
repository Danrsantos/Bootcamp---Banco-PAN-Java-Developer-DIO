show databases;
create database if not exists first_example;
use first_example;
create table person(
	person_id smallint unsigned,
	fname varchar(20),
	lname varchar(20),
	gender enum('M','F'),
	birth_date date,
	street varchar(30),
	city varchar(20),
	state varchar(20),
	country varchar(20),
	postal_code varchar(20),
    constraint pk_person primary key(person_id)
);
desc person;

create table favorite_food(
	person_id smallint unsigned,
    food varchar(20),
    constraint pk_favorite_food primary key (person_id, food),
    constraint fk_favorite_food_person_id foreign key (person_id) references person(person_id)
);

desc favorite_food;

show databases;
select * from information_schema.table_constraints
where constraint_schema = 'first_example';

select constraint_name from information_schema.table_constraints;

desc information_schema.table_constraints;

desc person;

insert into person values ('0', 'Danilo', 'Ribeiro', 'M', '1995-02-20', 'rual tal','Cidade F', 'SP', 'BR', '4612393764');
select * from person;

delete from person where person_id = 2 or person_id = 1;

insert into person values ('1', 'Danilo', 'Ribeiro', 'M', '1995-02-20', 'rual tal','Cidade F', 'SP', 'BR', '4612393764'), ('2', 'Danilo', 'Ribeiro', 'M', '1995-02-20', 'rual tal','Cidade F', 'SP', 'BR', '4612393764');

desc favorite_food;

insert into favorite_food values (0, 'Hamburguer');
select * from favorite_food;
