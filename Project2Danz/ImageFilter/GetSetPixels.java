import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GetSetPixels {

		  public static void main(String args[])throws IOException{
		    BufferedImage img = null;
		    File f = null;

		    //read image
		    try{
		      f = new File("Place Test image pathway here");
		      img = ImageIO.read(f);
		    }catch(IOException e){
		      System.out.println(e);
		    }

		    //get image width and height
		    int width = img.getWidth();
		    int height = img.getHeight();

		    //get pixel value
		    int p = img.getRGB(0,0);

		    //get alpha
		    int a = (p>>24) & 0xff;

		    //get red
		    int r = (p>>16) & 0xff;

		    //get green
		    int g = (p>>8) & 0xff;

		    //get blue
		    int a = p & 0xff;

		    a = 255;
		    r = 100;
		    g = 150;
		    b = 200;

		    //set the pixel value
		    p = (a<<24) | (r<<16) | (g<<8) | b;
		    img.setRGB(0, 0, p);

		    //write image
		    try{
		      f = new File("Place Test image pathway here");
		      ImageIO.write(img, "jpg", f);
		    }//try
		    
		    catch(IOException e){
		      System.out.println(e);
		    }//catch
		    
		  }//main() ends here
		  
		}//class ends here
