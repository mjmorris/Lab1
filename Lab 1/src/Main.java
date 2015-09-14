import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Main {

	public static void main(String[] args){
		System.out.println("Input Retired Interest Rate:");
		Scanner keyboard = new Scanner(System.in);

		/* Mandy Morris
		 * Lucia Malvoni
		 * Michael DiSanto
		 * 
		 * retiredIR = retired interest rate
		 * yrsRetired = years retired
		 * monthIncome = monthly income
		 * monthSSI = monthly SSI
		 * workIR = working interest rate
		 * yrsWorking = years working
		 * PV = Present Value
		 * PMT = Payment
		 * The goal of the code is to allow user to input values for the
		 * above variables and calculates the PV and PMT for their
		 * retirement plan specifically. 
		 * The Scanner is used to prompt the user for values.
		 */
		
		double retiredIR = keyboard.nextDouble()/12;
		System.out.println("Input Years Retired:");
		double yrsRetired = keyboard.nextDouble()*12;
		System.out.println("Input Yearly Income:");
		double monthIncome = keyboard.nextDouble();
		System.out.println("Input Monthly SSI:");
		double monthSSI = keyboard.nextDouble();
		System.out.println("Input Working Interest Rate:");
		double workIR = keyboard.nextDouble()/12;
		System.out.println("Input Years Working:");
		double yrsWorking = keyboard.nextDouble()*12;
		double PV = FinanceLib.pv(retiredIR,  yrsRetired,  monthIncome-monthSSI,  0,  false);
		System.out.println("PV = " + Double.toString(PV));
		double PMT = FinanceLib.pmt(workIR,  yrsWorking,  0, PV,  false);
		System.out.println("PMT = " + Double.toString(PMT));


	}

}
