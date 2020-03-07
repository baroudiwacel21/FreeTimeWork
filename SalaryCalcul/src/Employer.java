public abstract class Employer {
	String firstName;
	String lastName;
	String entryDate;
	
	int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Employer(String firstName,String lastName, int age, String date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.entryDate = date;
	}
	
	protected abstract double calculSalary();
}
	
class Commercial extends Employer{
    static final double PERCENT = 0.2;
    static final double FIXED_PART = 800;
	double turnOver;
	Commercial(String firstName, String lastName, int age, String date, double turnOver) {
		super(firstName, lastName, age, date);
		this.turnOver = turnOver;
		  
	}

	@Override
	public double calculSalary() {
		return (this.turnOver * PERCENT) + FIXED_PART;
	}
};

class Vendeur extends Commercial{
	 static final double FIXED_PART = 400;
	  Vendeur(String firstName, String lastName, int age, String date, double turnOver) {
		  super(firstName, lastName, age, date, turnOver);
	}

	@Override
	public double calculSalary() {
		return (this.turnOver * PERCENT) + FIXED_PART;
	}
};

class Production extends Employer{
	double nbUnit;
	Production(String firstName, String lastName, int age, String date, int nbUnit) {
		super(firstName, lastName, age, date);
		this.nbUnit = nbUnit;
		  
	}

	@Override
	public double calculSalary() {
		return this.nbUnit * 5;
	}
};
	
class Manut extends Employer{
	double nbHours;
	Manut(String firstName, String lastName, int age, String date, double nbHours) {
		super(firstName, lastName, age, date);
		this.nbHours = nbHours;
		  
	}

	@Override
	public double calculSalary() {
		return this.nbHours * 65;
	}
};

interface riskedInterface{
	static final int PRIME = 200;
}
	
class RiskedEmpProd extends Production implements riskedInterface {
	RiskedEmpProd(String firstName, String lastName, int age, String date, int nbUnit) {
		super(firstName, lastName, age, date, nbUnit);
		  
	}
	@Override
	public double calculSalary() {
		return super.calculSalary() + PRIME;
	}
};

class RiskedEmpManut extends Manut implements riskedInterface{
	double nbHours;
	RiskedEmpManut(String firstName, String lastName, int age, String date, double nbHours) {
		super(firstName, lastName, age, date, nbHours);
		  
	}

	@Override
	public double calculSalary() {
		return super.calculSalary() + PRIME;
	}
};

















