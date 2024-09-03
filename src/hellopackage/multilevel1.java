package hellopackage;

public class multilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     samsung s=new samsung();
     System.out.println(s.companyname);
     System.out.println(s.companytype);
     System.out.println(s.product);
     System.out.println(s.productcompany);
     System.out.println(s.productprize);
     System.out.println(s.productcompany);
     System.out.println(s.producttype);
     System.out.println(s.screensize);
     s.poweron();
     s.poweroff();
	}
	}
class company{
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

class samsung extends dell{
	String productname="tv";
	int productprize= 50000;
	String productcompany="samsung";
	int screensize= 32;
	String producttype="colour tv";
}

