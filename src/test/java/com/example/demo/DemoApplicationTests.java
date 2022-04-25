package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.domain.entities.Country;
import com.example.demo.domain.factories.ICountryFactory;

import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class DemoApplicationTests {

	@MockBean
	ICountryFactory countryFactory;
	
	@Test
	void contextLoads() {

		MockitoAnnotations.openMocks(this);


		Country country = new Country("1", "PT");

		assertEquals(country.getName(), "PT");
	}

}
