package srp;

public class PaySlipPrinter {
	
	    public void printPaySlip(Employee employee, BonusCalculator bonusCalculator) {
	        double bonus = bonusCalculator.calculateBonus(employee);
	        System.out.println("Employee: " + employee.getName());
	        System.out.println("Salary: $" + employee.getSalary());
	        System.out.println("Bonus: $" + bonus);
	    }
	}


