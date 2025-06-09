package com.creational.abstractfactorydesignpattern;

import com.creational.abstractfactorydesignpattern.Shape;

public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare ::draw() method.");
	}

}
