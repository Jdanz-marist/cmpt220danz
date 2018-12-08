import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RedImage {
	    public static void main(String args[])throws IOException{

	        BufferedImage img = null;
	        File f = null;

	        //read image
	        try{

	            f = new File("Place Test image pathway here");

	            img = ImageIO.read(f);

	        }//try
	        
	        catch(IOException e){

	            System.out.println(e);

	        }//catch

	        

	        //get width and height
	        int width = img.getWidth();
	        int height = img.getHeight();

	        

	        //convert to red image
	        for(int y = 0; y < height; y++){
	            for(int x = 0; x < width; x++){

	                int p = img.getRGB(x,y);
	                int a = (p>>24)&0xff;
	                int r = (p>>16)&0xff;

	                

	                //set new RGB
	                p = (a<<24) | (r<<16) | (0<<8) | 0;	                

	                img.setRGB(x, y, p);

	            }//for

	        }//for

	        

	        //write image
	        try{

	            f = new File("D:\\Image\\output.jpg");

	            ImageIO.write(img, "jpg", f);

	        }//try
	        
	        catch(IOException e){

	            System.out.println(e);

	        }//catch

	    }//main() ends here

	}//class ends here
