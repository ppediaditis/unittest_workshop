package part3.step1;

import org.junit.Test;

public class WinnerServletTest {

	@Test
	public void service_attempttotest_needInputOutput(){
		//Instantiating the servlet also instantiates a ton of code from the
		//parent class which we are not aware of, cannot control and do not want to test.
		WinnerServlet servlet = new WinnerServlet();

		//We don't know how to prepare the arguments required to invoke service().
		//servlet.service(???);

		//It would be better if we broke our functionality outside the servlet to make
		//it testable
	}
}
