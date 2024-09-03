package hellopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class exceptionchecked{
	void read()throws FileNotFoundException {
		File f=new File("C:\\Users\\admin\\Desktop\\ automation");
		FileReader fr= new FileReader(f);
	}
}
public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionchecked eh = new exceptionchecked();
		try {
			eh.read();
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("checked exception using try and catch");
	}

}
