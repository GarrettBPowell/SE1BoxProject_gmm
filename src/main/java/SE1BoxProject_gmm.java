/**
 * SE1 Laser Box Project
 * Marlon Miller Matute, Garrett Powell, Michael Thorson
 */
 
import java.io.File; 
import java.io.IOException;
import java.util.*;
import java.io.*;

public class SE1BoxProject_gmm
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to your Box Creator!\nPlease enter the following measurements for the box.\n");

        System.out.print("Enter the width between (0.0-100.0)cm: ");
        String Str = sc.nextLine();
        float width = Float.parseFloat(Str); 

        System.out.print("Enter the length between (0.0-100.0)cm: ");
        Str = sc.nextLine();
        float length = Float.parseFloat(Str); 

        System.out.print("Enter the height between (0.0-100.0)cm: ");
        Str = sc.nextLine();
        float height = Float.parseFloat(Str); 

        System.out.print("You have entered: "+ (width+1) + "\n");
        System.out.print("You have entered: "+ (length+1) + "\n");
        System.out.print("You have entered: "+ (height+1) + "\n");
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
			File newFile = new File(fileName + ".svg");
			
     
			if (newFile.createNewFile()) {
				System.out.println("File created: " + newFile.getName() + " in project folder");

					BufferedWriter toFile = new BufferedWriter(new FileWriter(fileName + ".svg"));
					toFile.write("<?xml version='1.0' encoding='us-ascii'?>");
					toFile.write("\n<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\" xmlns\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">");
					toFile.close();
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
