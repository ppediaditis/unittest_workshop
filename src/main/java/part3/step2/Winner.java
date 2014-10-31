package part3.step2;


/***
 * This returns the number of visits. Every 10 visits announces
 * a winner and resets visits to 0. It has been broken out from the original
 * servlet request handler.
 *
 * By decoupling the servlet class from the inner functionality we want it to perform
 * we make it testable.
 *
 * Exercise 1: Create a set of unit tests for this class
 */
public class Winner {

	private static final String WINNER_MESSAGE = "Congratulations you are the winner!";

	private int visitCount = 0;

	public String processVisit() {
		++visitCount;
		if(visitCount % 10 == 0){
			return WINNER_MESSAGE;
		}else{
			return ""+ visitCount;
		}
	}
}
