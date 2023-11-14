package Image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImagenDos {
	
	static int width = 800;
    static int height = 800;    
	static Color clearGreen= new Color(62,196,59);
	static Color darkGreen = new Color(0,127,2);
	static Color VomitGreen = new Color(172,254,45);
	static Color Orange = new Color(253,144,34);	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    // Definimos el tamaño del pixel y la matriz de colores    
    private final static int PIXEL_SIZE = 40;
    
    
    public void paint() {
    
    	//g = image.createGraphics();
    	drawBackground(PIXEL_SIZE, Color.white);
    	
    	
drawHorizontalLine(6, 11, 1, Color.black);
drawHorizontalLine(4, 5, 2, Color.black);
drawHorizontalLine(12, 13, 2, Color.black);
drawHorizontalLine(3, 4, 3, Color.black);
drawHorizontalLine(13, 14, 3, Color.black);
drawHorizontalLine(3, 14, 4, Color.black);
drawHorizontalLine(4, 5, 2, Color.black);
putPixel(2,5, Color.black);
putPixel(15,5, Color.black);
drawVerticalLine(6,7,1,Color.black);
drawVerticalLine(6,7,3,Color.black);
drawVerticalLine(6,7,14,Color.black);
drawVerticalLine(6,7,16,Color.black);
drawHorizontalLine(3,13,6, Color.black);
drawVerticalLine(8,10,2,Color.black);
drawVerticalLine(8,10,15,Color.black);
drawVerticalLine(11,12,1,Color.black);
drawVerticalLine(11,12,16,Color.black);
putPixel(3,11, Color.black);
putPixel(14,11, Color.black);
drawHorizontalLine(7,10,11, Color.black);
putPixel(2,13, Color.black);
putPixel(15,13, Color.black);
drawHorizontalLine(4,6,12, Color.black);
drawHorizontalLine(11,13,12, Color.black);
drawVerticalLine(13,16,6,Color.black);
drawVerticalLine(13,16,11,Color.black);
drawHorizontalLine(8,9,13, Color.black);
drawHorizontalLine(3,4,14, Color.black);
drawHorizontalLine(13,14,14, Color.black);
drawHorizontalLine(4,5,15, Color.black);
drawHorizontalLine(12,13,15, Color.black);
drawHorizontalLine(4,5,16, Color.black);
drawHorizontalLine(12,13,16, Color.black);
drawHorizontalLine(6,11,17, Color.black);

drawHorizontalLine(7,10,2, clearGreen);
drawHorizontalLine(6,11,3,clearGreen);

putPixel(6,2, darkGreen);
putPixel(11,2, darkGreen);
putPixel(5,3, darkGreen);
putPixel(12,3, darkGreen);
putPixel(3,5, darkGreen);
putPixel(14,5, darkGreen);
drawHorizontalLine(5,12,5, darkGreen);
drawVerticalLine(6,7,2,darkGreen);
drawVerticalLine(6,7,15,darkGreen);
putPixel(2,11, darkGreen);
putPixel(15,11, darkGreen);
drawHorizontalLine(2,3,12, darkGreen);
drawHorizontalLine(7,10,12,darkGreen);
drawHorizontalLine(14,15,12, darkGreen);
drawHorizontalLine(3,4,13, darkGreen);
drawHorizontalLine(13,14,13,darkGreen);
putPixel(5,14, darkGreen);
putPixel(12,14, darkGreen);
drawHorizontalLine(7,10,14, darkGreen);
drawHorizontalLine(7,10,15,darkGreen);
drawHorizontalLine(7,10,16, darkGreen);

putPixel(4,5, VomitGreen);
putPixel(13,5, VomitGreen);
putPixel(5,13, VomitGreen);
putPixel(12,13, VomitGreen);
putPixel(7,13, VomitGreen);
putPixel(10,13, VomitGreen);


drawHorizontalLine(4,13,7,Orange);
drawHorizontalLine(3,14,8,Orange);
drawHorizontalLine(3,14,9,Orange);
drawHorizontalLine(3,14,10,Orange);
drawHorizontalLine(4,6,11,Orange);
drawHorizontalLine(11,13,11,Orange);

putPixel(5,8, Color.white);
putPixel(5,9, Color.white);
putPixel(6,8, Color.white);


drawSquareGrid(PIXEL_SIZE, Color.black);

// Guardamos la imagen en formato JPG
try {       
ImageIO.write(image, "jpg", new File("HALO.jpg"));
  System.out.println("si se pudo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
   
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }

}