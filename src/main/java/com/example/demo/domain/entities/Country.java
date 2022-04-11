package com.example.demo.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Getter;

@ToString
@EqualsAndHashCode
public class Country {
	@Getter
	private String code;
	@Getter
	private String name;

	public Country(String code, String name ) {
		this.code = code;
		this.name = name;
	}
}