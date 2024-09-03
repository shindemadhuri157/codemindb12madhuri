package hellopackage;

public class reversethestring {

	public static void main(String[] args) {
		String a="welcome to codemind";
		for (int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
		System.out.println("#####################################");
int rows =5;
for(int i=0;i<rows;i++) {
	for(int j=rows-i-1;j>0;j--) {
		System.out.print(" ");
	}
	
	for(int k=0;k<(2*i+1);k++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
