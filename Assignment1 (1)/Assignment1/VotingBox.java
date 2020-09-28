import stanford.karel.*;


/*
 * This code runs up until it encounters a beeper. There is a problem with my logic for 
 * the noBeeper() and possibly checkColumn().
 * 
 * */

public class VotingBox extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			
			if (noBeepersPresent()) {
				checkColumn();
			}
			
			move();
			
			}
		}
		
		// Check's for beepers and implements fixColumns(); to remove them.
	
		private void checkColumn() {
			turnRight();
			fixColumns();
			fixColumns();
			turnLeft();
		}
		
		// Where beepers exist on the corners and not the center, this removes those beepers.
		private void fixColumns() {
			move();
			
			while (beepersPresent()) {
				pickBeeper();
			}
		
				turnAround();
				move();
		}
	}


