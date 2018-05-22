
/*use TestBase
go
create table Store (
Id BIGINT NOT NULL IDENTITY(1,1) PRIMARY KEY,
Order_Id BIGINT NOT NULL,
ProuctCategory Varchar(100) Null,
ProductName Varchar(100) Not Null,
Producent Varchar(100) Null,
AmountOfProduct INT null,
);

-------------------------------create table
USE TestBase
GO
Create Table Orders (
Order_Id BIGINT NOT NULL Primary KEY,
ProductAmount INT not null,
);
--------------------------------------------simple insert
Insert into Orders values (0, 30);

Insert into Store(
Order_Id,
ProuctCategory,
ProductName,
Producent,
AmountOfProduct) values (1,'Tools','Hummer','Sthil',50);
---------------------------------------------------------------------Drop primary key
alter table orders drop constraint [PK__Orders__F1E4607BA8F816BC]

Update Orders SET Id = 0 where Order_Id = 0;
ALTER TABLE Orders ADD ID2 int;
update Orders set ID2 = 1 where ID = 0;
*/
/*
declare 

Insert into Orders 

DECLARE @first AS INT = 1
DECLARE @last AS INT = 300

WHILE(@first <= @last)
BEGIN
    INSERT INTO tblFoo VALUES(@first)
    SET @first += 1
END
--------------------------------------------------------------Insert primary Key (nie dzia³a)
ALTER TABLE tbl_name alter column column_name int NOT NULL
ALTER TABLE tbl_name ADD PRIMARY KEY (column_name)
Create table Orders (
ID int not null Primary Key,
Order_ID BIGINT not null,
);
*/
alter table Orders1 add primary key (ID);


