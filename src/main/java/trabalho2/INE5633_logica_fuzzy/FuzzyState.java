package trabalho2.INE5633_logica_fuzzy;

import khepera.managers.MovementManager.Direction;
import khepera.state.State;

public class FuzzyState extends State{

	@Override
	public void doWork() {
		 
		movementManager.move(2000, Direction.FORWARD);
		
		movementManager.rotate(90, Direction.RIGHT);
		
	}

	@Override
	protected void resetState() {
		// TODO Auto-generated method stub
		
	}

}
