select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

select * from Customers where City='Berlin'
--case insensitive
select * from Products where CategoryID=1 or CategoryID=3

select * from Products where CategoryID=1 and UnitPrice>10

select * from Products where CategoryID=1 order by ProductName desc

select count(*) Adet from Products where CategoryID=2

select CategoryID,count(*) Adet from Products
where UnitPrice>20
group by CategoryID 
having count(*)<10

select p.ProductID,p.ProductName,p.UnitPrice,c.CategoryName from Products p
inner join Categories c on c.CategoryID=p.CategoryID
where p.UnitPrice>10
-- DTO data transformation object

select * from Products p
inner join [Order Details] od on od.ProductID=p.ProductID
inner join Orders o on o.OrderID=od.OrderID

select * from Customers c left join Orders o on c.CustomerID=o.CustomerID
where o.CustomerID is null