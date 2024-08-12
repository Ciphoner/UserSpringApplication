package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	public int sum(int a, int b) {
		return a + b;
	}

	@Test
	void shouldIntTestReturnTwoNumber() {
		int a = 2;
		int b = 3;

		assertEquals(5, sum(a, b));
	}

	@Test
	void testDivisionIfbEqualZero() {
		double a = 4;
		double b = 0;
		ArithmeticException e = assertThrows(ArithmeticException.class, () -> division(a, b));
		assertEquals("b est nulle", e.getMessage());

	}

	private double division(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("b est nulle");
		}
		return (a / b);
	}
}
