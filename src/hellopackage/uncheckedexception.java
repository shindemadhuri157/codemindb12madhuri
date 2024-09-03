package hellopackage;

public class uncheckedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p=20;
int q;

try {
q=p/0;
}catch(Exception e){
	System.out.println(e.getMessage());
	
}
System.out.println("unchecked exception  handling by using try catch");

	}

}
