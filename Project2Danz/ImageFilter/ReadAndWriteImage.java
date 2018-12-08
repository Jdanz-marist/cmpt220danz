import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ReadAndWriteImage {
	  public static void main(String args[])throws IOException{
	    
		  BufferedImage image = null;
		  File f = null;

	    //read image file
	    try{
	      
	    	f = new File("Place Test image pathway here");
	    	image = ImageIO.read(f);
	    
	    }//try
	    
	    catch(IOException e){
	      
	    	System.out.println("Error: "+e);
	    
	    }//catch

	    //write image
	    try{
	    	
	      f = new File("Place Test image pathway here");
	      ImageIO.write(image, "jpg", f);
	    
	    }//try
	    
	    catch(IOException e){
	      
	    	System.out.println("Error: "+e);
	    
	    }//catch
	    
	  }//main() ends here
	
}//class ends here