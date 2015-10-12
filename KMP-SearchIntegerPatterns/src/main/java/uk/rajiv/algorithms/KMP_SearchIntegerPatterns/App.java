package uk.rajiv.algorithms.KMP_SearchIntegerPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App 
{
	// test client
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    System.out.println("Knuth Morris Pratt Test\n");
//	    System.out.println("\nEnter Text\n");
//	    try {
//			String text = br.readLine();
//			System.out.println("\nEnter Pattern\n");
//		    String pattern = br.readLine();
		    KMPSearch kmp = new KMPSearch();
		    
//		    System.out.println("position:" + kmp.searchPattern("catdog", "do"));
//		    System.out.println("position:" + kmp.searchPattern("abacadabrabracabracadabrabrabracad", "abracadabra"));
//		    System.out.println("position:" + kmp.searchPattern("abacadabrabracabracadabrabrabracad", "cad"));
//		    System.out.println("position:" + kmp.searchPattern("abacadabrabracabracadabrabrabracad", "d"));
//		    System.out.println("position:" + kmp.searchPattern("abacadabrabracabracadabrabrabracad", ""));
		    
//		    int [] target = {2,3,4,5,6,7,8};
//	    	int [] pattern = {4,5,6};
	    	
//	    	int [] target = {2,3,4,5,6,7,8,9,2,3,4,5,7,8,9};
//	    	int [] pattern = {4,5,6,7};
		    
//		    int [] target = {2,3,4};
//	    	int [] pattern = {2,3,4,5,7,8,9,2,3,4,5,7,8,9};
		    
		    int [] target = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1};
	    	int [] pattern = {2,1};
	    	
	    	System.out.println("position:" + kmp.searchPattern(target, pattern));
		    
		    
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
	    
	}

}
