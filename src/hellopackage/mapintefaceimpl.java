package hellopackage;

import java.util.HashMap;
import java.util.Map;

public class mapintefaceimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(546892, "vidya");
map.put(123456, "pannu");
map.put(678905, "radha");
//not allowed duplicate key
map.put(678905, "vicky");
// // it may have duplicate value
map.put(546738, "vidya");
// key allows a single null value
map.put(null, "varsha");
map.put(null, "priya");
//value may have multiple null value
map.put(657231, null);
map.put(652109, null);
System.out.println(map.toString());

	}

}
