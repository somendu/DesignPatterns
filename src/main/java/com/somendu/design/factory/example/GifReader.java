/**
 * 
 */
package com.somendu.design.factory.example;

/**
 * @author Somendu
 *
 */
public class GifReader implements ImageReader {

	private DecodedImage decodedImage;

	public GifReader(String image) {
		this.decodedImage = new DecodedImage(image);
	}

	@Override
	public DecodedImage getDecodeImage() {
		return decodedImage;
	}

}
