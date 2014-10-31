package part2;

import java.util.Date;

public interface DateParser {
	public Date parseDateString(String date) throws DateParserException;
}
