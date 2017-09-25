package com.somendu.design.factory;

/**
 * 
 * @author Somendu
 *
 */
public class MainInjectMould {

	public static void main(String[] args) {

		// InjectMould injectMould = null;
		//
		// System.out.println("Mould" + injectMould.inject());

		InjectMould injectDuckMould = new InjectDuckMould();

		System.out.println("Duck : " + injectDuckMould.inject());

		InjectMould injectCarMould = new InjectCarMould();

		System.out.println("Car : " + injectCarMould.inject());

	}

}