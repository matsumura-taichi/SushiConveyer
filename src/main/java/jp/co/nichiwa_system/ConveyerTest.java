package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ConveyerTest {

	@Test
	public void testFewNetaList1() {
		Conveyer conveyer = new Conveyer();
		conveyer.add("まぐろ");
		List<NetaCountVo> fewNetas = conveyer.getFewNetaList();

		assertEquals(1, fewNetas.size());
		NetaCountVo vo = (NetaCountVo)fewNetas.get(0);
		assertEquals("まぐろ", vo.name);
		assertEquals(1, vo.count);
	}

	@Test
	public void testFewNetaList2() {
		Conveyer conveyer = new Conveyer();
		conveyer.add("まぐろ");
		conveyer.add("とろ");
		List<NetaCountVo> fewNetas = conveyer.getFewNetaList();

		assertEquals(2, fewNetas.size());
		NetaCountVo vo = (NetaCountVo)fewNetas.get(0);
		assertEquals("まぐろ", vo.name);
		assertEquals(1, vo.count);
		vo = (NetaCountVo)fewNetas.get(1);
		assertEquals("とろ", vo.name);
		assertEquals(1, vo.count);
	}

	@Test
	public void testFewNetaList3() {
		Conveyer conveyer = new Conveyer();
		conveyer.add("まぐろ");
		conveyer.add("とろ");
		conveyer.add("いくら");
		String[] fewNetas = conveyer.getFewNetaListOld();

		assertEquals(3, fewNetas.length);
		assertEquals("まぐろ", fewNetas[0]);
		assertEquals("とろ", fewNetas[1]);
		assertEquals("いくら", fewNetas[2]);
	}

	@Test
	public void testFewNetaListMaguro5() {
		Conveyer conveyer = new Conveyer();
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("とろ");
		conveyer.add("いくら");
		String[] fewNetas = conveyer.getFewNetaListOld();

		assertEquals(3, fewNetas.length);
		assertEquals("まぐろ", fewNetas[0]);
		assertEquals("とろ", fewNetas[1]);
		assertEquals("いくら", fewNetas[2]);
	}

	@Test
	public void testFewNetaListMaguro6() {
		Conveyer conveyer = new Conveyer();
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("まぐろ");
		conveyer.add("とろ");
		conveyer.add("いくら");
		String[] fewNetas = conveyer.getFewNetaListOld();

		assertEquals(2, fewNetas.length);
		assertEquals("とろ", fewNetas[0]);
		assertEquals("いくら", fewNetas[1]);
	}

}
