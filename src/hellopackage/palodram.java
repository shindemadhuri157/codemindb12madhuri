package hellopackage;

public class palodram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String z = "sad";
		String s = "";
		for (int i = z.length() - 1; i >= 0; i--) {
			s = s + z.charAt(i);
		}
			if (z.equals(s)) {
				System.out.println("given string is palodram =" + z);
			} else {
				System.out.println("given string is not palodram=" + z);
			}
		}
	
		
	}


