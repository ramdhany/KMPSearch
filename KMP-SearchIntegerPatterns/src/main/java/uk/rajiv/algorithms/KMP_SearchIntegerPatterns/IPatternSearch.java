/**
 * 
 */
package uk.rajiv.algorithms.KMP_SearchIntegerPatterns;


/**
 * Interface definition for Pattern Search interface operations
 * @author Rajiv Ramdhany
 * 
 */
public interface IPatternSearch {
	
	/**
	 * Search for the occurrences of a pattern 
	 * @param text string to search pattern in
	 * @param pattern a string pattern
	 * @return index of first occurrence of pattern in text; -1 if pattern is not found
	 */
	public int searchPattern(String text, String pattern);
	
	
	/**
	 * Search for the occurrences of a integer pattern in a longer sequence
	 * @param target array sequence of integers to search pattern in
	 * @param pattern an array of integers to be searched for
	 * @return index of first occurrence of pattern in the sequence; -1 if pattern is not found
	 */
	public int searchPattern(int[] target, int[] pattern);
	
	
	

}
