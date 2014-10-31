package part3.step2;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

/***
 * Now that the bulk of the servlet code has been moved out of the actual servlet handler
 * we can actually unit test it.
 */
public class WinnerTest {

	@Test
	public void buildResult_hitNineTimes_ReturnsNine() throws IOException {
		Winner winner = new Winner();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		String result = winner.processVisit();
		assertEquals("9", result);
	}

	@Test
	public void buildResult_hitTenTimes_GivesWinnerMessage() throws IOException {
		Winner winner = new Winner();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		String result = winner.processVisit();
		assertEquals("Congratulations you are the winner!", result);
	}

	@Test
	public void buildResult_hitElevenTimes_ReturnsEleven() throws IOException {
		Winner winner = new Winner();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		winner.processVisit();
		String result = winner.processVisit();
		assertEquals("11", result);
	}
}
