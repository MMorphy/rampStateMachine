package hr.proging.ramp.state;

import java.util.HashMap;
import java.util.Map;

public class Raised extends StateBase {

	static Map<String, StateBase> inputMap = null;

	public Raised() {
		super("raised", initMap());
	}

	public static Map<String, StateBase> initMap() {
		if (inputMap == null) {
			inputMap = new HashMap<String, StateBase>();
			inputMap.put("carjustexited", new Lowering());
			inputMap.put("lower", new Lowering());
			inputMap.put("notcarjustexited", new Raised());
			inputMap.put("nop", new Raised());
		}
		return inputMap;
	}

	public static void setInputMap(Map<String, StateBase> inputMap) {
		Raised.inputMap = inputMap;
	}
}
