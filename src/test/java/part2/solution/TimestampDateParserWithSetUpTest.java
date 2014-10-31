package part2.solution;

import org.junit.Before;
import org.junit.Test;
import part2.DateParser;
import part2.DateParserException;
import part2.TimestampDateParser;

import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.Assert.assertEquals;

/***
 * Using Setup and teardown methods we can factor out tasks that need to be repeated
 * for every test. In this example we move the initialization of the parser class
 * to a Setup method. This method will automatically be invoked before every test.
 */
public class TimestampDateParserWithSetUpTest {

    private DateParser parser;

    @Before
    public void setupDateParser(){
        parser = new TimestampDateParser();
    }

	@Test
	public void parseDateString_validTimestamp_dateCorrect() throws DateParserException {
		Date result = parser.parseDateString("1386866400000");
		assertEquals("12/12/13 6:40 PM",new SimpleDateFormat().format(result));
	}

    @Test
    public void parseDateString_timestampFromThe70s_dateCorrect() throws DateParserException {
        Date result = parser.parseDateString("138686640000");
        assertEquals("5/25/74 6:04 AM",new SimpleDateFormat().format(result));
    }

    @Test(expected = DateParserException.class)
    public void parseDateString_invalidTimestamp_throwsException() throws DateParserException {
        Date result = parser.parseDateString("this is not a timestamp");
    }
}
