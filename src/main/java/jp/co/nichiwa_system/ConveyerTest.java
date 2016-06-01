package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConveyerTest {

	@Test
	public void testFewNetaList1() {
		Conveyer conveyer = new Conveyer();
		conveyer.add("まぐろ");
		String[] fewNetas = conveyer.getFewNetaList();

		assertEquals(1, fewNetas.length);
		assertEquals("まぐろ", fewNetas[0]);
	}


}
