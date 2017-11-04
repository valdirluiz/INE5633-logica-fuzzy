package trabalho2.INE5633_logica_fuzzy;

import net.sourceforge.jFuzzyLogic.FIS;

/**
 * Hello world!
 *
 */
public class App {
	private static final String FILENAME = "robot-fuzzy.fcl";

	public static void main(String[] args) {

		System.out.println("Iniciando sistema!");
		FIS fis = getFIS();

		fis.setVariable("sensor_1", 0.9);
		fis.setVariable("sensor_2", 0.9);
		fis.setVariable("sensor_3", 0.2);

		fis.evaluate();

		double offset = fis.getVariable("volante").defuzzify();
		System.out.println(offset);
	}

	public static FIS getFIS() {
		FIS fis = FIS.load(FILENAME, true);
		return fis;
	}
}
