package hellopackage;

public class medicine {
	 String name;
	 int quantity;
	 int price;
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		medicine M1 = new medicine("calpol",10,100);
		M1.medicineinfo();
		
		medicine M2 = new medicine("crocine",15,33);
		M2.medicineinfo();
		
		medicine M3 = new medicine("benadryl",10,89);
		M3.medicineinfo();
	}
	public medicine (String name1,int quantity1, int price1 ) {
		name= name1;
		quantity=quantity1;
		price=price1;}
	public void medicineinfo() {
		System.out.println(name+" "+ quantity +" "+ price);
	}

}
