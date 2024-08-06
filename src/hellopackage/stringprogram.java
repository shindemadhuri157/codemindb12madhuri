package hellopackage;

public class stringprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//occurance of ch a in string radha
String a="Radha";
char ch ='a';
int occ = 0 ;
for(int i= 0; i< a.length();i++) {
	if(a.charAt(i)== ch) {
		occ++;
		
	}
	
}
System.out.println("occurance of ch a in string radha="+occ);
System.out.println();
System.out.println("#####################################################");
 //print reverse string of string radha
 String str = "radha";
 String rev="";
 char [] ch1 = str.toCharArray();
 for(int i = ch1.length-1;i>=0;i--) {
	 rev= rev + ch1[i];
	 
	 
 }
 System.out.println("reverse string of string radha="+" "+rev);
 System.out.println();
 System.out.println("#####################################################");
  String str2 ="radha";
  for(int i =0;i< str2.length();i++) {
	  if (str2.charAt(i)=='a') {
		  System.out.print(Character.toUpperCase(str2.charAt(i)));
		  Character.toUpperCase('a');
	  }else {
		  System.out.print(str2.charAt(i));
	  }
  }
	
	}

}
