package jp.co.nichiwa_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Conveyer {

	private Map<String, Integer> netaMap = new LinkedHashMap<String, Integer>();

	public String[] getFewNetaList() {
		List<String> fewNetaList = new ArrayList<String>();

		Iterator<String> netaKeys = netaMap.keySet().iterator();
		for (int i = 0; netaKeys.hasNext(); i++) {
			String netaKey = (String) netaKeys.next();
			int count = ((Integer)netaMap.get(netaKey)).intValue();
			if(count <= 5) {
				fewNetaList.add(netaKey);
			}
		}

		return (String[]) fewNetaList.toArray(new String[0]);
	}

	public void add(String neta) {
		if(netaMap.containsKey(neta)) {
			int count = ((Integer)netaMap.get(neta)).intValue();
			count++;
			netaMap.put(neta, new Integer(count));
		} else {
			this.netaMap.put(neta, new Integer(1));
		}
	}

}
