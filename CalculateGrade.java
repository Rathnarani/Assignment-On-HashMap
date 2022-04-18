package grade_calculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CalculateGrade {
 public static Map<String, String>  getstring(Map<String, Float> stud)
 {
	Map<String, String> s = new LinkedHashMap<String, String>();
	
	Set<String> key=stud.keySet();
	 for(String l: key)
	 {
	 
		 if(stud.get(l)>=60)
		 
			s.put(l, "Pass"); 
		 
		 else
			 s.put(l, "Fail");
	 }	 
	 return s;

 
}
}