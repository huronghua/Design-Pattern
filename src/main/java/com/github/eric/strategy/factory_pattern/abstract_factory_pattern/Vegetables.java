package com.github.eric.strategy.factory_pattern.abstract_factory_pattern;


import lombok.Data;

@Data
public class Vegetables {
	String name;

	void print(){
		System.out.println("this is a normal vegetables");
	}
}
