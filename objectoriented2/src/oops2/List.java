package oops2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class List {

	public static void main(String[] args) {

			// TODO Auto-generated method stub

			ArrayList list = new ArrayList ();

		    list.add ("a");
            list.add ("b");
            list.add ("b");
            list.add ("c"); 
            list.add ("c");
            list.add ("c");
            System.out.println(list);
   
	Set<String> set=new HashSet<String>();
    Set set2 = new HashSet();
    set.add ("a"); 
	set.add ("a");
    set2.add(1);
	System.out.println(set);
    System.out.println(list);
    
    //Map<key,value>
    //student s1:r1, s2:r2,.....s10000=r10000(unique)
    //customer1:orderid1,....
    Map<String, Integer> hm
    = new HashMap<String, Integer>();
    
    hm.put("a", 100);
    hm.put("b", 200);
    hm.put("c", 300);
    hm.put("d", 400);
    hm.get("a");
    System.out.println(hm);
}
}
