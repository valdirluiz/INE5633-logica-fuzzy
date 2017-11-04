package trabalho2.INE5633_logica_fuzzy;

import static spark.Spark.post;

import com.google.gson.Gson;

import net.sourceforge.jFuzzyLogic.FIS;

public class RobotResource {

	private static final String API_CONTEXT = "/api/v1";
	private static final String FILENAME = "robot-fuzzy.fcl";

	public RobotResource() {
		setupEndpoints();
	}

	private void setupEndpoints() {

		post(API_CONTEXT + "/robot", "application/json", (request, response) -> {
			Robot robot = new Gson().fromJson(request.body(), Robot.class);

			FIS fis = getFIS();
			fis.setVariable("sensor_1", robot.sensor1);
			fis.setVariable("sensor_2", robot.sensor2);
			fis.setVariable("sensor_3", robot.sensor3);

			fis.evaluate();

			double motor = fis.getVariable("volante").defuzzify();
			robot.motor1 = motor;
			robot.motor2 = motor;

			return robot;
		}, new JsonTransformer());

	}

	public static FIS getFIS() {
		FIS fis = FIS.load(FILENAME, true);
		return fis;
	}

}