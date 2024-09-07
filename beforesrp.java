package beforesrp;

public class beforesrp {


	public class employee {
		// Class yang melanggar SRP
		class Employee {
		    private String name;
		    private double salary;

		    public Employee(String name, double salary) {
		        this.name = name;
		        this.salary = salary;
		    }

		    // Fungsi untuk menghitung bonus
		    public double calculateBonus() {
		        return salary * 0.10;
		    }

		    // Fungsi untuk mencetak slip gaji
		    public void printPaySlip() {
		        System.out.println("Employee: " + name);
		        System.out.println("Salary: $" + salary);
		        System.out.println("Bonus: $" + calculateBonus());
		    }
		    
		    // Fungsi untuk menyimpan data karyawan ke dalam database
		    public void saveToDatabase() {
		        System.out.println("Saving employee " + name + " to the database...");
		    }
		}


	}


	}


