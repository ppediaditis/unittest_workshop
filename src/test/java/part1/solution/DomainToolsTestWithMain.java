package part1.solution;

import part1.DomainTools;

public class DomainToolsTestWithMain {

    /***
     * With this command line program we attempt to manually test the DomainTools method.
     * This testing strategy will work but does have some drawbacks:
     * 1. It is not easily automatable and integratable in the build process.
     * 2. Execution will end upon failure of the first test hiding information from subsequent tests.
     * 3. Harder to describe and understand what each test is about especially if it fails.
     * 4. Requires alot of boilerplate coding
     * @param argv
     */
	public static void main(String[] argv){

		String testResult;

		testResult = DomainTools.extractDomainBrand("www.google.com");
		assert testResult.equals("google") : "Expected google but found "+testResult;

		testResult = DomainTools.extractDomainBrand("facebook.com");
		assert testResult.equals("facebook") : "Expected facebook but found "+testResult;

		testResult = DomainTools.extractDomainBrand("r1---sn-a5m7zu7d.c.youtube.com");
		assert  testResult.equals("youtube") : "Expected youtube but found "+testResult;
	}

}
