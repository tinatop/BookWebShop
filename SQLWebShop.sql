use BookWebShop
go


CREATE TABLE Customer(
IDCustomer int primary key identity,
FirstName nvarchar(30),
LastName nvarchar(30),
Adress nvarchar(100),
Email nvarchar(30),
CustomerPassword nvarchar(30)
)
go

CREATE TABLE Category(
IDCategory int primary key identity,
Title nvarchar(30)
)

CREATE TABLE Product(
IDProduct int primary key identity,
Title nvarchar(30),
Price float,
Img nvarchar(200),
CatgoryID int foreign key references Category(IDCategory)
)

CREATE TABLE PaymentMethod(
IDPaymentMethod int primary key identity,
PaymentMethodName nvarchar(30)
)

CREATE TABLE Bill(
IDBill int primary key identity,
BillDate nvarchar(50),
CustomerID int foreign key references Customer(IDCustomer),
PaymentMethodID int foreign key references PaymentMethod(IDPaymentMethod)
)


CREATE TABLE Item(
IDItem int primary key identity,
ProductID int foreign key references Product(IDProduct),
BillID int foreign key references Bill(IDBill),
Quantity int
)

CREATE TABLE LogInfo(
IDLogInfo int primary key identity,
CustomerID int foreign key references Customer(IDCustomer),
LogDate nvarchar(50),
IPAdress nvarchar(300)
)

go

CREATE PROC INSERT_CUSTOMER
@FirstName nvarchar(30),
@LastName nvarchar(30),
@Adress nvarchar(100),
@Email nvarchar(30),
@CustomerPassword nvarchar(30)
as
Insert into Customer(FirstName,LastName,Adress,Email,CustomerPassword)
Values(@FirstName,@LastName,@Adress,@Email,@CustomerPassword)
go


CREATE PROC GET_ALL_CUSTOMERS
as
select IDCustomer,FirstName,LastName,Adress,Email,CustomerPassword from Customer
go

CREATE PROC GET_CUSTOMER
@id int
as
select*from Customer
where IDCustomer=@id
go

CREATE PROC GET_ALL_CATEGORY
as
select*from Category
go

CREATE PROC GET_ALL_PRODUCTS
as
select*from Product
go

CREATE PROC GET_PRODUCT
@id int
as
select IDProduct, Title, Price, Img, CatgoryID from Product
where IDProduct=@id
go

CREATE PROC GET_ALL_PAYMENT_METHODS
as
select*from PaymentMethod
go

CREATE PROC GET_ALL_BILLS
as
select*from Bill
go

CREATE PROC INSERT_BILL
@BillDate date,
@CustomerID int,
@PaymentMethodID int,
@id int output
as
Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values(@BillDate,@CustomerID,@PaymentMethodID);
select @id=SCOPE_IDENTITY()
go

CREATE PROC GET_BILL
@id int
as
select*from Bill
where IDBill=@id
go

CREATE PROC GET_BILLS_FOR_CUSTOMER
@id int
as
select*from Bill
where CustomerID=@id
go

CREATE PROC GET_ITEMS_FOR_BILL
@billID int
as
select*from Item
where BillID=@billID
go

CREATE PROC INSERT_ITEM
@ProductID int,
@BillID int,
@Quantity int
as
Insert into Item(ProductID,BillID,Quantity)
Values(@ProductID,@BillID,@Quantity)
go

CREATE PROC GET_ALL_LOGINFO
as
select*from LogInfo
go

CREATE PROC INSERT_LOGINFO
@CustomerID int,
@LogDate nvarchar(50),
@IPAdress nvarchar(300)
as
Insert into LogInfo(CustomerID,LogDate,IPAdress)
Values(@CustomerID,@LogDate,@IPAdress)
go

