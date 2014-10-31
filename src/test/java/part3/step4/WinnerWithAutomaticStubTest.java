package part3.step4;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/***
 * The tiresome task of implementing stubs for interfaces can be completely automated
 * with the use of a mocking framework (in this case Mockito). Mocking frameworks
 * automatically implement any interface we desire. We can then specify how we want the
 * stub to behave when used by our code.
 */
public class WinnerWithAutomaticStubTest {

	@Test
	public void processVisit_visitFourTimesWithAndroid_Returns4() throws IOException {
		Winner winner = new Winner();
        Request request = mock(Request.class);
        when(request.getUserAgent()).thenReturn("Android");
		winner.processVisit(request);
		winner.processVisit(request);
		winner.processVisit(request);
		String result = winner.processVisit(request);
		assertEquals("4", result);
	}

    @Test
    public void processVisit_visitTwoTimesWithAndroidTwoWithIphone_Returns2() throws IOException {
        Winner winner = new Winner();
        Request requestA = mock(Request.class);
        when(requestA.getUserAgent()).thenReturn("Android");
        Request requestB = mock(Request.class);
        when(requestB.getUserAgent()).thenReturn("iPhone");
        winner.processVisit(requestA);
        winner.processVisit(requestB);
        winner.processVisit(requestA);
        String result = winner.processVisit(requestB);
        assertEquals("2", result);
    }

    @Test
    public void processVisit_visitTwoTimesWithAndroidTwoWithIphone_Returns2_oneStubOnly() throws IOException {
        Winner winner = new Winner();
        Request request = mock(Request.class);
        when(request.getUserAgent()).thenReturn("Android","iPhone","Android","iPhone","Android","iPhone");
        winner.processVisit(request);
        winner.processVisit(request);
        winner.processVisit(request);
        String result = winner.processVisit(request);
        assertEquals("2", result);
    }

}
