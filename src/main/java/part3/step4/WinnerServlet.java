package part3.step4;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * In this version of the servlet we have moved all the logic from the servlet
 * out to a separate class called Winner. This new class will be testable.
 * We want to information from the request to our code however, we don't
 * want to create an untestable dependency with the HttpServletRequest class.
 */
public class WinnerServlet extends HttpServlet {

	private Winner winner = new Winner();

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.getWriter().write(winner.processVisit(new HttpRequestWrapper(req)));
	}
}