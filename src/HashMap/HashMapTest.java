package HashMap;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
//		hm.put("ö��", "010-1111-1111");
//		hm.put("����", "010-2222-2222");
//		
//		System.out.println(hm.get("ö��"));
//		System.out.println(hm.get("����"));
		
//		hm.put("ö��", "010-1111-1111");
//		hm.put("ö��", "010-2222-2222");
//		
//		System.out.println(hm.get("ö��"));

		
		hm.put("ö��", "010-1111-1111");
		hm.put("����", "010-1111-1111");
		
		System.out.println(hm.get("ö��"));
		System.out.println(hm.get("����"));
	}
}
