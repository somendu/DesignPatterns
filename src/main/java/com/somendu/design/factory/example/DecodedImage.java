/**
 * 
 */
package com.somendu.design.factory.example;

/**
 * @author Somendu
 *
 */
public class DecodedImage {
	private String image;

	public DecodedImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return image + ": is decoded";
	}
}
