package hr.proging.ramp.state;

import java.util.HashMap;
import java.util.Map;

public class Raising extends StateBase {

	static Map<String, StateBase> inputMap = null;

	public Raising() {
		super("raising", initMap());
	}

	public static Map<String, StateBase> initMap() {
		if (inputMap == null) {
			inputMap = new HashMap<String, StateBase>();
			inputMap.put("top", new Raised());
			inputMap.put("nop", new Raised());
			inputMap.put("nottop", new Raising());
			inputMap.put("raise", new Raising());
		}
		return inputMap;
	}

	public static void setInputMap(Map<String, StateBase> inputMap) {
		Raising.inputMap = inputMap;
	}

}
