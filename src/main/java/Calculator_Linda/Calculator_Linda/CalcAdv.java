package Calculator_Linda.Calculator_Linda;
/**
 * 
 * Klass CalcAdv (Kalkylator Avancerad)
 * Implementation av den Avancerade delen av Kalkylatorn
 * Metoderna använder en double parameter och returnerar en double.
 * 
 * 
 * @author linda
 * @version 1.0
 */
public class CalcAdv implements ICalcAdv {
	
	/**
	 * PI - Funktionen returnerar värdet av PI.
	 * 
	 * @param pi : returnerar Pi som en double.
	 * @return värdet av Pi.
	 */
	
	@Override
	public double pi() {
		return Math.PI;
	}
	
	/**
	 * Tio upphöjt i X - Funktionen returnerar värdet av tio upphöjt i X.
	 * 
	 * @param X : det första värdet (X) upphöjt i 10 som en double.
	 * @return resultatet av tio upphöjt i X.
	 */
	@Override
	public double tenX(double tio) {
		double minne = tio;
		for (int i = 0; i < minne; i++) {
			tio = tio * 10;
		}
		return tio;
	}
	
	/**
	 * Roten ur X - Funktionen returnerar värdet roten ur X.
	 * 
	 * @param X : roten ur det första värdet som en double.
	 * @return resultatet av roten ur X.
	 */
	@Override
	public double sqa(double x) {
		return Math.sqrt(x);
	}
	
	/**
	 * X upphöjt i två - Funktionen returnerar värdet av X upphöjt i två.
	 * 
	 * @param X : det första värdet upphöjt i två som en double.
	 * @return resultatet av X upphöjt i två.
	 */
	@Override
	public double x2(double x) {
		return x*x;
	}

	/**
	 * Sinus - Funktionen returnerar värdet Sinus.
	 * 
	 * @param X : gör om värdet av X till radians därefter vidare till Sinus-värdet i en double.
	 * @return Sinus-värdet.
	 */
	@Override
	public double sin(double x) {
		x = Math.toRadians(x);
		return Math.sin(x);
	}
	
	/**
	 * Cosinus - Funktionen returnerar värdet Cosinus.
	 * 
	 * @param X : gör om värdet av X till radians därefter vidare till Cosinus-värdet i en double.
	 * @return Cosinus-värdet.
	 */
	@Override
	public double cos(double x) {
		x = Math.toRadians(x);
		return Math.cos(x);
	}

	/**
	 * Tangens - Funktionen returnerar värdet Tangens.
	 * 
	 * @param X : gör om värdet av X till radians därefter vidare till Tangens-värdet i en double.
	 * @return Tangens-värdet.
	 */
	@Override
	public double tan(double x) {
		x = Math.toRadians(x);
		return Math.tan(x);
	}


}
