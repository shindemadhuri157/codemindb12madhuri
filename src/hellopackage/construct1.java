package hellopackage;
   // default constructor
public class construct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee E = new employee();
		System.out.println(E.name +" "+ E.age +" "+ E.salary );
		}
	}
class employee{
	String name;
	int age;
	int salary;
	public void working() {
		System.out.println("employee is working");
	}

	public void traveling() {
		System.out.println("employee is traveling");
	}
	
		
	}
	
	
     


