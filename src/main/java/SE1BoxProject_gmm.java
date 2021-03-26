/**
 * SE1 Laser Box Project
 * Marlon Miller Matute, Garrett Powell, Michael Thorson
 */
 
import java.io.File; 
import java.io.IOException;
import java.util.*;
import java.io.*;

/*WIP
class Side
{
    String type;
    int sideLength, sideWidth;
    double depth;
    int xCoord, yCoord;

    public static bool print()
    {
        return true;
    }
}

class Box
{
    int l, w, h;
    bool hasTop = true;
    Side[] sides;
    double depth;
    String fileName;

    public Box(String name, bool top, int length, int width, int height, double thickness)
    {
        fileName = name;
        l = length;
        w = width;
        h = height;
        depth = thickness;

        //Check x/y coordinate order!!!
        if(hasTop)
        {
            sides = new Side[6];
            
            sides[0].type = "A";
            sides[0].sideLength = l;
            sides[0].sideWidth = h;
            sides[0].depth = depth;
            sides[0].xCoord = 5;
            sides[0].yCoord = 5;

            sides[1].type = "B";
            sides[1].sideLength = w;
            sides[1].sideWidth = h;
            sides[1].depth = depth;
            sides[1].xCoord = 15 + l;
            sides[1].yCoord = 5;

            sides[2].type = "Bot";
            sides[2].sideLength = l;
            sides[2].sideWidth = w;
            sides[2].depth = depth;
            sides[2].xCoord = 25 + l + w;
            sides[2].yCoord = 5;

            sides[3].type = "A";
            sides[3].sideLength = l;
            sides[3].sideWidth = h;
            sides[3].depth = depth;
            sides[3].xCoord = 5;
            sides[3].yCoord = 15 + h;

            sides[4].type = "B";
            sides[4].sideLength = w;
            sides[4].sideWidth = h;
            sides[4].depth = depth;
            sides[4].xCoord = 15 + l;
            sides[4].yCoord = 15 + h;

            sides[5].type = "Top";
            sides[5].sideLength = l;
            sides[5].sideWidth = h;
            sides[5].depth = depth;
            sides[5].xCoord = 25 + l + w;
            sides[5].yCoord = 15 + w;
        }
        else
        {
            sides = new Side[5];

            sides[0].type = "A";
            sides[0].sideLength = l;
            sides[0].sideWidth = h;
            sides[0].depth = depth;
            sides[0].xCoord = 5;
            sides[0].yCoord = 5;

            sides[1].type = "B";
            sides[1].sideLength = w;
            sides[1].sideWidth = h;
            sides[1].depth = depth;
            sides[1].xCoord = 15 + l;
            sides[1].yCoord = 5;

            sides[2].type = "Bot";
            sides[2].sideLength = l;
            sides[2].sideWidth = w;
            sides[2].depth = depth;
            sides[2].xCoord = 25 + l + w;
            sides[2].yCoord = 5;

            sides[3].type = "A";
            sides[3].sideLength = l;
            sides[3].sideWidth = h;
            sides[3].depth = depth;
            sides[3].xCoord = 5;
            sides[3].yCoord = 15 + h;

            sides[4].type = "B";
            sides[4].sideLength = w;
            sides[4].sideWidth = h;
            sides[4].depth = depth;
            sides[4].xCoord = 15 + l;
            sides[4].yCoord = 15 + h;
        }
    }

    public void printBox()
    {
        if(hasTop)
        {
            for(int i = 0; i < sides.length; i++)
            {
                sides[i].print();
            }
        }
        else
        {
            sides[0].print();
            sides[1].print();
            sides[2].print();
            sides[0].print();
            sides[1].print();
        }
    }
}
*/


public class SE1BoxProject_gmm
{
    public static String width = "0";
    public static String length = "0";
    public static String height = "0";
    public static String thickness = "0";
    public static String fileName;

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("\nEnter your SVG Filename: ");
        fileName = sc.nextLine();

		while((Integer.parseInt(width) < 4) || (Integer.parseInt(width) > 7))
		{
			System.out.print("Enter the width between (4.0-7.0)cm: ");
			width = sc.nextLine();
		}

       	while((Integer.parseInt(length) < 4) || (Integer.parseInt(length) > 7))
		{
			System.out.print("Enter the length between (4.0-7.0)cm: ");
			length = sc.nextLine();
		}
		
		while((Integer.parseInt(height) < 4) || (Integer.parseInt(height) > 8))
		{
			System.out.print("Enter the height between (4.0-8.0)cm: ");
			height = sc.nextLine();
		}

		while((Double.parseDouble(thickness) < .5) || (Double.parseDouble(thickness) > 1.5))
		{
			System.out.print("Enter the thickness of the material between (0.5-1.05)cm: ");
			thickness = sc.nextLine();
		}
       

        createFile(fileName);
    }
    
    public static boolean createFile(String fileName)
    {
        try 
        {
            File newFile = new File(fileName + ".svg");
            
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName() + " in project folder");

					//create new file writer and add xml header
                    BufferedWriter toFile = new BufferedWriter(new FileWriter(newFile));
                    toFile.write("<?xml version='1.0' encoding='us-ascii'?>");
                    toFile.write("\n<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">");
                    toFile.write("\n<g id=\"dovetail\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">");

					//create first side of box
                    String newPath = pathCreation(length, width, height);
                    System.out.println("New path created as: " + newPath); // here
                    toFile.write("\n"+newPath);
					
					//add xml file footers
                    toFile.write("\n</g>");
                    toFile.write("\n</svg>");
                    toFile.close();
					
                return true;
            }
            else 
            {
                System.out.println("Failed to create file, file may already exist, please delete file, or move file");
				System.out.print("\nEnter a different SVG Filename: ");
				Scanner sc = new Scanner(System.in);
				fileName = sc.nextLine();
				createFile(fileName);
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

    public static String pathCreation(String length, String width, String height)
    {
        // v -> (+)up or (-)down
        // h -> (-)left or (+)right
        // width and height
        String example = "<path d=\"M 35.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";
        String svg = "  <path d=\"M 35.0 35.0 "; // v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";

        int w = Integer.parseInt(width);
        int l = Integer.parseInt(length);
        int h = Integer.parseInt(height);

        int base[] = {w,l,w,l};
        int shortWalls[] = {h,w,h,w};
        int longWalls[] = {h,l,h,l};

        for(int i = 0; i < 4; i++)
        {
            String negative = "-";
            String empty = "";

            if(i >= 2) { // alternate walls to form square
                negative = "";
                empty = "-";
            }

            if(i % 2 == 0) 
            {
                int j = 0, count = 0;
                while(j < base[i])
                {
                    if(count % 2 == 0) {
                        svg += "v ";
                        j++;
                    }
                    else
                        svg += "h ";

                    if(!(count % 3 == 0) || count == 0)
                            svg += negative; // "-"
                    else {
                        count = -1;
                        svg += empty;
                    }

                    svg += "1.0 ";
                    count++;
                }
            }

            else
            {
                int j = 0, count = 0;
                while(j < base[i])
                {
                    boolean add = false;
                    if(count % 2 == 0) {
                        svg += "h ";
                        add = true;
                    }
                    else
                        svg += "v ";

                    if(add && (j == 0 || (j+2) == base[i])) {
                        svg += negative + "2.0 "; // "-"
                        j += 2;
                        count += 2;
                    }
                    else 
                    {
                        if(!(count % 3 == 0) || count == 0)
                            svg += negative;
                        else {
                            count = -1;
                            svg += empty;
                        }

                        svg += "1.0 ";
                        if(add)
                            j++;
                    }

                    count++;
                }
            }
        }
		
		//add end of path specifications
        svg += "\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";
		
        return svg;
    }
}

