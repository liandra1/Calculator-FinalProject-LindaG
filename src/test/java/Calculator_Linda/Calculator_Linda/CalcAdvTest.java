package Calculator_Linda.Calculator_Linda;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalcAdvTest {
	CalcAdv ca = new CalcAdv();
	public static final Logger LOG = Logger.getLogger(CalcAdv.class.getName());
	double first;
	double second;
	double oracle;
	double oracle1;
	Random r = new Random();

	
	@Test
	public void testPi() {
		for (int i = 0; i < 50; i++) {	
			
			oracle=Math.PI;

			assertEquals(ca.pi(), oracle, 0);
			LOG.info("Testar pi-metoden. Returnerar Pi "+oracle);
		}
	}
	
	@Test
	public void testTenX() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			double tio=first;
			
			for (int j = 0; j < first; j++) {
				tio = tio * 10;
			}
			oracle=tio;

			assertEquals(ca.tenX(first), oracle, 0);
			LOG.info("Testar tenX-metoden. Tio upphöjt i "+first+" = "+oracle);
		}
	}

	@Test
	public void testSqa() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*(-6);
			oracle=Math.sqrt(first);
			oracle1=Math.sqrt(second);

			assertEquals(ca.sqa(first), oracle, 0);
			LOG.info("Testar sqa-metoden. Roten ur "+first+" = "+oracle);
			
			assertEquals(ca.sqa(second), oracle1, 0);
			LOG.info("Testar sqa-metoden. Roten ur "+second+" = "+oracle1);
		}
		
		
	}

	@Test
	public void testX2() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*(-6);
			oracle=first*first;
			oracle1=second*second;

			assertEquals(ca.x2(first), oracle, 0);
			LOG.info("Testar x2-metoden. "+first+" upphöjt i två = "+oracle);
			
			assertEquals(ca.x2(second), oracle1, 0);
			LOG.info("Testar x2-metoden. "+second+" upphöjt i två = "+oracle1);
		}
	}

	@Test
	public void testSin() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble();
			second=r.nextDouble()*(-1);
			
			oracle = Math.toRadians(first);
			oracle=Math.sin(oracle);
			
			oracle1 =Math.toRadians(second);
			oracle1 =Math.sin(oracle1);

			assertEquals(ca.sin(first), oracle, 0);
			LOG.info("Testar sin-metoden. Sinus "+first+" = "+oracle);
			
			assertEquals(ca.sin(second), oracle1, 0);
			LOG.info("Testar sin-metoden. Sinus "+second+" = "+oracle1);
		}
	}

	@Test
	public void testCos() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble();
			second=r.nextDouble()*(-1);
			
			oracle = Math.toRadians(first);
			oracle=Math.cos(oracle);
			
			oracle1 =Math.toRadians(second);
			oracle1 =Math.cos(oracle1);

			assertEquals(ca.cos(first), oracle, 0);
			LOG.info("Testar cos-metoden. Cosinus "+first+" = "+oracle);
			
			assertEquals(ca.cos(second), oracle1, 0);
			LOG.info("Testar cos-metoden. Cosinus "+second+" = "+oracle1);
		}
	}

	@Test
	public void testTan() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble();
			second=r.nextDouble()*(-1);
			
			oracle = Math.toRadians(first);
			oracle=Math.tan(oracle);
			
			oracle1 =Math.toRadians(second);
			oracle1 =Math.tan(oracle1);

			assertEquals(ca.tan(first), oracle, 0);
			LOG.info("Testar tan-metoden. Tangens "+first+" = "+oracle);
			
			assertEquals(ca.tan(second), oracle1, 0);
			LOG.info("Testar tan-metoden. Tangens "+second+" = "+oracle1);
		}
	}


}