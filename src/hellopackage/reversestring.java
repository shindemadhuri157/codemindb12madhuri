package hellopackage;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count of character a in given string
		String a = "array is a object ";
		char ch = 'a';
		int occ = 0;
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == ch) {
				occ++;
			}
		}

		System.out.print("count of a in given string=" + occ);
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("reverse the given string");
		
		String g="codemind";		
		for(int i=g.length()-1;i>=0;i--) {
			System.out.print(g.charAt(i));
			
		}
		System.out.println();
		System.out.print("------------------------------------------");
		System.out.println();
		
		// string is palodram or not
		String d="sad";
		String e="";
		for(int i=d.length()-1;i>=0;i--) {
			e=e+d.charAt(i);
			
	}
	if (d.equals(e)) {
		System.out.println("given string is palodram="+d);
		

	}else
		
		System.out.println("given string is not  palodram="+d);
		}
	
	
		
		
		
		
		
		
		
		
	}


