package Calculator_Linda.Calculator_Linda;


/**
 * 
 * Klass CalcBasic (Kalkylator Enkel)
 * Implementation av den Enkla delen av Kalkylatorn
 * Metoderna använder två double-parametrar och returnerar en double.
 * 
 * 
 * @author linda
 * @version 1.0
 */

public class CalcBasic implements ICalcBasic {

	/**
	 * Add - Addition mellan två doubles.
	 * 
	 * @param first : det första numret som double.
	 * @param second : det andra numret som double.
	 * @return resultatet av addition.
	 */
	@Override
	public double add(double first, double second) {
		double sum = first + second;
		return sum;
	}
	
	/**
	 * Sub - Subtraktion mellan två doubles.
	 * 
	 * @param first : det första numret som double.
	 * @param second : det andra numret som double.
	 * @return resultatet av subtraktionen.
	 */

	@Override
	public double sub(double first, double second) {
		double sum = first - second;
		return sum;
	}
	
	/**
	 * Mult - Multiplikation mellan två doubles.
	 * 
	 * @param first : det första numret som double.
	 * @param second : det andra numret som double.
	 * @return resultatet av multiplikationen.
	 */
	@Override
	public double mult(double first, double second) {
		double sum = first*second;
		return sum;
	}

	/**
	 * Div - Division mellan två doubles.
	 * 
	 * @param first : det första numret som double.
	 * @param second : det andra numret som double.
	 * @return resultatet av divisionen.
	 */
	@Override
	public double div(double first, double second) {
			double sum = first/second;
			return sum;
	}

	/**
	 * Modulus - Modulus mellan två doubles.
	 * 
	 * @param first : det första numret som double.
	 * @param second : det andra numret som double.
	 * @return resultatet av modulus dvs resten som kvarstår vid divisionen.
	 */
	@Override
	public double modulus(double first, double second) {
		double sum = first%second;
		return sum;
	}

	


}
