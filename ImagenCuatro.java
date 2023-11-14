package Image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImagenCuatro {


	static int width = 900;
    static int height = 900;    
	static Color Yellow= new Color(236,197,45);
	static Color Mainred= new Color(247,48,47);
	static Color Blue = new Color(24,89,233);
	static Color Skin = new Color(244,219,197);
	
	
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    static Graphics2D g = image.createGraphics();
    // Definimos el tamaño del pixel y la matriz de colores    
    private final static int PIXEL_SIZE = 30;
    
    
    public void paint() {
    
    	//g = image.createGraphics();
   drawBackground(PIXEL_SIZE, Color.gray);
    	
   drawHorizontalLine(11, 17, 4, Color.black); 	
   putPixel(10,5, Color.black); 	
   putPixel(18,5, Color.black); 	
   drawVerticalLine(6,7,9,Color.black);
   drawVerticalLine(6,7,19,Color.black);
   drawVerticalLine(8,9,8,Color.black);
   drawVerticalLine(8,9,20,Color.black);
   drawHorizontalLine(6, 7, 10, Color.black); 	
   drawHorizontalLine(21, 22, 10, Color.black); 	
   putPixel(5,11, Color.black); 	
   putPixel(6,12, Color.black); 	
   putPixel(23,11, Color.black); 	
   putPixel(22,12, Color.black); 	
   drawHorizontalLine(7, 9, 13, Color.black); 	
   drawHorizontalLine(19, 21, 13, Color.black);
   putPixel(9,14, Color.black); 	
   putPixel(19,14, Color.black); 	
   putPixel(10,15, Color.black); 	
   putPixel(18,15, Color.black); 	
   drawHorizontalLine(10, 17, 16, Color.black); 	
   putPixel(11,17, Color.black); 	
   putPixel(10,18, Color.black); 	
   putPixel(9,19, Color.black); 	
   putPixel(8,20, Color.black);
   putPixel(16,17, Color.black); 	
   putPixel(17,18, Color.black); 	
   putPixel(18,19, Color.black); 	
   putPixel(19,20, Color.black);
   putPixel(9,21, Color.black); 	
   putPixel(18,21, Color.black);
   drawHorizontalLine(10, 11, 20, Color.black); 	
   drawHorizontalLine(16, 17, 20, Color.black);
   drawVerticalLine(21,23,11,Color.black);
   drawVerticalLine(21,23,16,Color.black);
   drawVerticalLine(22,23,14,Color.black); 
   drawVerticalLine(22,23,13,Color.black); 
   putPixel(12,24, Color.black); 	
   putPixel(15,24, Color.black); 	
   drawVerticalLine(12,14,12,Color.black); 
   drawVerticalLine(12,14,16,Color.black); 
   putPixel(13,12, Color.black); 	
   putPixel(15,12, Color.black); 	
   putPixel(17,12, Color.black); 	
   putPixel(13,11, Color.black); 	
   putPixel(15,11, Color.black);
   drawHorizontalLine(13, 15, 9, Color.black);
   drawHorizontalLine(10, 18, 10, Color.black); 	
   drawHorizontalLine(8, 11, 11, Color.black); 	
   drawHorizontalLine(17, 20, 11, Color.black);
   drawHorizontalLine(9, 10, 12, Color.black); 	
   drawHorizontalLine(18, 19, 12, Color.black);
   
   
   
   putPixel(12,23, Skin); 	
   putPixel(15,23, Skin); 
   putPixel(9,20, Skin); 	
   putPixel(18,20, Skin); 	
   putPixel(10,19, Skin); 	
   putPixel(17,19, Skin); 	
   drawVerticalLine(17,19,13,Skin); 
   drawVerticalLine(17,19,14,Skin); 
   drawHorizontalLine(11, 17, 15, Skin);
   drawHorizontalLine(10, 11, 14, Skin); 
   drawHorizontalLine(17, 18, 14, Skin);
   drawHorizontalLine(10, 11, 13, Skin); 
   drawHorizontalLine(17, 18, 13, Skin); 
   putPixel(11,12, Skin); 	
   putPixel(17,12, Skin); 
   putPixel(12,11, Skin); 	
   putPixel(16,11, Skin);
   putPixel(14,11, Skin); 
   drawVerticalLine(12,14,13,Skin); 
   drawVerticalLine(12,14,14,Skin); 
   drawVerticalLine(12,14,15,Skin); 
  
   
   drawHorizontalLine(13, 15, 7, Mainred);
   drawHorizontalLine(10, 12, 8, Mainred);
   drawHorizontalLine(16, 18, 8, Mainred);
   putPixel(9,9, Mainred);
   putPixel(19,9, Mainred); 
   
   drawVerticalLine(17,19,12,Mainred); 
   drawVerticalLine(17,19,15,Mainred); 
   drawVerticalLine(18,19,11,Mainred); 
   drawVerticalLine(18,19,16,Mainred); 
   drawHorizontalLine(11, 17, 5, Yellow);
   drawHorizontalLine(10, 18, 6, Yellow);
   drawHorizontalLine(10, 12, 7, Yellow);
   drawHorizontalLine(16, 18, 7, Yellow);
   
   drawHorizontalLine(13, 15, 8, Yellow);
   drawHorizontalLine(10, 12, 9, Yellow);
   drawHorizontalLine(16, 18, 9, Yellow);
   
   drawHorizontalLine(8, 9, 10, Yellow);
   drawHorizontalLine(19, 20, 10, Yellow);
   drawHorizontalLine(6, 7, 11, Yellow);
   drawHorizontalLine(21, 22, 11, Yellow);
   drawHorizontalLine(7, 8, 12, Yellow);
   drawHorizontalLine(20, 21, 12, Yellow);
   
   putPixel(9,8,Yellow);
   putPixel(19,8,Yellow); 
   
   putPixel(12,22, Color.white);
   putPixel(15,22, Color.white); 
   
   drawHorizontalLine(12, 15, 20, Blue); 	
   drawHorizontalLine(12, 15, 21, Blue);
   
   

   
   
  drawSquareGrid(PIXEL_SIZE, Color.white);
    	

// Guardamos la imagen en formato JPG
try {       
ImageIO.write(image, "jpg", new File("One_Piece.jpg"));
  System.out.println("Solo 2 mas carnal!!!");
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


