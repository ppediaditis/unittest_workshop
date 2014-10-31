package part2.solution;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import part2.DateParser;
import part2.DateParserException;
import part2.TimestampDateParser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static junit.framework.Assert.assertEquals;


/***
 * Some setup code does not need to be setup before every individual test. If something can
 * be used consistently by all tests without altering it in any way then that can probably
 * be moved to the Test Suite setup.
 */
public class TimestampDateParserWithSuiteSetUpTest {

    private DateParser parser;
    private static TimeZone oldTimeZone;

    /***
     * In Junit the Test Suite setup methods are annotated with BeforeClass.
     * In this case we want to make sure our environment has a consistent timezone
     * since running the tests in different countries should not yield different results.
     */
    @BeforeClass
    public static void setupTimeZoneEnvironment(){
        oldTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("EET"));
    }

    @AfterClass
    public static void restoreTimeZoneEnvironment(){
        TimeZone.setDefault(oldTimeZone);
    }

    /***
     * In Junit the per test setup methods are annotated with Before
     */
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
