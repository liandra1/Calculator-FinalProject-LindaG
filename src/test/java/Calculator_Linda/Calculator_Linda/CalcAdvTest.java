package Calculator_Linda.Calculator_Linda;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import junit.framework.TestCase;

public class CalcAdvTest {
	CalcAdv ca = new CalcAdv();
	double first;
	double oracle;
	Random r = new Random();

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
		}
	}

	@Test
	public void testSqa() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			oracle=Math.sqrt(first);

			assertEquals(ca.sqa(first), oracle, 0);
		}
		
		
	}

	@Test
	public void testX2() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			oracle=first*first;

			assertEquals(ca.x2(first), oracle, 0);
		}
	}

	@Test
	public void testSin() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble();
			oracle = Math.toRadians(first);
			oracle=Math.sin(oracle);

			assertEquals(ca.sin(first), oracle, 0);
		}
	}

	@Test
	public void testCos() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble();
			oracle = Math.toRadians(first);
			oracle=Math.cos(oracle);

			assertEquals(ca.cos(first), oracle, 0);
		}
	}

	@Test
	public void testTan() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble();
			oracle = Math.toRadians(first);
			oracle=Math.tan(oracle);

			assertEquals(ca.tan(first), oracle, 0);
		}
	}


}
