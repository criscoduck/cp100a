package cp100a.thompcj9.case2;

public class Driver {

	public static void main(String[] args) {
				
		int display = 82;
		
		System.out.println("The sum of 1.456 and 2.9 = " +Business.computeSum(1.456, 2.9));
		System.out.println("The product of 1.456 and 2.9 = " +Business.computeProduct(1.456, 2.9));
		System.out.println("The average of 1.456, 2.9, and 6.8022 = " +Business.computeAverage(1.456, 2.9, 6.8022));
		Business.displayBar(display);
		System.out.println("The present value of 15000.0 at a rate of 0.035 for a time period of 5 = " +Business.computePV(15000.0, 0.035, 5));
		System.out.println("This student received the following exam scores, 94.0, 88.7, and 72.9 and will receive an overall grade of " +Business.determineGrade(94.0, 88.7, 72.9));
	
	
	}

}
