package neuland.examples.javascript;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class InvokeDirect {

	// maven packages resources into root
	// private static final String SCRIPT1 = "src/main/resources/script.js";
	private static final String SCRIPT1 = "script.js";

	public void invoke() throws Exception {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("Nashorn");

		readScript(engine, SCRIPT1);

		Invocable invocable = (Invocable) engine;

		invocable.invokeFunction("fun", "hans");

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
		new InvokeDirect().invoke();
	}

}
