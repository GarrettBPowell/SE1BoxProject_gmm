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
    public static String width;
    public static String length;
    public static String height;
    public static String fileName;

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to your Box Creator!\nPlease enter the following measurements for the box.\n");

        System.out.print("\nEnter your SVG Filename: ");
        fileName = sc.nextLine();

        System.out.print("Enter the width between (0.0-100.0)cm: ");
        width = sc.nextLine();

        System.out.print("Enter the length between (0.0-100.0)cm: ");
        length = sc.nextLine();

        System.out.print("Enter the height between (0.0-100.0)cm: ");
        height = sc.nextLine();

        createFile(fileName);
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
                System.out.println("File created: " + newFile.getName() + " in project folder\n");

                    BufferedWriter toFile = new BufferedWriter(new FileWriter(fileName + ".svg"));
                    toFile.write("<?xml version='1.0' encoding='us-ascii'?>");
                    toFile.write("\n<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\" xmlns\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">");
                    toFile.write("\n<g id=\"dovetail\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">");

                    String newPath = pathCreation(width,height);
                    System.out.println("New path created as: "+newPath);
                    //toFile.write("\n"+newPath);

                    toFile.write("\n</g>");
                    toFile.write("\n</svg>");
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

    public static String pathCreation(String width, String height)
    {
        // v -> (+)up or (-)down
        // h -> (-)left or (+)right
        // width and height
        String example = "<path d=\"M 35.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";
        String svg = "<path d=\"M 35.0 35.0"; // v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";

        for(int i = 0; i < 4; i++)
        { 
            svg += " ";
            if(i % 2 == 0) {
                svg += "v ";
                if(i < 2) 
                    svg += "-" + height;
                else
                    svg += height;
            }

            else {
                svg += "h ";
                if(i < 2) 
                    svg += "-" + width;
                else
                    svg += width;
            }
        }

        svg += "\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";
        return svg;
    }
}
