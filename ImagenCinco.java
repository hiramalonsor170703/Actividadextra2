package Image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImagenCinco {

	static int width = 800;
 	static int height = 800;	    
 	static Color skin= new Color(222,190,151);
 	static Color Shadowskin= new Color(159,135,109);
 	static Color Darkyellow = new Color(206,160,57);
 	static Color Clearkyellow = new Color(234,186,62);
 	static Color blue = new Color (130,170,224);
     static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
 	static Graphics2D g = image.createGraphics();
 	    // Definimos el tamaño del pixel y la matriz de colores
 	private final static int PIXEL_SIZE = 40;

 	    
 	 public void paint() {
 	    	
 	    	
 	    
 	    	drawBackground(PIXEL_SIZE, Color.white);
 	    	
drawHorizontalLine(7, 12, 4, Color.black); 	    	
drawHorizontalLine(5, 6, 5, Color.black);
drawHorizontalLine(13, 14, 5, Color.black); 	
putPixel (4,6, Color.black);
putPixel (15,6, Color.black);
drawVerticalLine(7,8,3,Color.black);
drawVerticalLine(7,8,16,Color.black);
drawVerticalLine(9,14,2,Color.black);
drawVerticalLine(9,14,17,Color.black);
drawHorizontalLine(3, 5, 15, Color.black); 	    	
drawHorizontalLine(14, 16, 15, Color.black);
drawHorizontalLine(6, 13, 14, Color.black); 
drawVerticalLine(16,17,4,Color.black);
drawVerticalLine(16,17,15,Color.black); 	    	 
putPixel (5,18, Color.black);
putPixel (14,18, Color.black);
drawHorizontalLine(6, 13, 19, Color.black); 
drawVerticalLine(15,16,8,Color.black);
drawVerticalLine(15,16,11,Color.black); 	

drawHorizontalLine(6, 13, 18, skin); 
drawHorizontalLine(5,14,17,skin);
drawHorizontalLine(6, 7, 16, skin); 
drawHorizontalLine(9,10,16,skin);
drawHorizontalLine(12, 13, 16, skin); 

drawHorizontalLine(6, 7, 15, Shadowskin); 
drawHorizontalLine(9,10,15,Shadowskin);
drawHorizontalLine(12, 13, 15, Shadowskin); 
putPixel(5,16,Shadowskin);
putPixel(14,16,Shadowskin);

drawHorizontalLine(3, 5, 14, blue); 
drawHorizontalLine(14, 16, 14, blue); 
drawHorizontalLine(3,16,13,blue);
drawHorizontalLine(3,16,12,blue);
drawHorizontalLine(4,15,7,blue);
drawHorizontalLine(5,14,6,blue);
drawHorizontalLine(7,12,5,blue);

drawHorizontalLine(9,10,8,Darkyellow);
drawHorizontalLine(9,10,11,Darkyellow);
drawVerticalLine(9,10,8,Darkyellow);
drawVerticalLine(9,10,11,Darkyellow);


drawHorizontalLine(9,10,9,Clearkyellow);
drawHorizontalLine(9,10,10,Clearkyellow);


 	    	 drawSquareGrid(PIXEL_SIZE, Color.black);
 	    
 	    
 // Guardamos la imagen en formato JPG
 	
 try {       
  ImageIO.write(image, "jpg", new File("Dieguito_Maradona.jpg"));
 	  System.out.println("conseguimos la 4ta");
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