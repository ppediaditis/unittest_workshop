package part3.step4;

import java.io.IOException;

/**
 * The servlet returns the number of visits. Every 10 visits announces
 * a winner and resets visits to 0.
 *
 * This revision of the application announces winners based on their user agent.
 * We want to consume this information from the request object and in future iterations
 * we might require other information as well.
 *
 * However we do not want to create a strong
 * dependency between our code and the java HttpRequest object. Otherwise, we would
 * not be able to write unit tests for our code as we would have to prepare such
 * HttpRequest objects whose state we may not have control over. Additionally,
 * if at a later time we decided to replace the underlying http server framework
 * used we would have to rewrite our implementation.
 *
 * By creating an interface that captures the information we need from the request
 * and creating an implementation of that interface that wraps the real HttpRequest
 * we decouple our code from the framework used and make the code testable.
 *
 * Exercise 1: Create a unit test to test the functionality of the class using a
 * custom implementation of the Request interface.
 *
 * Exercise 2: Use a mocking framework (mockito) to automatically stub implementations
 * of the request interface where needed.
 *
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

    /***
     * This method doesn't care if the request is a real request from the request handler
     * or a fake request we have created for testing purposes, and that is how it should be!
     */
	public String processVisit(Request request) throws IOException {
        String userAgent = request.getUserAgent();
		counter.addVisit(userAgent);
        int visitCount = counter.getVisitCount(userAgent);
		return chooser.isWinner(visitCount) ? WINNER_MESSAGE : ""+visitCount;
	}
}
