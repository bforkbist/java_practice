CREATE TABLE `train`.`emp` (
  `emp_id` INT NOT NULL AUTO_INCREMENT,
  `emp_name` VARCHAR(45) NULL,
  `emp_state` VARCHAR(45) NULL,
  `emp_age` INT NULL DEFAULT 18,
  PRIMARY KEY (`emp_id`),
  UNIQUE INDEX `emp_id_UNIQUE` (`emp_id` ASC) VISIBLE);
  
insert into emp(emp_name,emp_state,emp_age) 
values("abhay","delhi",300);

select * from train.emp;

alter table train.emp 
drop living;

select distinct emp_state from train.emp;
select  * from train.emp where emp_age>23;

#and or not
select * from train.emp where emp_state = "rajasthan" or emp_age>20;

# order by asc/decs
select * from train.emp order by emp_age asc;

#min max count avg sum
select sum(emp_age) from train.emp;

#like a%= starting from a
# %b = ending with b
# %it% = have in any postion
# _r% have r in second position
#a__% starts with a and have at least 3 letters
select emp_name from train.emp where emp_name like "%ad%";


# triggers
create trigger trigger1
before insert on emp
for each row 
update emp set emp_age=emp_age+1;
set new.emp_age=new.emp_age+1;



create trigger trigger2
after insert on emp 
update emp_age;

drop trigger trigger2;


#stored method
create procedure display() 
select * from emp;
call display;
delimiter $$

create procedure insert_emp (empname varchar(45),empstate varchar(45), empage int)
begin
insert into train.emp(emp_name,emp_state,emp_age) value (empname,empstate,empage);
end $$
call insert_emp("abhay","uttar pradesh",300);


#to remove safe update
set sql_safe_updates=0;

#copy table
create table hello as select * from emp;


# copy schema of the table
create table hello like emp;
drop table hello;


#truncate
truncate hello;

select * from hello;



#foreign key
insert into students(name) value('abhinay');

insert into marks(english,sst,maths,id) values (20,30,50,3);


#join
select * from students inner join marks; 
select * from students right join marks on marks.id = students.id; 
select * from students left join marks on marks.id = students.id; 

Error Code: 1064. You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'where marks.id==students.id' at line 1

Apply changes to marks
Apply changes to marks
