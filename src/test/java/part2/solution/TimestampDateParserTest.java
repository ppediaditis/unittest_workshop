package part2.solution;

import org.junit.Test;
import part2.DateParserException;
import part2.TimestampDateParser;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.Assert.assertEquals;

/***
 * Each test should be named so that it contains:
 * What it is testing (e.g. method name)
 * What the conditions of the test are (state of object and input arguments)
 * What the expected result is
 */
public class TimestampDateParserTest {

	@Test
	public void parseDateString_validTimestamp_dateCorrect() throws DateParserException {
		TimestampDateParser parser = new TimestampDateParser();
		Date result = parser.parseDateString("1386866400000");
		assertEquals("12/12/13 6:40 PM",new SimpleDateFormat().format(result));
	}

    /***
     * With unit testing we also have the ability thoroughly test our fail conditions
     * as in this example.
     * @throws DateParserException
     */
    @Test(expected = DateParserException.class)
    public void parseDateString_invalidTimestamp_throwsException() throws DateParserException {
        TimestampDateParser parser = new TimestampDateParser();
        Date result = parser.parseDateString("this is not a timestamp");
    }
}
