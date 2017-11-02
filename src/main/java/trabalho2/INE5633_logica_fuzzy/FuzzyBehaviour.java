package trabalho2.INE5633_logica_fuzzy;

import khepera.behaviour.Behaviour;
import khepera.managers.MovementManager;
import khepera.managers.SensorManager;
 
public class FuzzyBehaviour extends Behaviour{

	public FuzzyBehaviour(int priority, SensorManager sensorManager,
			MovementManager movementManager) {
		super(priority, sensorManager, movementManager);
		setName("FuzzyBehaviour");
		addState(new FuzzyState());
		 
	}

	@Override
	public boolean shouldRun() {
		return true;
	}
	
}
