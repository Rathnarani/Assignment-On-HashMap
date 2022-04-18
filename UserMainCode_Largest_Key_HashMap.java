package largest_key_in_hashmap;

import java.util.Map;
import java.util.Set;

public class UserMainCode_Largest_Key_HashMap {
	public static String getstring(Map<Integer, String> re)
	{
		int m = 0;
		 String r=" ";
		 Set<Integer> key=re.keySet();
		 for(Integer l :key)
		 {
			 if(l>m)
			 {
				 m=l;
				 r=re.get(l);
			 }
		 }
		 return r;
	}
}
