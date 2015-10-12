/**
 * 
 */
package uk.rajiv.algorithms.KMP_SearchIntegerPatterns;

/**
 * @author Rajiv Ramdhany
 * @Date 11/10/2015
 * A Knuth Morris Pratt Algorithm implementation to 
 * search for occurrences of a pattern (string or integer) within a 
 * target integer-sequence or string.
 *
 */
public class KMPSearch implements IPatternSearch {
	
	private String s_pattern;	// string pattern to look for
	private int[] i_pattern;	//	int pattern to look for
	private int[] m_table; 		// for pre-computed failure table
	
	/**
	 * Create a failure table from string pattern
	 * @param pattern a string pattern
	 * @return an array of integers representing the failure table
	 */
	private int[] createTable(String pattern) {
		
        int M = pattern.length();
  
        if (M>0){
        // create table of longest prefixes
        int[] table = new int[M];
        // first few values in table are fixed
        table[0] = -1;  
              
        for (int j = 1; j < M; j++)
        {
            int i = table[j - 1]; // index on pattern string
            while ((pattern.charAt(j) != pattern.charAt(i + 1)) && i >= 0)
                i = table[i];
            if (pattern.charAt(j) == pattern.charAt(i + 1))
                table[j] = i + 1;
            else
                table[j] = -1;
        }
        
         
        for (int i = 0; i < M; i++)
            System.out.println("table[" + i + "] = " + table[i]);
        
        return table;
        }else
        {
        	int[] table = new int[1];
        	table[0] =-1;
        	return table;
        }
	}
	
	
	/**
	 * Create a failure table from an integer pattern
	 * @param pattern an array of integers as the pattern to look for
	 * @return an array of integers representing the failure table
	 */
	private int[] createTable(int[] pattern) {
		
        int M = pattern.length;
  

        // create table of longest prefixes
        int[] table = new int[M];
        
        // first few values in table are fixed
        table[0] = -1;  
              
        for (int j = 1; j < M; j++)
        {
            int i = table[j - 1]; // index on pattern string
            while ((pattern[j] != pattern[i + 1]) && i >= 0)
                i = table[i];
            if (pattern[j] == pattern[i + 1])
                table[j] = i + 1;
            else
                table[j] = -1;
        }
        
         
        for (int i = 0; i < M; i++)
            System.out.println("table[" + i + "] = " + table[i]);
        
        return table;
	}
	
	
	/* (non-Javadoc)
	 * @see uk.rajiv.algorithms.KMP_SearchIntegerPatterns.IPatternSearch#searchPattern(java.lang.String, java.lang.String)
	 */
	public int searchPattern(String text, String pattern) {
		this.s_pattern = pattern;
        this.m_table = createTable(pattern);
        
       if ((pattern.length() == 0) || (text.length() == 0)) return -1;
        
        int i = 0, j = 0;
        int lens = text.length();
        int lenp = pattern.length();
        
        while (i < lens && j < lenp)
        {
            if (text.charAt(i) == pattern.charAt(j))
            {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = this.m_table[j - 1] + 1;
        }
        return ((j == lenp) ? (i - lenp) : -1);
        
	}

	/* (non-Javadoc)
	 * @see uk.rajiv.algorithms.KMP_SearchIntegerPatterns.IPatternSearch#searchPattern(int[], int[])
	 */
	public int searchPattern(int[] target, int[] pattern) {
		
		if ((target.length ==0) || (pattern.length == 0)) return -1;
		
		this.i_pattern = pattern;
        this.m_table = createTable(pattern);
        
        int i = 0, j = 0;
        int lens = target.length;
        int lenp = pattern.length;
        
        while (i < lens && j < lenp)
        {
            if (target[i] == pattern[j])
            {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = this.m_table[j - 1] + 1;
        }
        return ((j == lenp) ? (i - lenp) : -1);
	}
	
	
	
}



