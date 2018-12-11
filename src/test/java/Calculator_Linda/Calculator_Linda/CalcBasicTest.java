package Calculator_Linda.Calculator_Linda;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import junit.framework.TestCase;

public class CalcBasicTest {
CalcBasic cb = new CalcBasic();
double first;
double second;
double oracle;
Random r = new Random();

	@Test
	public void testAdd() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			oracle=first+second;

			assertEquals(cb.add(first, second), oracle, 0);
		}
	}
	
	@Test
	public void testSub() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			oracle=first-second;

			assertEquals(cb.sub(first, second), oracle, 0);
		}
	}

	@Test
	public void testMult() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			oracle=first*second;

			assertEquals(cb.mult(first, second), oracle, 0);
		}
	}
	
	@Test
	public void testDiv() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			oracle=first/second;

			assertEquals(cb.div(first, second), oracle, 0);
		}
	}

	@Test
	public void testModulus() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			oracle=first%second;

			assertEquals(cb.modulus(first, second), oracle, 0);
		}
	}
}
