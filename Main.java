package srp;

public class Main {
	 public static void main(String[] args) {
	        // Buat objek Employee
	        Employee employee = new Employee("Namira", 5000);

	        // Buat objek untuk masing-masing kelas
	        BonusCalculator bonusCalculator = new BonusCalculator();
	        PaySlipPrinter paySlipPrinter = new PaySlipPrinter();
	        EmployeeDatabase employeeDatabase = new EmployeeDatabase();

	        // Mencetak slip gaji menggunakan PaySlipPrinter
	        paySlipPrinter.printPaySlip(employee, bonusCalculator);

	        // Menyimpan data ke database menggunakan EmployeeDatabase
	        employeeDatabase.saveToDatabase(employee);
	    }
	}

