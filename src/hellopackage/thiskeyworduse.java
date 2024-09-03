package hellopackage;

public class thiskeyworduse {
int a;
int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyworduse t=new thiskeyworduse();
		t.sub(10, 56);
		System.out.println(t.a+t.b);
	}
public void sub(int a,int b){
	this.a=a;
	this.b=b;
}

thiskeyworduse(){
	this(34);
	System.out.println("default constrctor");
	
}
thiskeyworduse(int num){
	this(20,30);
	System.out.println("one parameter constructor");
}
thiskeyworduse(int num,int num2){
	System.out.println("two parameter constructor");
}
}
