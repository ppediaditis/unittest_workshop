package part3.step3;

import part3.step2.Winner;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class WinnerTest {

	@Test
	public void buildResult_hitNineTimes_ReturnsNine() throws IOException {
		part3.step2.Winner winner = new part3.step2.Winner();
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
	public void buildResult_hitTenTimes_GivesWinnerMessage() throws IOException {
		part3.step2.Winner winner = new part3.step2.Winner();
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
		part3.step2.Winner winner = new Winner();
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
