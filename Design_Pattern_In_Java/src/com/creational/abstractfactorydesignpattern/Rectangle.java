package com.creational.abstractfactorydesignpattern;

import com.creational.abstractfactorydesignpattern.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle  ::draw() method.");
	}

}
