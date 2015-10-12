package uk.rajiv.algorithms.KMP_SearchIntegerPatterns;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Testing for normal case
     */
    public void testForNormalCase()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,3,4,5};
    	int [] pattern = {4,5};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == 2 );
    }
    
    /**
     * Testing for normal case with repeating occurrences
     */
    public void testForNormalCase_Repeats()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,3,4,5,6,7,8,9,2,3,4,5,7,8,9};
    	int [] pattern = {4,5,6,7};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == 2 );
    }
    
    
    /**
     * Testing for best case 
     */
    public void testForBestCase()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,3,4,5,6,7,8,9,2,3,4,5,7,8,9};
    	int [] pattern = {2,3};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == 0 );
    }
    
    /**
     * Testing for worst case
     */
    public void testForWorstCase()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1};
    	int [] pattern = {2,1};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == 15 );
    }
    
    
    /**
     * Testing for single-element cases
     */
    public void testForPatternLength()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,3,4,5,7,8,9,2,3,4,5,7,8,9};
    	int [] pattern = {4};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == 2 );
    }
    
    /**
     * Testing for error conditions
     */
    public void testForEmptyPattern()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,3,4,5,7,8,9,2,3,4,5,7,8,9};
    	int [] pattern = {};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == -1 );
    }
    
    
    /**
     * Testing for empty target
     */
    public void testForEmptyTarget()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {};
    	int [] pattern = {1,2};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == -1 );
    }
    
    
    /**
     * Testing for pattern longer than sequence case
     */
    public void testForPatternLongerThanTarget()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,3,4};
    	int [] pattern = {2,3,4,5,7,8,9,2,3,4,5,7,8,9};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == -1 );
    }
    
    
    /**
     * Testing for non-match cases
     */
    public void testForNonMatchCases()
    {
    	KMPSearch kmp = new KMPSearch();
    	
    	int [] target = {2,3,4,5,7,8,9,2,3,4,5,7,8,9};
    	int [] pattern = {1,3,5,9};
    	
    	assertTrue( kmp.searchPattern(target, pattern) == -1 );
    }
}
