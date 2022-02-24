package teamProject;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class URL {
    public static void main(String[] args) {
 
    	String urlLink = "https://www.youtube.com/watch?v=H69tJmsgd9I";
    	 
    	try {
    		Desktop.getDesktop().browse(new URI(urlLink));
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (URISyntaxException e) {
    		e.printStackTrace();
    	}
    }
}