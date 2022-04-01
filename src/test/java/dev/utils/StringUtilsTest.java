package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {
	/**
	 * Préparer la requête quand la méthode n'est pas statique
	 * pour ne pas avoir à l'instancier à chaque test
	 */
	private StringUtils stringUtils;
	
	@Before
	public void setup() {
		stringUtils = new StringUtils();
	}
	
	@Test
	public void testLevenshteinDistance() throws Exception {
		int result = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1, result);
		
		int result2 = StringUtils.levenshteinDistance("machins", "machine");
		assertEquals(1, result2);
		
		int result3 = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1, result3);
		
		int result4 = StringUtils.levenshteinDistance("distance", "instance");
		assertEquals(2, result4);
		
		int result5 = StringUtils.levenshteinDistance("chien", "chine");
		assertEquals(2, result5);
	}
	
	@Test(expected = Exception.class)
	public void testLevenshteinDistanceNull() throws Exception {
		int result = StringUtils.levenshteinDistance(null, null);
		int result2 = StringUtils.levenshteinDistance(null, "chat");
	}

}
