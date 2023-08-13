import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ap {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1,"A");
		hm.put(9, "dhsb");
		hm.put(9,"A");
		hm.put(10.0, "hsuhu");
		hm.put(2,"B");
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("D"));
		Collection c = hm.values();
		System.out.println(c);
		Set s = hm.keySet();
		System.out.println(s);
		Set s1 = hm.entrySet();
		System.out.println(s1);
		
		
	}

}
