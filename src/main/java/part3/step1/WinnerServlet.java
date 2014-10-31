package part3.step1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/***
 * The servlet returns the number of visits. Every 10 visits announces
 * a winner.
 *
 * Servlets can be run by being deployed on a java application server (e.g. tomcat).
 *
 * Exercise 1: Can you think of a simple way of testing this servlet using unit tests?
 */
public class WinnerServlet extends HttpServlet {

	private int hitCount = 0;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		if(++hitCount % 10 == 0){
			out.println("Congratulations you are the winner!");
		}else{
			out.println(""+hitCount);
		}

	}
}