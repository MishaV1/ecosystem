package com.example.ecosystem

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class EcosystemApplicationTests {

	@Test
	fun contextLoads() {
		assertEquals(5, 5);
	}

}
