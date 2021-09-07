package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculationTest {

	@Test
	public void testAdd() {
		calculation cc=new calculation();
		int result=cc.add(10, 20);
		assertEquals(30,result);
	}

}
