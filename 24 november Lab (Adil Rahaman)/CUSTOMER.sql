create table CUSTOMER (
Cust_Id varchar(5),
Fname varchar(15),
Lname varchar(15),
Area char(2),
Phone int(10),
DOB date,
Payment numeric(6,2)
);

insert into CUSTOMER VALUES
('A01', 'Ivan', 'Ross', 'SA', 6125467, 1986 - 01 - 15, 800.50),
('A02', 'Vandana', 'Ray', 'MU', 5560379, 1987 - 12 - 20, 1000.70),
('A03', 'Pramada', 'Jauguste', 'DA', 4560389, 1967 - 08 - 25, 800.50),
('A04', 'Basu', 'Navindi', 'BA', 6125401, 1956 - 02 - 30, 860.00),
('A05', 'Ravi', 'Shrihar', 'NA', null, 1989 - 02 - 15, 500.50),
('A06', 'Rukmini', 'Ayer', 'GH', 5125274, 1987 - 08 - 23, 1500.50);

desc CUSTOMER;
select * from CUSTOMER;
alter table CUSTOMER add New_Date date;
select  New_Date from CUSTOMER;
update CUSTOMER set Phone = 3564737 where Cust_Id = 'A02' and Cust_Id = 'A04';
select * from CUSTOMER;
delete from CUSTOMER where Cust_Id = 'A01' and Cust_Id = 'A05';
truncate table CUSTOMER;
insert into CUSTOMER VALUES
('A1', 'ADIL', 'singh', 'GH', 984569, 1989- 03 - 04, 1000.50),
('A2', 'AVIK', 'SIKDER', 'SA', 654789, 1964 - 12 - 14, 600.50),
('A3', 'ARJUN', 'RATHOR', 'BA', 123654, 1988 - 09 - 11, 500.50),
('A4', 'RITH', 'RAJAK', 'DA', 451783, 1999 - 07 - 05, 800.00),
('A5', 'SAMIRAN', 'BASAK', 'MU', 891237, 1987 - 06 - 03, 750.50);
update CUSTOMER set Lname = 'RAHAMAN' where Cust_Id = 'A1';
delete from CUSTOMER where Fname = 'AVIK';


