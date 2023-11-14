
 package Image;

 import java.awt.Color;
 import java.awt.Graphics2D;
 import java.awt.image.BufferedImage;
 import java.io.File;
 import javax.imageio.ImageIO;


 public class Imagen {
 	
 	static int width = 800;
 	static int height = 800;	    
 	static Color skin= new Color(255,194,15);
 	static Color mainyellow = new Color(254,242,0);
 	static Color mainred = new Color(238,28,37);
 	static Color brown = new Color(63,28,0,255);
 	static Color blue = new Color (0,0,254);
     static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
 	static Graphics2D g = image.createGraphics();
 	    // Definimos el tamaño del pixel y la matriz de colores
 	private final static int PIXEL_SIZE = 50;

 	    
 	 public void paint() {
 	    	
 	    	
 	    
 	    	drawBackground(PIXEL_SIZE, Color.white);
 	    
 	    	
 	drawHorizontalLine(5, 9, 0, mainred);
 	drawHorizontalLine(4, 12, 1, mainred);
 	drawHorizontalLine(4, 5, 7, mainred);
 	drawHorizontalLine(7, 8, 7, mainred);
 	drawHorizontalLine(10,11, 7, mainred);
 	drawHorizontalLine(3, 5, 8, mainred);
 	drawHorizontalLine(7, 8, 8, mainred);
 	drawHorizontalLine(10,12, 8, mainred);
 	drawHorizontalLine(2, 5, 9, mainred);
 	drawHorizontalLine(10,13, 9, mainred);
 	putPixel(4,10, mainred);
 	 putPixel(11,10, mainred);

 drawHorizontalLine(7, 8, 2, skin);
 putPixel (10,2, skin);
 putPixel(4,3, skin);
 drawHorizontalLine(6, 8, 3, skin);
 drawHorizontalLine(10, 11, 3, skin);
 putPixel (4,4, skin);
 drawHorizontalLine(7, 9, 4, skin);
 drawHorizontalLine(11, 13, 4, skin);
 drawHorizontalLine(5, 8, 5, skin);
 drawHorizontalLine(5, 10, 6, skin);
 drawHorizontalLine(2, 3, 10, skin);
 drawHorizontalLine(2, 4, 11, skin);
 drawHorizontalLine(2, 3, 12, skin);
 drawHorizontalLine(12, 13, 10, skin);
 drawHorizontalLine(11, 13, 11, skin);
 drawHorizontalLine(12, 13, 12, skin);

 drawHorizontalLine (4,6,2, brown);
 drawVerticalLine(3,4,3,brown);
 drawVerticalLine (3,4,5, brown);
 putPixel(6,4,brown);
 drawHorizontalLine (3,5,14, brown);
 drawHorizontalLine (10,12,14, brown);
 drawHorizontalLine (2,5,15, brown);
 drawHorizontalLine (10,13,15, brown);

 putPixel (6,10, mainyellow);
 putPixel (9,10, mainyellow);

 drawVerticalLine(7,9,6,blue);
 drawVerticalLine(7,9,9,blue);
 drawVerticalLine(9,12,7, blue);
 drawVerticalLine(9,12,8, blue);
 drawVerticalLine(10,13,5, blue);
 drawVerticalLine(10,13,10, blue);
 drawVerticalLine(11,13,6, blue);
 drawVerticalLine(11,13,9, blue);
 drawVerticalLine(12,13,4, blue);
 drawVerticalLine(12,13,11, blue);

 drawHorizontalLine (9,12,5, Color.black);	
 drawVerticalLine(2,3,9,Color.black);
 putPixel (10,4, Color.black);
 
 drawSquareGrid(PIXEL_SIZE, Color.black);
 	    
 	    
 // Guardamos la imagen en formato JPG
 	
 try {       
  ImageIO.write(image, "jpg", new File("mario_bros.jpg"));
 	  System.out.println("archivo guardado");
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