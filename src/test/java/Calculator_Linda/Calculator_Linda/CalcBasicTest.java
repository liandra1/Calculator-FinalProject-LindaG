package Calculator_Linda.Calculator_Linda;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import junit.framework.TestCase;

public class CalcBasicTest {
CalcBasic cb = new CalcBasic();
public static final Logger LOG = Logger.getLogger(CalcBasic.class.getName());
double first;
double second;
double third;
double oracle;
double oracle1;
double oracle2;
double oracle3;
Random r = new Random();

	@Test
	public void testAdd() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			third=r.nextDouble()*(-6);
			oracle=first+second;
			oracle1=first+third;

			assertEquals(cb.add(first, second), oracle, 0);
			LOG.info("Testar add-metoden. Adderar "+first+" + "+second+" = "+oracle);
			
			assertEquals(cb.add(first, 0),first, 0);
			LOG.info("Testar add-metoden. Adderar "+first+" + 0 = "+first);
			
			assertEquals(cb.add(first, third), oracle1, 0);
			LOG.info("Testar add-metoden. Adderar "+first+" + "+third+" = "+oracle1);
		}
	}
	
	@Test
	public void testSub() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			third=r.nextDouble()*(-6);
			oracle=first-second;
			oracle1=first-third;
			oracle2=third-first;

			assertEquals(cb.sub(first, second), oracle, 0);
			LOG.info("Testar sub-metoden. Subtraherar "+first+" - "+second+" = "+oracle);
			
			assertEquals(cb.sub(first, 0),first, 0);
			LOG.info("Testar sub-metoden. Subtraherar "+first+" - 0 = "+first);
			
			assertEquals(cb.sub(first, third), oracle1, 0);
			LOG.info("Testar sub-metoden. Subtraherar "+first+" - "+third+" = "+oracle1);
			
			assertEquals(cb.sub(third, first), oracle2, 0);
			LOG.info("Testar sub-metoden. Subtraherar "+third+" - "+first+" = "+oracle2);
		}
	}

	@Test
	public void testMult() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			third=r.nextDouble()*(-6);
			oracle=first*second;
			oracle1=first*0;
			oracle2=first*third;

			assertEquals(cb.mult(first, second), oracle, 0);
			LOG.info("Testar mult-metoden. Multiplicerar "+first+" * "+second+" = "+oracle);
			
			assertEquals(cb.mult(first, 0), oracle1, 0);
			LOG.info("Testar mult-metoden. Multiplicerar "+first+" * 0 = "+oracle1);
			
			assertEquals(cb.mult(first, third), oracle2, 0);
			LOG.info("Testar mult-metoden. Multiplicerar "+first+" * "+third+" = "+oracle2);
		}
	}
	
	@Test
	public void testDiv() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			third=r.nextDouble()*(-6);
			oracle=first/second;
			oracle1=first/0;
			oracle2=0/second;
			oracle3=first/third;

			assertEquals(cb.div(first, second), oracle, 0);
			LOG.info("Testar div-metoden. Dividerar "+first+" / "+second+" = "+oracle);
			
			assertEquals(cb.div(first, 0), oracle1, 0);
			LOG.info("Testar div-metoden. Dividerar "+first+" / 0 = "+oracle1);
			
			assertEquals(cb.div(0, second), oracle2, 0);
			LOG.info("Testar div-metoden. Dividerar 0 / "+second+" = "+oracle2);
			
			assertEquals(cb.div(first, third), oracle3, 0);
			LOG.info("Testar div-metoden. Dividerar "+first+" / "+second+" = "+oracle3);
		}
	}

	@Test
	public void testModulus() {
		for (int i = 0; i < 50; i++) {	
			first=r.nextDouble()*5;
			second=r.nextDouble()*6;
			third=r.nextDouble()*(-6);
			oracle=first%second;
			oracle1=first%0;
			oracle2=0%first;
			oracle3=third%first;

			assertEquals(cb.modulus(first, second), oracle, 0);
			LOG.info("Testar modulus-metoden. Modulus av "+first+" % "+second+" = "+oracle);
			
			assertEquals(cb.modulus(first, 0), oracle1, 0);
			LOG.info("Testar modulus-metoden. Modulus av "+first+" % 0 = "+oracle1);
			
			assertEquals(cb.modulus(0, first), oracle2, 0);
			LOG.info("Testar modulus-metoden. Modulus av 0 % "+first+" = "+oracle2);
			
			assertEquals(cb.modulus(third, first), oracle3, 0);
			LOG.info("Testar modulus-metoden. Modulus av "+third+" % "+first+" = "+oracle3);
		}
	}
	
}
