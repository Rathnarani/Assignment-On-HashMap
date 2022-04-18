package grade_calculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMainCode_GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Float> stud = new LinkedHashMap<String, Float>();
         for(int i=0; i<n; i++)
         
        	 stud.put(scanner.next(), scanner.nextFloat());
         System.out.println(CalculateGrade.getstring(stud));
	
	}

}
