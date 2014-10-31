package part2;

import java.util.Date;

public class TimestampDateParser implements DateParser {

    /***
     * Receives as input a UNIX timestamp
     * @param timestamp a string containing a unix timestamp
     * @return a java Date object with the date corresponding to the input timestamp.
     * @throws DateParserException if the date string does not represent a valid UNIX timestamp
     *
     * Exercise 1: Create a test case which tests a use of a valid timestamp. You can test any corner cases you can think of.
     *
     * Exercise 2: Create a test case which tests an invalid use of the method (throws an exception).
     *
     * Exercise 4: Create a setup step so you don't have to create a new TimestampDateParser for each test case.
     *             To achieve this make use a setup (before) action.
     *
     * Exercise 5: Change the timezone of your system and run your tests again. Will they pass?
     *
     * Exercise 6: Adapt your previous solution to take make the tests pass regardless of timezone.
     *             Use a test suit setup step to avoid repeating the same steps on each test case if it is not needed.
     *             Also remember to play nice an reset the timezone to what it was.
     *
     */
	@Override
	public Date parseDateString(String timestamp) throws DateParserException {
        try{
		    return new Date(new Long(timestamp));
        }catch (NumberFormatException e){
            throw new DateParserException();
        }
	}
}
