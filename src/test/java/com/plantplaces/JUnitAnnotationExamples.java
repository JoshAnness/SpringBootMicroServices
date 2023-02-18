package com.plantplaces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitAnnotationExamples {

		@BeforeClass
		public static void setupEverything() {
			int i = 1 + 1;
		}
		
		@Before
		public void setupBeforeEachTest() {
			int i = 1 + 1;
		}
	
		@Test
		public void runTests() {
			int i = 1 + 1;
			assertEquals(3, 1);
		}
		
		@Test
		public void runMoreTests() {
			int i = 1 + 1;
			assertEquals(2, 1);
		}
		
		@AfterClass
		public void teardownEverything() {
			int i = 1 + 1;
		}
		
		@After
		public void teardownBeforeEachTest() {
			int i = 1 + 1;
		}
}
