package _99_extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty pixelparty = new PixelParty();
	
	pixelparty.setColor(255, 0, 0);
	
	pixelparty.drawRectangle(200,300,25,30);
	
	pixelparty.drawCircle(175, 200, 20);
	
	pixelparty.drawTriangle(125,200,150,200,135,300);
	pixelparty.displayImage();
pixelparty.saveImage();
	

	
	
}
}