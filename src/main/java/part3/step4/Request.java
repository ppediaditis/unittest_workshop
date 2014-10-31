package part3.step4;

/***
 * This interface constitutes the vocabulary with which our class will use
 * request information. Concrete implementations (wrappers) will be used in the
 * actual product where as stub implementations will be used by unit tests.
 */
public interface Request {

    public String getUserAgent();
}
