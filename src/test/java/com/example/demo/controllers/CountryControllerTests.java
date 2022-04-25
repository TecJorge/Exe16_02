package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.example.demo.domain.entities.Country;
import com.example.demo.domain.factories.ICountryFactory;
import com.example.demo.services.CountryService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@SpringBootTest
class CountryControllerTests {

	@MockBean
	CountryService countryService;

	@MockBean
	ICountryFactory countryFactory;

	@MockBean
	Country country;

	@InjectMocks
	CountryController countryController;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

	@Test
	void shouldCreateACountryWithCorrectAttributes() {

		// Arrange
		MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		Country countryDouble = mock(Country.class);
		Optional<Country> optionalCountry = Optional.of(countryDouble);

		when( countryService.getCountryById("PT")).thenReturn(optionalCountry);

		// Act
        ResponseEntity<Object> responseEntity = countryController.getById("PT");

		// Assert
        assertEquals(responseEntity.getStatusCodeValue(), 200);
	}
}
