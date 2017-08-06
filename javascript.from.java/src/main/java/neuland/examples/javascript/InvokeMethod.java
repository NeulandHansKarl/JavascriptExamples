package neuland.examples.javascript;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class InvokeMethod {

	// private static final String SCRIPT1 = "src/main/resources/object1.js";
	// private static final String SCRIPT2 = "src/main/resources/object2.js";

	private static final String SCRIPT1 = "object1.js";
	private static final String SCRIPT2 = "object2.js";

	public void invoke() throws Exception {

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("Nashorn");

		readScript(engine, SCRIPT1);
		readScript(engine, SCRIPT2);
		Invocable invocable = (Invocable) engine;
		Object obj2 = engine.get("obj2");

		invocable.invokeMethod(obj2, "fun2", "hans");
	}

	// private void readScript(ScriptEngine engine, String fileName) throws
	// Exception {
	// try (FileReader reader = new FileReader(fileName);) {
	// engine.eval(reader);
	// }
	// }
	private void readScript(ScriptEngine engine, String fileName) throws Exception {

		try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)) {
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
				engine.eval(reader);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new InvokeMethod().invoke();
	}
}
