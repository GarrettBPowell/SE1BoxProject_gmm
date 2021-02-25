/**
 * SE1 Laser Box Project
 * Marlon Miller Matute, Garrett Powell, Michael Thorson
 */
 
import java.io.File;  // Import the File class
import java.io.IOException;


public class SE1BoxProject_gmm
{
    public static void main( String[] args )
    {
        System.out.println("<path d=\"M 45.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />");
    }

    public boolean coordinates(String keys)
    {
    	String corners[] = {"<path d=\"M 35.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />","<path d=\"M 45.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />","<path d=\"M 55.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />","<path d=\"M 45.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />","<path d=\"M 35.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />","<path d=\"M 55.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"};
    	int length = corners.length;

	    for(int i = 0; i < length; i++)
	    	if(keys == corners[i])
	    		return true;

	    return false;
    }
	
	public static boolean createFile(String fileName)
	{
		try 
		{
			File myObj = new File(fileName + ".svg");
			  
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				return true;
			}
			else 
			{
				System.out.println("Failed to create file, file may already exist, please delete file, or move file");
				return false;
			}
		} 
		catch (IOException e) 
		{
		  System.out.println("An error occurred.");
		  e.printStackTrace();
		}
		return false;
	}
}
