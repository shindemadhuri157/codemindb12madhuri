package hellopackage;

public class hierarchicalinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dell d=new dell();
		System.out.println(d.companyname);
		System.out.println(d.companytype);
		System.out.println(d.product);
		System.out.println(d.productcompany);
		System.out.println(d.productname);
		System.out.println(d.productprize);
		System.out.println(d.ram);
		
		samsung g=new samsung();
		System.out.println(g.productcompany);
		System.out.println(g.productname);
		System.out.println(g.productname);
		System.out.println(g.producttype);
		System.out.println(g.productprize);
		System.out.println(g.screensize);
		
		d.poweron();
		d.poweroff();
}
}
class company {
//properties 
String companyname="LG/SAMSUNG/Dell";
String companytype="manual/automatic";
String product="tv/fridge/laptop";
//behaviour
public void poweron() {
	System.out.println("turns on the laptop");
}
public void poweroff() {
	 System.out.println("turns off the laptop");
}
}

class dell extends company{
String productname="laptop";
int productprize= 50000;
String productcompany="Dell";
String ram= "64GB";
}

class samsung extends company{
String productname="tv";
int productprize= 50000;
String productcompany="samsung";
int screensize= 32;
String producttype="colour tv";
}
