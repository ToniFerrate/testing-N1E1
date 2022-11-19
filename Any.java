package testingN1E1;

import java.util.ArrayList;


public class Any {
	private static ArrayList<String> llistaMesos = new ArrayList<String>();
	
	static {
		llistaMesos.add("gener");
		llistaMesos.add("febrer");
		llistaMesos.add("març");
		llistaMesos.add("abril");
		llistaMesos.add("maig");
		llistaMesos.add("juny");
		llistaMesos.add("juliol");
		llistaMesos.add("agost");
		llistaMesos.add("setembre");
		llistaMesos.add("octubre");
		llistaMesos.add("novembre");
		llistaMesos.add("desembre");
	}

	public static ArrayList<String> getLlistaMesos() {
		return llistaMesos;
	}
	
}
