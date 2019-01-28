package com.mindtree.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_greet {

	@Test
	public void test() {
		String str = "Hello from Docker";
		String str1 = Hello.printWishes();
		assertEquals(str, str1);
	}

}
