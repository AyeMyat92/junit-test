package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		 Person person = new Person("Josh", "aaa");
	       String displayName = person.getDisplayName();
	       System.out.println(displayName);
	       assertEquals("aaa, Josh", displayName);	
	       }

}
