package part3.step4;

import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

/***
 * Now that the Request information has been abstracted out into a Request interface we
 * can create our own stub implementation of the interface to use in our tests.
 */
public class WinnerWithManualStubTest {

    /***
     * In real live our stubs will have to implement many more methods (as empty methods)
     * even if our code will not actually invoke them. This can be a barrier to creating
     * unit tests.
     */
    public class StubRequestImpl implements Request{

        private String userAgent;

        @Override
        public String getUserAgent() {
            return userAgent;
        }

        public void setUserAgent(String userAgent){
            this.userAgent = userAgent;
        }
    }

    /***
     * In our test code we make use of our stub implementation instead of the concrete class
     * used by the actual application.
     */
	@Test
	public void processVisit_visitFourTimesWithAndroid_Returns4() throws IOException {
		Winner winner = new Winner();
        StubRequestImpl request = new StubRequestImpl();
        request.setUserAgent("Android");
		winner.processVisit(request);
		winner.processVisit(request);
		winner.processVisit(request);
		String result = winner.processVisit(request);
		assertEquals("4", result);
	}

}
