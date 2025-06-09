package ConditionalStatements;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maths=90, sci=95, engl=92;
		
		int average = (maths+sci+engl)/3;
		
		System.out.println(average);
		
		if(average<40) {
			System.out.println("Result: Fail");
			System.out.println("Please work harder next time.");
		}
		else if(average>40 && average<59) {
			System.out.println("Result: C grade");
			System.out.println("Keep improving.");
		}
		else if(average>60 && average<74) {
			System.out.println("Result: B grade");
			System.out.println("Keep improving.");
		}
		else if(average>75 && average<89) {
			System.out.println("Result: A grade");
			System.out.println("Excellent performance!");
		}
		else if(average>90 && average<100) {
			System.out.println("Result: A+ grade");
			System.out.println("Excellent performance!");
		}

	}

}
