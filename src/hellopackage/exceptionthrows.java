package hellopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionthrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 60;
		int q;
		try {
			q = p / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " arithmetic exception");
		}
		exceptionthrowsexample y = new exceptionthrowsexample();
		
		try {
			y.read();
			} catch (FileNotFoundException d) {
				System.out.println(d.getMessage() + " " + "file not found exception");
			}

		}
	}
	

class exceptionthrowsexample {
	void operations() throws ArithmeticException {

	}

	void read() throws FileNotFoundException {
		File f = new File("C:\\Users\\admin\\Desktop\\ automation");
		FileReader fr = new FileReader(f);
	}
}

