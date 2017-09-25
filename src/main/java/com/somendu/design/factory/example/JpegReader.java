/**
 * 
 */
package com.somendu.design.factory.example;

/**
 * @author Somendu
 *
 */
public class JpegReader implements ImageReader {

	private DecodedImage decodedImage;

	public JpegReader(String image) {
		this.decodedImage = new DecodedImage(image);
	}

	@Override
	public DecodedImage getDecodeImage() {
		return decodedImage;
	}

}
