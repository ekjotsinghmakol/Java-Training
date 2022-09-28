import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.calc.dao.CalcDao;

public class TestCalc {

	CalcDao obj = new CalcDao();

	@Test
	public void testAddition() {
		assertEquals(5, CalcDao.addition(2, 3));
	}

	@Test
	public void testSubtraction() {
		assertEquals(3, CalcDao.substraction(5, 2));
	}

	@Test
	public void testDivision() {
		assertEquals(2.5, CalcDao.division(5, 2), 0.0);
	}

	@Test
	public void testMultiplication() {
	assertEquals(15, CalcDao.multiplication(5, 3));
	}

}
