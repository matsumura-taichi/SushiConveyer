package jp.co.nichiwa_system;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Conveyer {

	private Map<String, Integer> netaMap = new LinkedHashMap<String, Integer>();
	private String[] netas;

	public String[] getFewNetaList() {
		netas = new String[netaMap.size()];

		Iterator<String> netaKeys = netaMap.keySet().iterator();
		for (int i = 0; netaKeys.hasNext(); i++) {
			String netaKey = (String) netaKeys.next();
			netas[i] = netaKey;
		}

		return netas;
	}

	public void add(String neta) {
		this.netaMap.put(neta, new Integer(1));
	}

}
