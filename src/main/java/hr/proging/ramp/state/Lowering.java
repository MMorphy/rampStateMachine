package hr.proging.ramp.state;

import java.util.HashMap;
import java.util.Map;

public class Lowering extends StateBase {

	static Map<String, StateBase> inputMap = null;

	public Lowering() {
		super("lowering", initMap());
	}

	public static Map<String, StateBase> initMap() {
		if (inputMap == null) {
			inputMap = new HashMap<String, StateBase>();
			inputMap.put("notbottom", new Lowering());
			inputMap.put("lower", new Lowering());
			inputMap.put("bottom", new Waiting());
			inputMap.put("nop", new Waiting());
		}
		return inputMap;
	}

	public static void setInputMap(Map<String, StateBase> inputMap) {
		Lowering.inputMap = inputMap;
	}
	

}
