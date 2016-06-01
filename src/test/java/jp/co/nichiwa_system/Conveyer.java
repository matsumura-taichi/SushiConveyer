package jp.co.nichiwa_system;

public class Conveyer {

	private  String[] netas;

	public String[] getFewNetaList() {
		return netas;
	}

	public void add(String neta) {
		netas = new String[1];
		netas[0] = neta;
	}

}
