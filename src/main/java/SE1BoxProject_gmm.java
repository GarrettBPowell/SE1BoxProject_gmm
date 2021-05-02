/**
 * SE1 Laser Box Project
 * Marlon Miller Matute, Garrett Powell, Michael Thorson
 
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

        sides[0] = new Side("A",l,h,depth,1,2); // new Side("A",l,h,depth,5,5);
        sides[1] = new Side("A",l,h,depth,2+l,2);
        sides[2] = new Side("B",w,h,depth,3+l+l,2);
        sides[3] = new Side("B",w,h,depth,1,3+h);
        sides[4] = new Side("Bot",l,w,depth,2+w,3+h);

        if(hasTop)
            sides[5] = new Side("Top",l,w,depth,3+l+w,3+h);
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

        while(true)
        {
            if(checkNum(width))
            {
                width = "" + ((int)Double.parseDouble(width));
                if(!(Integer.parseInt(width) < 5 || Integer.parseInt(width) > 17))
                    break;
            }
            System.out.print("Enter a whole number for the width between (5.0-17.0)cm: ");
            width = sc.nextLine();
        }

        while(true)
        {
            if(checkNum(length))
            {
                length = "" + ((int)Double.parseDouble(length));
                if(!(Integer.parseInt(length) < 5 || Integer.parseInt(length) > 17))
                    break;
            }
            System.out.print("Enter a whole number for the length between (5.0-17.0)cm: ");
            length = sc.nextLine();
        }


        while(true)
        {
            if(checkNum(height))
            {
                height = "" + ((int)Double.parseDouble(height));
                if(!(Integer.parseInt(height) < 5 || Integer.parseInt(height) > 19))
                    break;
            }
            System.out.print("Enter a whole number for the height between (5.0-19.0)cm: ");
            height = sc.nextLine();
        }
        
        while(true)
        {
            if(checkNum(thickness))
            {
                thickness = "" + (Double.parseDouble(thickness));
                if(!(Double.parseDouble(thickness) < .5 || Double.parseDouble(thickness) > 1.5))
                    break;
            }
            System.out.print("Enter number for the thickness of the material between (0.5-1.5)cm: ");
            thickness = sc.nextLine();
        }

        while(!(topBox.equals("Y")) && !(topBox.equals("N")))
        {
            System.out.print("Do you wish to have a top layer on your box? (Y/N) ");
            topBox = sc.nextLine();
        }

        if(topBox.equals("Y"))
            top = true;

        Box newBox = new Box(fileName,top,Integer.parseInt(length),Integer.parseInt(width),Integer.parseInt(height),Double.parseDouble(thickness));
        testBoxClass(newBox);
        //createFile(fileName);
    }
    
    public static boolean checkNum(String s)
    {
        try{
            if(!s.contains("."))
                Integer.parseInt(s);

            Double.parseDouble(s);

            return true;
        }
        catch (NumberFormatException e) 
        {
            return false;
        }
    }

    public static String removal(String path) {
        if(path.charAt(path.length()-1) == '-')
            path = path.substring(0,path.length()-1);
        return path;
    }

    public static String Odd_Even_EvenorOdd(Box B, int index)
    {
        Box newBox = new Box(B.fileName,B.hasTop,B.w,B.l,B.h,B.depth);
        return Even_Odd_OddorEven(newBox,index);
    }

    public static String Even_Odd_OddorEven(Box B, int index)
    {
        String svg = "  <path d=\"M "; // 
        svg += B.sides[index].xCoord + ".0 " + B.sides[index].yCoord + ".0 ";

        // Even_Odd_Odd 
        if((index == 0 || index == 1) && B.h % 2 == 1) // Sides A ...correct
            return Even_Even_EvenorOdd(B,index);
        if((index == 2 || index == 3) && B.h % 2 == 1) // Sides B ...Even_Odd_Odd works
            return Odd_Odd_OddorEven(B,index);

        // Even_Odd_Even
        for(int i = 0; i < 4; i++)
        {
            String neg = "-";
            String reverse = "";
            String v = "v";
            String h = "h";

            if(i >= 2) {
                neg = "";
                reverse = "-";
            }
            
            boolean addTwo = true;
            int movement = 0, teeth = 0;
            int length = B.sides[index].sideLength;

            if(i % 2 == 1) {
                length = B.sides[index].sideWidth;
                v = "h"; h = "v"; 
                addTwo = false;
            }

            if(index <= 3)
            {
                if((index == 0 || index == 1) && B.h % 2 == 0) // Sides A
                    return Even_Even_EvenorOdd(B,index);
                else
                {                  
                    if(i == 2) {
                        neg = "-"; movement++;
                        reverse = "-";
                    }

                    while(movement < length)
                    {
                        if(((movement+2 == length) && teeth % 2 == 0) && addTwo) {
                            svg += h+" "+reverse+B.sides[index].depth*2;
                            movement += 2;
                            teeth++;
                        }

                        else 
                        {
                            if(teeth % 2 == 0) {
                                svg += h+" "+reverse;
                                movement++;
                            }
                            else
                                svg += v+" "+neg;

                            if(teeth % 3 == 0 && teeth != 0) {
                                teeth = 0;
                                if(neg == "-")
                                    svg = removal(svg);
                                else
                                    svg += "-";
                            }

                            else {
                                teeth++;
                            }

                            svg += B.sides[index].depth;
                        }
                    }
                }
            }  

            else // here
            {
                if(i % 2 == 0)
                    length--;
                if(i == 1) {
                    neg = "";
                    reverse = "";
                }
                if(i == 3) {
                    neg = "-";
                    reverse = "-";
                }

                while(movement < length-1)
                {
                    if(((movement == 0) && teeth % 2 == 0) && !addTwo) {
                        svg += h+" "+reverse+B.sides[index].depth*2; 
                        movement += 2;
                        teeth++;
                    }

                    else 
                    {
                        if(teeth % 2 == 0) {
                            svg += h+" "+reverse;
                            movement++;
                        }
                        else
                            svg += v+" "+neg;

                        if(teeth % 3 == 0 && teeth != 0) {
                            teeth = 0;
                            if(neg == "-")
                                svg = removal(svg);
                            else
                                svg += "-";
                        }

                        else {
                            teeth++;
                        }

                        svg += B.sides[index].depth;
                    }
                }
            }
        }

        svg += "\" stroke=\"rgb(255,255,255)\" stroke-width=\"0.001\" />";
        return svg;
    }

    public static String Even_Even_EvenorOdd(Box B, int index)
    {
        String svg = "  <path d=\"M "; // 
        svg += B.sides[index].xCoord + ".0 " + B.sides[index].yCoord + ".0 ";

        for(int i = 0; i < 4; i++)
        {
            String neg = "-";
            String reverse = "";
            String v = "v";
            String h = "h";

            if(i >= 2) {
                neg = "";
                reverse = "-";
            }

            boolean addTwo = true;
            int movement = 0, teeth = 0;
            int length = B.sides[index].sideLength;

            if(i % 2 == 1) {
                length = B.sides[index].sideWidth-1;
                v = "h"; h = "v"; 
                addTwo = false;
            }

            if(index <= 3)
            {
                if(B.h % 2 == 1 && i == 1) 
                    length++;
                if(B.h % 2 == 1 && i == 3)
                    length--;
                
                if(B.h % 2 == 1 && i == 2) {
                    neg = "-";
                    reverse = "-";
                }

                while(movement < length)
                {
                    if(((movement == 0 || movement+2 == length) && teeth % 2 == 0) && addTwo) {
                        svg += h+" "+reverse+B.sides[index].depth*2;//"2.0 ";
                        movement += 2;
                        teeth++;
                    }

                    else 
                    {
                        if(teeth % 2 == 0) {
                            svg += h+" "+reverse;
                            movement++;
                        }
                        else
                            svg += v+" "+neg;

                        if(teeth % 3 == 0 && teeth != 0) {
                            teeth = 0;
                            if(neg == "-")
                                svg = removal(svg);
                            else
                                svg += "-";
                        }

                        else {
                            teeth++;
                        }

                        svg += B.sides[index].depth;//
                    }
                }
            }
            else
            {
                if(i % 2 == 0)
                    length--;

                if(i == 1) {
                    neg = "";
                    reverse = "";
                }
                if(i == 3) {
                    neg = "-";
                    reverse = "-";
                }

                while(movement < length)
                {
                    if(movement == 0) {
                        svg += h+" "+reverse+B.sides[index].depth*2;//"2.0 "; 
                        movement += 2;
                        teeth++;
                    }

                    else 
                    {
                        if(teeth % 2 == 0) {
                            svg += h+" "+reverse;
                            movement++;
                        }
                        else
                            svg += v+" "+neg;

                        if(teeth % 3 == 0 && teeth != 0) {
                            teeth = 0;
                            if(neg == "-")
                                svg = removal(svg);
                            else
                                svg += "-";
                        }

                        else {
                            teeth++;
                        }

                        svg += B.sides[index].depth;//
                    }
                }
            }
        }

        svg += "\" stroke=\"rgb(255,255,255)\" stroke-width=\"0.001\" />";
        return svg;
    }
    public static String Odd_Odd_OddorEven(Box B, int index)
    {
        // v -> (-)up or (+)down
        // h -> (-)left or (+)right
        // width and height
        String svg = "  <path d=\"M "; // "" 35.0 35.0 "; // v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />";
        svg += B.sides[index].xCoord + ".0 " + B.sides[index].yCoord + ".0 ";

        for(int i = 0; i < 4; i++)
        {
            String neg = "-";
            String reverse = "";
            String v = "v";
            String h = "h";

            boolean addTwo = true;
            int length = B.sides[index].sideLength;
            int movement = 0, teeth = 0;

            if(i % 2 == 1) {
                length = B.sides[index].sideWidth;
                v = "h"; h = "v"; 
                addTwo = false;
            }
                
            if(i >= 2)
            {
                neg = "";
                reverse = "-";
            }

            if(index <= 3)
            {
                boolean skip = false;
                if(B.l % 2 == 1 && B.w % 2 == 1 && B.h % 2 == 0)
                    skip = true; // here Odd_Odd_Even

                if(i == 2) {
                    neg = "-";
                    reverse = "-";
                }

                if(i == 3)
                    movement++;

                int jump = 0;
                if( i == 0) 
                    jump = length-2;

                while(movement < length)
                {
                    if(((movement == jump) && teeth % 2 == 0) && addTwo) {
                        svg += h+" "+reverse+B.sides[index].depth*2; 
                        movement += 2;
                        teeth++;
                    }

                    else if((((movement == (length/2)-1) && teeth % 2 == 0) && !addTwo) && skip) {
                        svg += h+" "+reverse+B.sides[index].depth*2;
                        movement+= 2; teeth++;
                    }

                    else 
                    {
						boolean down = false;
                        if(teeth % 2 == 0) {
                            svg += h+" "+reverse;
                            movement++;
                        }
                        else
                            svg += v+" "+neg;

                        if(teeth % 3 == 0 && teeth != 0) {
                            teeth = 0; down = true;
                            if(neg == "-")
                                svg = removal(svg);
                            else
                                svg += "-";
                        }

                        else {
                            teeth++;
                        }

						if(teeth == 2 || down)
							svg += B.sides[index].depth;
						else
							svg += "1.0";
                    }
                }
            }
            else // top and bottom
            {
                if(i == 1) {
                    neg = "";
                    reverse = "";
                }
                if(i == 3) {
                    neg = "-";
                    reverse = "-";
                }

                movement++;
                while(movement < length-1)
                {
					boolean down = false;
					if(teeth % 2 == 0) {
						svg += h+" "+reverse;
						movement++;
					}
					else
						svg += v+" "+neg;

					if(teeth % 3 == 0 && teeth != 0) {
						teeth = 0; down = true;
						if(neg == "-")
							svg = removal(svg);
						else
							svg += "-";
					}

					else {
						teeth++;
					}

					if(teeth == 2 || down)
						svg += B.sides[index].depth;
					else
						svg += "1.0";
                }
            }
        }

        svg += "\" stroke=\"rgb(255,255,255)\" stroke-width=\"0.001\" />";
        return svg;
    }

    public static String BoxType(Box B, int index)
    {
        if(B.l % 2 == 1 && B.w % 2 == 1 && ((B.h % 2 == 1 || B.h % 2 == 0))) 
            return Odd_Odd_OddorEven(B,index);
        if(B.l % 2 == 0 && B.w % 2 == 0 && ((B.h % 2 == 0 || B.h % 2 == 1)))
            return Even_Even_EvenorOdd(B,index);
        if(B.l % 2 == 0 && B.w % 2 == 1 && ((B.h % 2 == 1) || (B.h % 2 == 0)))
            return Even_Odd_OddorEven(B,index);

        return Odd_Even_EvenorOdd(B,index);
    }
    
    public static boolean testBoxClass(Box B)
    {
        try 
        {
            File newFile = new File(fileName + ".svg");
            
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName() + " in project folder");

                    //create new file writer and add xml header
                    BufferedWriter toFile = new BufferedWriter(new FileWriter(newFile));
                    toFile.write("<?xml version='1.0' encoding='us-ascii'?>");
                    toFile.write("\n<svg height=\"81.90cm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10cm\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">");
                    toFile.write("\n<g id=\"dovetail\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">");

                    int amount = 5;
                    if(B.hasTop)
                        amount++;

                    for(int i = 0; i < amount; i++) {
                        toFile.write("\n" + BoxType(B,i));
                        System.out.println("New path created: " + BoxType(B,i));
                    }

                    // toFile.write("\n" + BoxType(B,4));
                    // System.out.println("New path created: " + BoxType(B,4));
                    // toFile.write("\n" + BoxType(B,5));
                    // System.out.println("New path created: " + BoxType(B,5));
                    
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
                testBoxClass(B);
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


    public static String sixSides(int xCoordinate, int yCoordinate)
    {
        // v -> (+)up or (-)down
        // h -> (-)left or (+)right
        // width and height
        String example = "<path d=\"M 35.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,255,255)\" stroke-width=\"0.001\" />";
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
        svg += "\" stroke=\"rgb(255,255,255)\" stroke-width=\"0.001\" />";
        
        return svg;
    }


    // here stop
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
        String example = "<path d=\"M 35.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,255,255)\" stroke-width=\"0.001\" />";
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
        svg += "\" stroke=\"rgb(255,255,255)\" stroke-width=\"0.001\" />";
        
        return svg;
    }
}


