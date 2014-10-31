package part3.step4;

import javax.servlet.http.HttpServletRequest;

/***
 * This class will hide the actual HttpServletRequest object
 * from our code and allow us to use it as our own Request object.
 * This technique allows for better portability of the code apart from
 * making unit testing easier.
 */
public class HttpRequestWrapper implements Request {
    private HttpServletRequest request;

    public HttpRequestWrapper(HttpServletRequest req) {
        this.request = req;
    }

    @Override
    public String getUserAgent() {
        return request.getHeader("User-Agent");
    }
}
