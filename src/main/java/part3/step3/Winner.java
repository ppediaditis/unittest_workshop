package part3.step3;

import java.io.IOException;

/**
 * The servlet returns the number of visits. Every 10 visits announces
 * a winner.
 *
 * We have refactored most of the code into other classes (unnecessarily)
 * to show that the unit test we had written in step 2 still works in step3.
 *
 * We have a trivial class that counts the visits and a trivial class that
 * decides if a visit should be considered a winner or not.
 *
 * Exercise 1:
 *
 * Use the test class created in step 2 to test this version of
 * the Winner class (simply change the import/package).
 *
 * Do all the test cases pass as expected?
 *
 * What would we do if the test was not supposed to fail?
 *
 * What would we do if the new behaviour is intentional?
 *
 */
public class Winner {

	private static final String WINNER_MESSAGE = "Congratulations you are the winner!";
	private static final int DEFAULT_WINNER_FREQUENCY = 10;

	private VisitCounter counter;
	private WinnerChooser chooser;

	public Winner() {
		counter = new VisitCounter();
		chooser = new WinnerChooser(DEFAULT_WINNER_FREQUENCY);
	}

	public String processVisit() throws IOException {
		counter.addVisit();
		return chooser.isWinner(counter.getVisitCount()) ? WINNER_MESSAGE : ""+counter.getVisitCount();
	}
}
