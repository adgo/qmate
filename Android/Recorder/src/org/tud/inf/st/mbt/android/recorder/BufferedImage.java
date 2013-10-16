package org.tud.inf.st.mbt.android.recorder;

public class BufferedImage {
	private int width,height;
	private int[][] pixels;

	public BufferedImage(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width][height];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setRGB(int x, int y, int value) {
		pixels[x][y] = value;		
	}
	
	public int getRGB(int x, int y){
		return pixels[x][y];
	}
}
