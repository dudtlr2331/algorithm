package HashMap;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
//		hm.put("Ã¶¼ö", "010-1111-1111");
//		hm.put("¿µÈñ", "010-2222-2222");
//		
//		System.out.println(hm.get("Ã¶¼ö"));
//		System.out.println(hm.get("¿µÈñ"));
		
//		hm.put("Ã¶¼ö", "010-1111-1111");
//		hm.put("Ã¶¼ö", "010-2222-2222");
//		
//		System.out.println(hm.get("Ã¶¼ö"));

		
		hm.put("Ã¶¼ö", "010-1111-1111");
		hm.put("¿µÈñ", "010-1111-1111");
		
		System.out.println(hm.get("Ã¶¼ö"));
		System.out.println(hm.get("¿µÈñ"));
	}
}
