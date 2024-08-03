package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot1ApplicationTests {

	@Test
	void contextLoads() {
		
		
		 // Arrange
        String str1 = "Hello";
        String str2 = "World";

        // Act
        String result = str1 + " " + str2;

        // Assert
        String expected = "Hello World";
        assertEquals(expected, result);
		
		
		
	}

}
