package part1.solution;

import org.junit.Test;
import part1.DomainTools;

import static junit.framework.Assert.assertEquals;


/***
 * By using a unit testing framework such as JUnit simplifies the unit testing
 * process significantly. Each test can run individually from another.
 * We automatically get information on what the expected and actual output was
 */
public class DomainToolsTest {

    @Test
    public void extractDomainBrand_domainWithOneSubdomain_ReturnsDomain(){
        String testResult = DomainTools.extractDomainBrand("www.google.com");
        assertEquals("google", testResult);
    }

    @Test
    public void extractDomainBrand_domainWithNoSubdomain_ReturnsDomain(){
        String testResult = DomainTools.extractDomainBrand("facebook.com");
        assertEquals("facebook", testResult);
    }

    @Test
    public void extractDomainBrand_domainWithTwoSubdomains_ReturnsDomain(){
        String testResult = DomainTools.extractDomainBrand("r1---sn-a5m7zu7d.c.youtube.com");
        assertEquals("youtube", testResult);
    }
}
