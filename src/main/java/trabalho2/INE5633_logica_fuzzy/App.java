package trabalho2.INE5633_logica_fuzzy;

import java.awt.Dimension;
import java.awt.Toolkit;

import edu.wsu.KheperaSimulator.KSFrame;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 * Hello world!
 *
 */
public class App {
	private static final String FILENAME = "robot-fuzzy.fcl";

	public static void main(String[] args) {

		KSFrame frame = new KSFrame("Apresentação");

		frame.pack();

		// Center the application
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = frame.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		frame.setVisible(true);
		
		 
		
		System.out.println("Iniciando sistema!");
		FIS fis = FIS.load(FILENAME, true);

		System.out.println(fis);
	}
}
