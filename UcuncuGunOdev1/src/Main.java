
public class Main {

	public static void main(String[] args) {
		
		// referans tip //

		referansExamples();
		
		// class
		
		classExamples();
		
		// interface
		
		CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager.GiveCredit();
	}

	private static void referansExamples() {
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		
		sayilar1=sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
	}

	private static void classExamples() {
		
		CreditManager creditManager = new CreditManager();  // instance creation
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.Id =1;

		customer.City="Ýzmir";
		
		
		Person person = new Person();
		person.FirstName="Engin";
		person.LastName="Demiroð";
		person.NationalIdentity="1247846";

		Company company = new Company();
		company.taxNumber = "13466";
		company.CompanyName="Arçelik";
		company.Id=100;
		
		CustomerManager customerManager = new CustomerManager(person,new MilitaryCreditManager());
		customerManager.Save(person);
		customerManager.Delete(person);
		
		CustomerManager customerManager2 = new CustomerManager(person,new MilitaryCreditManager());

		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
	}
	
	
}

class Customer
{
	
	public Customer()
	{
		System.out.println("Müþteri nesnesi baþlatýldý.");
	}
	
	public int Id;

	public String City;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
}

class CustomerManager
{
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer,ICreditManager creditManager)
	{
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save(Person person)
	{
		System.out.println("Müþteri kaydedildi:" + person.FirstName);
	}
	
	public void Delete(Person person)
	{
		System.out.println("Müþteri silindi:" + person.FirstName);
	}

	public void GiveCredit()
	{
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}
}

class CreditManager
{
	public void Calculate() 
	{
		System.out.println("Hesaplandý");
	}
	
	public void Save() 
	{
		System.out.println("Kredi verildi");
	}
	
}

class Person extends Customer
{
	public String FirstName;
	public String LastName;
	public String NationalIdentity;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
}
class Company extends Customer
{
	public String CompanyName;
	
	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public String taxNumber;

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}

interface ICreditManager
{
	void Calculate();
	
	void Save();
	
}


abstract class BaseCreditManager implements ICreditManager
{
	public abstract void Calculate();
	
	public void Save()
	{
		System.out.println("Kaydedidi.");
	}
	
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager
{

	@Override
	public void Calculate() {
		System.out.println("Öðretmen kredisi hesaplandý");
	}
}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager
{

	@Override
	public void Calculate() {
		System.out.println("Asker kredisi hesaplandý");
		
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		super.Save();
	}
}

