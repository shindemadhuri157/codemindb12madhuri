package hellopackage;

public class finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,80,60,89};
int b;
try {
	b=a[8];
	System.out.println(a);
}catch (Exception e){
	System.out.println( e.getMessage()+" "+"arrayindexoutofbounds");
}finally {
	System.out.println("final block excuted");
}
	}

}
