package Image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImagenTres {

	
	static int width = 900;
    static int height = 900;    
	static Color Mainred= new Color(255,0,0);
	static Color Blue = new Color(0,87,168);
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    // Definimos el tamaño del pixel y la matriz de colores    
    private final static int PIXEL_SIZE = 30;
    
    
    public void paint() {
    
    	//g = image.createGraphics();
    	drawBackground(PIXEL_SIZE, Color.gray);
    	
    	
    	
    	
 putPixel(10,0, Color.black);
 putPixel(12,0, Color.black);
 putPixel(9,1, Color.black);
 putPixel(13,1, Color.black);
 putPixel(8,2, Color.black);
 putPixel(14,2, Color.black);
 putPixel(7,3, Color.black);
 putPixel(15,3, Color.black);
 drawHorizontalLine(5, 6, 4, Color.black);
 drawHorizontalLine(16, 17, 4, Color.black);
 putPixel(4,5, Color.black);
 putPixel(18,5, Color.black);
 drawHorizontalLine(9, 10, 5, Color.black);
 drawHorizontalLine(12, 13, 5, Color.black);
 putPixel(3,6, Color.black);
 putPixel(19,6, Color.black);
 putPixel(8,6, Color.black);
 putPixel(14,6, Color.black);
 drawVerticalLine(7,8,2,Color.black);
 drawVerticalLine(7,8,20,Color.black);
 drawHorizontalLine(7, 9, 7, Color.black);
 drawHorizontalLine(13, 15, 7, Color.black);
 putPixel(6,8, Color.black);
 putPixel(16,8, Color.black);
 drawVerticalLine(8,9,10,Color.black);
 drawVerticalLine(8,9,12,Color.black);
 
 putPixel(13,10, Color.black);
 putPixel(14,11, Color.black);
 putPixel(15,12, Color.black);
 putPixel(9,10, Color.black);
 putPixel(8,11, Color.black);
 putPixel(7,12, Color.black);
 putPixel(11,11,Color.black);
 
 drawHorizontalLine(3, 5, 9, Color.black);
 drawHorizontalLine(17, 19, 9, Color.black);
 drawVerticalLine(9,10,5,Color.black);
 drawVerticalLine(9,10,17,Color.black);
 drawVerticalLine(11,12,4,Color.black);
 drawVerticalLine(11,12,18,Color.black);
 putPixel(5,13, Color.black);
 putPixel(17,13, Color.black);
 drawHorizontalLine(6, 7, 13, Color.black);
 drawHorizontalLine(15, 16, 13, Color.black);
 drawHorizontalLine(8, 9, 14, Color.black);
 drawHorizontalLine(13, 14, 14, Color.black);
 drawHorizontalLine(10, 12, 13, Color.black);
 putPixel(7,15, Color.black);
 putPixel(6,16, Color.black);
 putPixel(15,15, Color.black);
 putPixel(16,16, Color.black);
 drawVerticalLine(17,24,5,Color.black);
 drawVerticalLine(17,24,17,Color.black);
 putPixel(6,25, Color.black);
 putPixel(16,25, Color.black);
 drawHorizontalLine(7, 8, 26, Color.black);
 drawHorizontalLine(14, 15, 26, Color.black);
 drawHorizontalLine(9, 13, 27, Color.black);
 drawHorizontalLine(8, 9, 18, Color.black);
 drawHorizontalLine(13, 14, 18, Color.black);
 drawVerticalLine(19,22,7,Color.black);
 drawVerticalLine(19,22,15,Color.black);
 putPixel(12,19, Color.black);
 putPixel(13,20, Color.black);
 putPixel(14,21, Color.black);
 putPixel(10,19, Color.black);
 putPixel(9,20, Color.black);
 putPixel(8,21, Color.black);
  
 drawVerticalLine(11,12,5,Mainred);
 drawVerticalLine(11,12,17,Mainred);
 drawVerticalLine(17,23,6,Mainred);
 drawVerticalLine(17,23,16,Mainred);
 drawVerticalLine(9,12,6,Mainred);
 drawVerticalLine(9,12,16,Mainred);
 putPixel(7,6,Mainred);
 putPixel(15,6,Mainred);
 drawHorizontalLine(6, 16, 24, Mainred);
 drawHorizontalLine(7, 15, 25, Mainred);
 drawHorizontalLine(9, 13, 26, Mainred);
 drawVerticalLine(14,23,11,Mainred);
 drawHorizontalLine(7, 15, 23, Mainred);
 drawHorizontalLine(8, 14, 22, Mainred);
 drawHorizontalLine(9, 13, 21, Mainred);
 drawHorizontalLine(10, 12, 20, Mainred);
 drawHorizontalLine(10, 12, 19, Mainred);
 drawHorizontalLine(10, 12, 18, Mainred);
 drawHorizontalLine(7, 15, 17, Mainred);
 drawHorizontalLine(7, 15, 16, Mainred);
 drawHorizontalLine(8, 14, 15, Mainred);
 drawHorizontalLine(10, 12, 14, Mainred);
 putPixel(7,18,Mainred);
 putPixel(15,18,Mainred);
 
 drawHorizontalLine(6, 9, 13, Mainred);
 drawHorizontalLine(13, 16, 13, Mainred);
 
 drawHorizontalLine(8, 14, 12, Mainred);
 putPixel(10,11,Mainred);
 putPixel(12,11,Mainred);
 putPixel(7,11,Mainred);
 putPixel(15,11,Mainred);
 putPixel(11,10,Mainred);
 putPixel(7,10,Mainred);
 putPixel(15,10,Mainred);
 putPixel(11,9,Mainred);
 drawHorizontalLine(7, 8, 9, Mainred);
 drawHorizontalLine(14, 15, 9, Mainred);
 drawHorizontalLine(7, 9, 10, Mainred);
 drawHorizontalLine(13, 15, 10, Mainred);
 drawHorizontalLine(7, 9, 8, Mainred);
 drawHorizontalLine(13, 15, 8, Mainred);
 drawHorizontalLine(6, 8, 5, Mainred);
 drawHorizontalLine(14, 16, 5, Mainred);
 drawHorizontalLine(7, 10, 4, Mainred);
 drawHorizontalLine(12, 15, 4, Mainred);
 drawHorizontalLine(8, 10, 3, Mainred);
 drawHorizontalLine(12, 15, 3, Mainred);
 drawHorizontalLine(9, 10, 2, Mainred);
 drawHorizontalLine(12, 13, 2, Mainred);
 drawHorizontalLine(10, 10, 1, Mainred);
 drawHorizontalLine(12, 12, 1, Mainred);
 
 putPixel(9,11,Blue);
 putPixel(13,11,Blue);
 putPixel(8,10,Blue);
 putPixel(14,10,Blue);
 putPixel(9,9,Blue);
 putPixel(13,9,Blue);
 putPixel(10,10,Blue);
 putPixel(12,10,Blue);
 drawHorizontalLine(9, 10, 6, Blue);
 drawHorizontalLine(12, 13, 6, Blue);
 drawHorizontalLine(3, 5, 8, Blue);
 drawHorizontalLine(17, 19, 8, Blue);
 drawHorizontalLine(3, 6, 7, Blue);
 drawHorizontalLine(16, 19, 7, Blue);
 drawHorizontalLine(4, 6, 6, Blue);
 drawHorizontalLine(16, 18, 6, Blue);
 putPixel(5,5,Blue);
 putPixel(17,5,Blue);
 
 drawVerticalLine(0,8,11,Color.white);
 drawHorizontalLine(10, 12, 7,Color.white);
 
 putPixel(8,19,Color.white);
 putPixel(9,19,Color.white);
 putPixel(13,19,Color.white);
 putPixel(14,19,Color.white);
 putPixel(8,20,Color.white);
 putPixel(14,20,Color.white);
 
 
 drawSquareGrid(PIXEL_SIZE, Color.black);
 
// Guardamos la imagen en formato JPG
try {       
ImageIO.write(image, "jpg", new File("Spider_man.jpg"));
  System.out.println("Ya llevamos mas de la mitad pana");
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

