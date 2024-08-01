package hellopackage;

class personinfo {

	 String Name;
	 String Gender;
	 int Age;
	 void work() {
		 System.out.println(" ved is working");
	 }
	 void eat() {
		 System.out.println(" ved is eating");
	 }
	 void play() {
		 System.out.println("Ved is playing");
	 }
}

public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personinfo p1= new personinfo();
		p1.Name="ved";
		p1.Gender="male";
		p1.Age= 23;
		System.out.println("Name:"+p1.Name);
		System.out.println("Gender:"+p1.Gender);
		System.out.println("Age:"+p1.Age);
		p1.work();
		p1.eat();
		p1.play();
		
		


	}

}
