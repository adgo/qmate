package org.tud.inf.st.mbt.android.recorder;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

//stolen from Android Screen Monitor, does not work yet
public class ImagePrinter {

	private static final long sleep = 333;

	private static final int FB_TYPE_XBGR = 0;
	private static final int FB_TYPE_RGBX = 1;
	private static final int FB_TYPE_XRGB = 2;

	private static int[][] FB_OFFSET_LIST = { { 0, 1, 2, 3 }, // XBGR : Normal
			{ 3, 2, 1, 0 }, // RGBX : Xperia Arc
			{ 2, 1, 0, 3 } // XRGB : FireFox OS(B2G)
	};

	private static int mFbType = FB_TYPE_XBGR;

	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(System.out);
			while (true) {
				try {
					BufferedImage img = ImagePrinter.getBufferedImage();
					// oos.writeObject(img);
					Thread.sleep(sleep);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static RawImage getRawImage() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			FileInputStream fis = new FileInputStream("/dev/graphics/fb0");
			byte[] barr = new byte[256];
			int read = 0;
			while ((read = fis.read(barr)) != -1) {
				baos.write(barr, 0, read);
			}
			fis.close();
			barr = baos.toByteArray();
			baos.close();
			RawImage img = new RawImage();
			img.data = barr;
			System.out.println("first int: "+ByteBuffer.wrap(barr).getInt());
			ByteBuffer buf = ByteBuffer.wrap(barr);
			img.readHeader(1, buf);
			System.out.println("data length: " + barr.length);
			return img;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static BufferedImage getBufferedImage() {
		RawImage rawImage = getRawImage();
		BufferedImage image = null;

		final int imageWidth;
		final int imageHeight;

		imageWidth = rawImage.height;
		imageHeight = rawImage.width;
		image = new BufferedImage(imageWidth, imageHeight);

		final byte[] buffer = rawImage.data;
		final int redOffset = rawImage.red_offset;
		final int greenOffset = rawImage.green_offset;
		final int blueOffset = rawImage.blue_offset;
		final int alphaOffset = rawImage.alpha_offset;
		final int redMask = getMask(rawImage.red_length);
		final int greenMask = getMask(rawImage.green_length);
		final int blueMask = getMask(rawImage.blue_length);
		final int alphaMask = getMask(rawImage.alpha_length);
		final int redShift = (8 - rawImage.red_length);
		final int greenShift = (8 - rawImage.green_length);
		final int blueShift = (8 - rawImage.blue_length);
		final int alphaShift = (8 - rawImage.alpha_length);

		int index = 0;

		final int offset0;
		final int offset1;
		final int offset2;
		final int offset3;

		System.out.println("BPP: " + rawImage.bpp);

		if (rawImage.bpp == 16) {
			offset0 = 1;
			offset1 = 0;

			for (int y = 0; y < rawImage.height; y++) {
				for (int x = 0; x < rawImage.width; x++) {
					int value = buffer[index + offset0] & 0x00FF;
					value |= (buffer[index + offset1] << 8) & 0xFF00;
					int r = ((value >>> redOffset) & redMask) << redShift;
					int g = ((value >>> greenOffset) & greenMask) << greenShift;
					int b = ((value >>> blueOffset) & blueMask) << blueShift;
					value = 255 << 24 | r << 16 | g << 8 | b;
					index += 2;
					image.setRGB(y, rawImage.width - x - 1, value);
				}
			}

		} else if (rawImage.bpp == 32) {
			offset0 = FB_OFFSET_LIST[mFbType][0];
			offset1 = FB_OFFSET_LIST[mFbType][1];
			offset2 = FB_OFFSET_LIST[mFbType][2];
			offset3 = FB_OFFSET_LIST[mFbType][3];

			for (int y = 0; y < rawImage.height; y++) {
				for (int x = 0; x < rawImage.width; x++) {
					int value;
					value = buffer[index + offset0] & 0x00FF;
					value |= (buffer[index + offset1] & 0x00FF) << 8;
					value |= (buffer[index + offset2] & 0x00FF) << 16;
					value |= (buffer[index + offset3] & 0x00FF) << 24;
					final int r = ((value >>> redOffset) & redMask) << redShift;
					final int g = ((value >>> greenOffset) & greenMask) << greenShift;
					final int b = ((value >>> blueOffset) & blueMask) << blueShift;
					final int a;
					if (rawImage.alpha_length == 0) {
						a = 0xFF;
					} else {
						a = ((value >>> alphaOffset) & alphaMask) << alphaShift;
					}
					value = a << 24 | r << 16 | g << 8 | b;
					index += 4;
					image.setRGB(y, rawImage.width - x - 1, value);
				}
			}

		}

		return image;
	}

	private static int getMask(int length) {
		int res = 0;
		for (int i = 0; i < length; i++) {
			res = (res << 1) + 1;
		}

		return res;
	}

}
