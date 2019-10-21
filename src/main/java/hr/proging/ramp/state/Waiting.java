package hr.proging.ramp.state;

import java.util.HashMap;
import java.util.Map;

public class Waiting extends StateBase {

	static Map<String, StateBase> inputMap = null;

	public Waiting() {
		super("waiting", initMap());
	}

	public static Map<String, StateBase> initMap() {
		if (inputMap == null) {
			inputMap = new HashMap<String, StateBase>();
			inputMap.put("raise", new Raising());
			inputMap.put("caratgate", new Raising());
			inputMap.put("notacaratgate", new Waiting());
			inputMap.put("nop", new Waiting());
		}
		return inputMap;
	}

	public void setInputMap(Map<String, StateBase> inputMap) {
		this.inputMap = inputMap;
	}

}
