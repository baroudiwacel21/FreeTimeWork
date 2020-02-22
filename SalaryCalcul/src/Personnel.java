import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Personnel {
	List<Employer> employerList = new ArrayList<Employer>();
	static final int MAXLIST_LENGTH = 200;
	
	void addEMp(Employer employer) {
		if(employerList.size() < MAXLIST_LENGTH)
		employerList.add(employer);
	}
	void calculSal() {
		for(Employer emp : employerList){
			  System.out.println(emp.getFirstName() + " gagne " + emp.calculSalary() + " francs.");
		}
	}
	double calculSalMoyen() {
		double sumSalaire = 0;
		for(Employer employer : employerList){
			sumSalaire += employer.calculSalary();
		}
		return sumSalaire/employerList.size();
	}
	
	public static void main(String[] args){
		 Personnel p = new Personnel();
	        p.addEMp(new Vendeur("Pierre", "Business", 45, "1995", 30000));
	        p.addEMp(new Commercial("Léon", "Vendtout", 25, "2001", 20000));
	        p.addEMp(new Production("Yves", "Bosseur", 28, "1998", 1000));
	        p.addEMp(new Manut("Jeanne", "Stocketout", 32, "1998", 45));
	        p.addEMp(new RiskedEmpProd("Jean", "Flippe", 28, "2000", 1000));
	        p.addEMp(new RiskedEmpManut("Al", "Abordage", 30, "2001", 45));
	 
	        p.calculSal();
	        System.out.println("Le salaire moyen dans l'entreprise est de " + p.calculSalMoyen() + " francs.");
	}
}
