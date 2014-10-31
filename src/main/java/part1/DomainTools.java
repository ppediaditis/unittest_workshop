package part1;

public class DomainTools {

	/***
	 * This Function will remove top level domain info and subdomains from a domain
	 * string and return what is left.
	 * @param domain
	 * @return second level domain info
     *
     * Exercise 1:
     * Test the correctness of this utility class using a traditional test program.
     *
     * Exercise 2:
     * Test the correctness using a unit testing framework (in our case JUnit).
     *
	 */
	public static String extractDomainBrand(String domain){
		String[] parts = domain.split("\\.");
		return parts[parts.length-2];
	}
}
