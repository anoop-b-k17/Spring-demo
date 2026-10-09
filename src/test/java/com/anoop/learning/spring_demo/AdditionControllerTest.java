package com.anoop.learning.spring_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionControllerTest {

	@Test
	void addsTwoIntegers() {
		assertEquals(12, new AdditionController().add(7, 5));
	}
}
