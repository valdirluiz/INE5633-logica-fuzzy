package trabalho2.INE5633_logica_fuzzy;

import khepera.AbstractController;
import khepera.behaviour.CollectBehaviour;
import khepera.behaviour.CollisionRecovery;
import khepera.behaviour.ExploreBehaviour;
import khepera.behaviour.MoveToLightBehaviour;
import khepera.behaviour.PlaceOnLightBehaviour;

public class Controlador extends AbstractController {

	 

	@Override
	protected void addBehaviours() {
		//addBehaviour(new ExploreBehaviour(0, sensorManager, movementManager));
		//addBehaviour(new MoveToLightBehaviour(2, sensorManager, movementManager));
		//addBehaviour(new CollectBehaviour(6, sensorManager, movementManager));
		//addBehaviour(new PlaceOnLightBehaviour(5, sensorManager, movementManager));

	  addBehaviour(new CollisionRecovery(0, sensorManager, movementManager));

	}

}
