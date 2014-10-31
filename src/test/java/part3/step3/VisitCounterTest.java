package part3.step3;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/***
 * Even in the most trivial of cases such as this counter class there are boundary values
 * we can test that would be difficult to test with real use of the application.
 */
public class VisitCounterTest {

    @Test
    public void incrementCount_fromNew_getReturnsOne(){
        VisitCounter counter = new VisitCounter();
        counter.addVisit();
        assertEquals(1,counter.getVisitCount());
    }

    /***
     * We can be certain of the behaviour of our software in weird cases such as
     * integer wrap around.
     */
    @Test
    @Ignore
    public void incrementCount_fromMaxInt_getReturnsZero(){
        VisitCounter counter = new VisitCounter();
        counter.setVisitCount(Integer.MAX_VALUE);
        counter.addVisit();
        assertEquals(0,counter.getVisitCount());
    }
}
