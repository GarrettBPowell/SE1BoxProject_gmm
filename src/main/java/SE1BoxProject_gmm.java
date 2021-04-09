/**
 * SE1 Laser Box Project
 * Marlon Miller Matute, Garrett Powell, Michael Thorson
 *
 */
 
import java.io.File; 
import java.io.IOException;
import java.util.*;
import java.io.*;

class Side
{
    public String type;
    public int sideLength, sideWidth;
    public double depth;
    public int xCoord, yCoord;

    public Side(String letter, int length, int width, double deep, int x, int y)
    {
        this.type = letter;
        this.sideLength = length;
        this.sideWidth = width;
        this.depth = deep;
        this.xCoord = x;
        this.yCoord = y;
    }

    public String printSide()
    {
        String sidereturn = this.type + " " + this.sideLength + " " + this.sideWidth + " " + this.depth + " " + this.xCoord + " " + this.yCoord;
        
        System.out.println("\nProperties of Side: ");
        System.out.println("Type: "+ this.type);
        System.out.println("sideLength: "+ this.sideLength);
        System.out.println("sideWidth: "+ this.sideWidth);
        System.out.println("Depth: "+ this.depth);
        System.out.println("xCoord: "+ this.xCoord);
        System.out.println("yCoord: "+ this.yCoord);
        
        return sidereturn;
    }
}
class Box //extends Side
{
    public int l, w, h;
    public boolean hasTop;
    public Side[] sides = new Side[6];
    public double depth;
    public String fileName;

    public Box(String name, boolean top, int length, int width, int height, double thickness)
    {
        fileName = name;
        hasTop = top;
        l = length;
        w = width;
        h = height;
        depth = thickness;

        sides[0] = new Side("A",l,h,depth,5,5);
        sides[1] = new Side("B",w,h,depth,15+l,5);
        sides[2] = new Side("Bot",l,w,depth,25+l+w,5);
        sides[3] = new Side("A",l,h,depth,5,15+h);
        sides[4] = new Side("B",w,h,depth,15+l,15+h);

        if(hasTop)
            sides[5] = new Side("Top",l,w,depth,25+l+w,15+w);
    }

    public String printBox()
    {
        String boxreturn = "";
        
        if(hasTop)
        {
            for(int i = 0; i < sides.length; i++)
            {
                //System.out.println(sides[i].type);//sides[i].print();
                boxreturn = boxreturn + sides[i].printSide() + "\n";
            }
            return boxreturn;
        }
        else
        {
            return boxreturn;
            // sides[0].print();
            // sides[1].print();
            // sides[2].print();
            // sides[0].print();
            // sides[1].print();
        }
    }
}

public class SE1BoxProject_gmm
{
    public static String width = "0";
    public static String length = "0";
    public static String height = "0";
    public static String thickness = "0";
    public static String fileName = "empty";
    public static String topBox = "NULL"; // here
    public static boolean top = false;

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nWelcome to your Box Creator!");
        System.out.print("\nEnter your SVG Filename: ");
        fileName = sc.nextLine();

        System.out.print("\nPlease enter the dimensions of the box.\n");

        System.out.print("Enter the width between (4.0-7.0)cm: ");
        width = sc.nextLine();
        System.out.print("Enter the length between (4.0-7.0)cm: ");
        length = sc.nextLine();
        System.out.print("Enter the height between (4.0-8.0)cm: ");
        height = sc.nextLine();

        // while((Integer.parseInt(width) < 4) || (Integer.parseInt(width) > 7))
        // {
        //     System.out.print("Enter the width between (4.0-7.0)cm: ");
        //     width = sc.nextLine();
        // }

        // while((Integer.parseInt(length) < 4) || (Integer.parseInt(length) > 7))
        // {
        //     System.out.print("Enter the length between (4.0-7.0)cm: ");
        //     length = sc.nextLine();
        // }
        
        // while((Integer.parseInt(height) < 4) || (Integer.parseInt(height) > 8))
        // {
        //     System.out.print("Enter the height between (4.0-8.0)cm: ");
        //     height = sc.nextLine();
        // }

        while((Double.parseDouble(thickness) < .5) || (Double.parseDouble(thickness) > 1.5))
        {
            System.out.print("Enter the thickness of the material between (0.5-1.05)cm: ");
            thickness = sc.nextLine();
        }

        while(!(topBox.equals("Y")) && !(topBox.equals("N")))
        {
            System.out.print("Do you wish to have a top layer on your box? (Y/N) ");
            topBox = sc.nextLine();
        }

        if(topBox.equals("Y"))
            top = true;
        //Box newBox1 = new Box("Test",true,1,1,1,0.50);
        //Box newBox = new Box(fileName,top,Integer.parseInt(length),Integer.parseInt(width),Integer.parseInt(height),Double.parseDouble(thickness));
        //newBox.printSide();
        // newBox.printBox();
        // System.out.println(newBox.sides[5].type+" This line printed too!");
        // newBox.sides[0].printSide();
        //testBoxClass();
        createFile(fileName);
    }
    
    public static void testBoxClass()
    {
        // boolean top = false;
        // if(topBox.equals("Y"))
        //     top = true;
        // Box newBox = new Box(fileName,top,Integer.parseInt(length),Integer.parseInt(width),Integer.parseInt(height),Double.parseDouble(thickness));
        // newBox.printBox();
    }

    public static boolean createFile(String fileName)
    {
        try 
        {
            File newFile = new File(fileName + ".svg");
            Box newBox = new Box(fileName,top,Integer.parseInt(length),Integer.parseInt(width),Integer.parseInt(height),Double.parseDouble(thickness));
            //newBox.printSide();
            
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName() + " in project folder");

                    //create new file writer and add xml header
                    BufferedWriter toFile = new BufferedWriter(new FileWriter(newFile));
                    toFile.write("<?xml version='1.0' encoding='us-ascii'?>");
                    toFile.write("\n<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">");
                    toFile.write("\n<g id=\"dovetail\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">");

                    //create first side of box
                    for(int i = 1; i <= 2; i++)
                    {
                        for(int j = 1; j <= 3; j++)
                        {
                            String newPath = pathCreation((Integer.parseInt(length)+10)*j,(Integer.parseInt(length)+10)*i);//(10*j,10*i)
                            System.out.println("New path created as: " + newPath + "\n"); // here
                            toFile.write("\n"+newPath);
                        }
                    }
                    // String newPath = pathCreation();
                    // System.out.println("New path created as: " + newPath); // here
                    // toFile.write("\n"+newPath);
                    
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

    public static String pathCreation(int xCoordinate, int yCoordinate)
    {
        // v -> (+)up or (-)down
        // h -> (-)left or (+)right
        // width and height
        String example = "<path d=\"M 35.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";
        String svg = "  <path d=\"M "; // "" 35.0 35.0 "; // v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";
        svg += xCoordinate + ".0 " + yCoordinate + ".0";

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
