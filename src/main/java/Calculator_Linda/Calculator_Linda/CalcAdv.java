package Calculator_Linda.Calculator_Linda;

public class CalcAdv implements ICalcAdv {

	@Override
	public double pi() {
		return Math.PI;
	}

	@Override
	public double tenX(double tio) {
		double minne = tio;
		for (int i = 0; i < minne; i++) {
			tio = tio * 10;
		}
		return tio;
	}

	@Override
	public double sqa(double x) {
		return Math.sqrt(x);
	}

	@Override
	public double x2(double x) {
		return x*x;
	}

	@Override
	public double sin(double x) {
		x = Math.toRadians(x);
		return Math.sin(x);
	}

	@Override
	public double cos(double x) {
		x = Math.toRadians(x);
		return Math.cos(x);
	}

	@Override
	public double tan(double x) {
		x = Math.toRadians(x);
		return Math.tan(x);
	}


}
