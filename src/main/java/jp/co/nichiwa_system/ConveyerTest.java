package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConveyerTest {

	@Test
	public void testFewNetaList1() {
		Conveyer conveyer = new Conveyer();
		String[] fewNetas = conveyer.getFewNetaList();
		assertEquals("まぐろ", fewNetas[0]);
	}


}
