package cp100a.thompcj9.case2;

public class Business {
	
	public static double computeSum (double a, double b){
		
		double sum;
				
		sum = a + b;
		
		return sum;
	}
	
	public static double computeProduct (double a, double b){
		
		double product;
		
		product = a*b;
		
		return product;
	}

	public static double computeAverage (double a, double b, double c){
		
		double average;
		double ab;
		double abc;
		
		ab = computeSum(a,b);
		abc = computeSum(ab,c);
		
		average = abc/3;
		
		return average;
	}
	
	public static void displayBar(int a){
		for (int b = 0; b < a; b++)
			{
				System.out.print("*");
			}
		System.out.println("");
	
	}
	
	public static double computePV (double fv, double i, double y){
		
		double pv = 0;
		
		pv = fv / Math.pow((1 + i),y);
		
		return pv;
	}
	
	public static String determineGrade (double a, double b, double c) {
		
		String grade = null;
		Double gradeAverage;
		
		gradeAverage = computeAverage (a,b,c);
		
		if (gradeAverage >= 90){
			
			grade = "A";
		}
		
		else if ((gradeAverage >= 80) && (gradeAverage < 90)){
			
			grade = "B";
		}
	
		else if ((gradeAverage >= 70) && (gradeAverage < 80)){
			
			grade = "C";
		}
		
		else if ((gradeAverage >= 60) && (gradeAverage < 70)){
			
			grade = "D";
		}
		
		else if (gradeAverage < 60) {
			
			grade = "F";
		}
		
		return grade;
		
	}
}