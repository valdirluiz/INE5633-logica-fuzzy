package trabalho2.INE5633_logica_fuzzy;

import khepera.AbstractController;

public class Controlador extends AbstractController {

	@Override
	protected void addBehaviours() {
		addBehaviour(new FuzzyBehaviour(0, sensorManager, movementManager));
		// addBehaviour(new MoveToLightBehaviour(2, sensorManager, movementManager));
		// addBehaviour(new CollectBehaviour(6, sensorManager, movementManager));
		// addBehaviour(new PlaceOnLightBehaviour(5, sensorManager, movementManager));

		// addBehaviour(new CollisionRecovery(0, sensorManager, movementManager));

	}

}
