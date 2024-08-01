package hellopackage;

class employee1{
	int Id;   // data members
	String Name;
	int Salary;
	int Age;
	// member functions
	void work() {
	   System.out.println("Employee is working");
	}
		
	void travel() {
		System.out.println("Employee is traveling");
	
	}
}

public class employeelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 E1= new employee1();
		E1.Id=501;
		E1.Name="veda";
		E1.Salary=60000;
		E1.Age=28;
		System.out.println("Id:"+E1.Id);
		System.out.println("Name:"+E1.Name);
		System.out.println("Salary:"+E1.Salary);
		System.out.println("Age:"+E1.Age);
		E1.work();
		E1.travel();
		
		employee1 E2= new employee1();
		E2.Id=502;
		E2.Name="atharv";
		E2.Salary=50000;
		E2.Age=27;
		System.out.println("Id:"+E2.Id);
		System.out.println("Name:"+E2.Name);
		System.out.println("Salary:"+E2.Salary);
		System.out.println("Age:"+E2.Age);
		E2.work();
		E2.travel();
		
		employee1 E3= new employee1();
		E3.Id=503;
		E3.Name="sarthak";
		E3.Salary=70000;
		E3.Age=29;
		System.out.println("Id:"+E3.Id);
		System.out.println("Name:"+E3.Name);
		System.out.println("Salary:"+E3.Salary);
		System.out.println("Age:"+E3.Age);
		E3.work();
		E3.travel();
		

	}

}
