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
    public boolean hasLetter;
    public int letter;
    public int letterSize;

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
    public String letter = "NULL";
    public String letterSide;
    public int letterLocation;
    public int letterSize;

    public String ending = ")\"/>";
    public String[] letters = new String[26];
    public int[] letterSizes = {2,4,8,12};
    public double letterX, letterY;

    public Box(String name, boolean top, int length, int width, int height, double thickness, String side, String letter)
    {
        fileName = name;
        hasTop = top;
        l = length;
        w = width;
        h = height;
        depth = thickness;
        this.letter = letter;
        letterSide = side;

        sides[0] = new Side("A",l,h,depth,1,1); // new Side("A",l,h,depth,5,5);
        sides[1] = new Side("A",l,h,depth,2+l,1);
        sides[2] = new Side("B",w,h,depth,3+l+l,1);
        sides[3] = new Side("B",w,h,depth,1,2+h);
        sides[4] = new Side("Bot",l,w,depth,2+w,2+h);

        if(hasTop)
            sides[5] = new Side("Top",l,w,depth,3+l+w,2+h);

        if(letter != "NULL")
        {
            letterLocation = locateLetter(letterSide);
            letterSize = sizeLetter(letterLocation);

            if(letterLocation == 0)
            {
                letterX = (((double)l / 2) + 1) - depth;
                letterY = ((double)h * 14/20) + 1;
            }
            else if(letterLocation == 2)
            {
                letterX = ((double)l * 2 + 3 + ((double)w /2)) - depth;
                letterY = ((double)h * 14/20) + 1;
            }
            else
            {
                letterX = ((3 + ((double)w + (double)l + ((double)l / 2)))) - depth;
                letterY = (((double)w * 14/20) + (double)h + 2);
            }
        }
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

    public int locateLetter(String location)
    {
        if(location.equals("TOP"))
            return 5;
        else if(location.equals("SIDE"))
        {
            if((Math.abs(sides[0].sideLength - sides[0].sideWidth)) <= (Math.abs(sides[2].sideLength - sides[2].sideWidth)))
                return 0;
            else
                return 2;
        }
        else
            return -1;
    }

    public int sizeLetter(int location)
    {
        double lowSide;

        if(sides[location].sideLength > sides[location].sideWidth)
        {
            lowSide = sides[location].sideWidth - (depth * 2);
        }
        else
        {
            lowSide = sides[location].sideLength - (depth * 2);
        }

        if(lowSide >= 12)
            return 3;
        else if(lowSide >= 8)
            return 2;
        else if(lowSide >= 4)
            return 1;
        else if(lowSide >= 2)
            return 0;
        else
            return -1;
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
    public static boolean hasLetter = false;
    public static String letter = "NULL";
    public static String letterLocation = "NULL";
    public static String response = "NULL";

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nWelcome to your Box Creator!");
        System.out.print("\nEnter your SVG Filename: ");
        fileName = sc.nextLine();

        System.out.print("\nPlease enter the dimensions of the box.\n");

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
                if(!(Double.parseDouble(thickness) < .1 || Double.parseDouble(thickness) > 1.0))
                    break;
            }
            System.out.print("Enter number for the thickness of the material between (0.1-1.0)cm: ");
            thickness = sc.nextLine();
        }

        while(!(topBox.equals("Y")) && !(topBox.equals("N")))
        {
            System.out.print("Do you wish to have a top layer on your box? (Y/N) ");
            topBox = sc.nextLine();
        }

        while(true)
        {
            System.out.print("Do you want to have a monogrammed letter on your box? (Y/N) ");
            response = sc.nextLine();
            if(response.equals("Y"))
            {
                hasLetter = true;
                break;
            }
            else if(response.equals("N"))
            {
                hasLetter = false;
                break;
            }
        }

        if(hasLetter)
        {
            while(!(letterLocation.equals("TOP") && topBox.equals("Y")) && !(letterLocation.equals("SIDE")))
            {
                System.out.println("Where do you want the letter to be placed on the box? (TOP/SIDE)");
                System.out.print("(Please only select \"TOP\" if your box has a top.) ");
                letterLocation = sc.nextLine();
            }

            while(true)
            {
                System.out.print("What letter do you want on your box? ");
                letter = sc.nextLine();
                if(letter.length() == 1)
                    if(Character.isLetter(letter.toCharArray()[0]))
                    {
                        break;   
                    }
            }
        }

        if(topBox.equals("Y"))
            top = true;
        
        Box newBox = new Box(fileName,top,Integer.parseInt(length),Integer.parseInt(width),Integer.parseInt(height),Double.parseDouble(thickness),letterLocation,letter);
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
        Box newBox = new Box(B.fileName,B.hasTop,B.w,B.l,B.h,B.depth,B.letterSide,B.letter);
        return Even_Odd_OddorEven(newBox,index);
    }

    public static String Even_Odd_OddorEven(Box B, int index)
    {
        String svg = "  <path class=\"st0\" d=\"M "; // 
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
                        neg = "-"; //movement++;
                        reverse = "-";
                    }
                    if(i == 0) {
                        neg = "";
                        reverse = "";
                    }

                    int jump = 0;
                    int beg = length-2;

                    if( i == 0) {
                        jump = length-2;
                        beg = 0;
                    }

                    while(movement < length)
                    {
                        if(((movement == length-2) && teeth % 2 == 0) && addTwo) {
                            svg += h+" "+reverse+"2.0 ";
                            movement += 2;
                            teeth++;
                        }
                        else if(((movement == 0) && teeth % 2 == 0) && addTwo) {
                            svg += h+" "+reverse+(2-B.sides[index].depth);
                            movement += 2;
                            teeth++;
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
            }  

            else // here
            {
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
                    if(((movement == 0 || movement+2 == length) && teeth % 2 == 0) && addTwo) {
                        svg += h+" "+reverse+(2-B.sides[index].depth); 
                        movement += 2;
                        teeth++;
                    }
                    else if(((movement == 0) && teeth % 2 == 0) && !addTwo) {
                        svg += h+" "+reverse+"2.0"; 
                        movement += 2;
                        teeth++;
                    }
                    else if(((movement+2 == length) && teeth % 2 == 0) && !addTwo) {
                        svg += h+" "+reverse+(2-B.sides[index].depth); 
                        movement += 2;
                        teeth++;
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
        }
        svg += "\"/>";
        return svg;
    }

    public static String Even_Even_EvenorOdd(Box B, int index)
    {
        String svg = "  <path class=\"st0\" d=\"M "; // 
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
                length = B.sides[index].sideWidth;
                v = "h"; h = "v"; 
                addTwo = false;
            }

            if(index <= 3)
            {
                boolean pass = true; // Even_Even_Odd
                if(B.h % 2 == 1)
                    pass = false;

                // if(B.h % 2 == 1 && i == 1) 
                //     length++;
                if(B.h % 2 == 1 && i == 3)
                    length--;
                
                if(B.h % 2 == 1 && i == 2) {
                    neg = "-";
                    reverse = "-"; 
                }
                if(B.h % 2 == 1 && i == 3) {
                    neg = "-";
                    reverse = "-";
                    length++;
                }

                int jump = 0;
                int beg = length-2;

                if( i == 0) {
                    jump = length-2;
                    beg = 0;
                }

                while(movement < length)
                {
                    if(((movement == 0) && teeth % 2 == 0) && addTwo && pass) {
                        svg += h+reverse+(2-B.sides[index].depth);
                        movement += 2;
                        teeth++;
                    }
                    else if(((movement+2 == length) && teeth % 2 == 0) && addTwo && pass) {
                        svg += h+reverse+"2.0";
                        movement += 2;
                        teeth++;
                    }

                    else if(((movement+1 == length) && teeth % 2 == 0) && !addTwo && pass) {
                        svg += h+reverse+(1-B.sides[index].depth);//B.sides[index].depth;
                        movement++;
                        teeth++;
                    }

                    //Even_Even_Odd
                    else if(( i == 3 && teeth % 2 == 0) && (movement == 0 || movement+1 == length) && !addTwo && !pass) {
                        svg += h+reverse+(1-B.sides[index].depth);
                        movement++;
                        teeth++;
                    }                 
                    else if(((movement == beg) && teeth % 2 == 0) && addTwo && !pass) {
                        svg += h+reverse+(2-B.sides[index].depth);
                        movement += 2;
                        teeth++;
                    }
                    else if(((movement == jump) && teeth % 2 == 0) && addTwo && !pass) {
                        svg += h+reverse+"2.0 ";
                        movement += 2;
                        teeth++;
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
            else
            {
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
                    boolean down = false;
                    if(movement == 0) {
                        svg += h+reverse+"2.0 "; 
                        movement += 2;
                        teeth++;
                    }
                    else if((movement+2 == length) && teeth % 2 == 0) {
                        svg += h+reverse+(2-B.sides[index].depth);
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
        }
        svg += "\"/>";
        return svg;
    }
    public static String Odd_Odd_OddorEven(Box B, int index)
    {
        // v -> (-)up or (+)down
        // h -> (-)left or (+)right
        // width and height
        String svg = "  <path class=\"st0\" d=\"M "; 
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

                if(i == 0) {
                    neg = "";
                    reverse = "";
                }

                if(i == 1) {
                    neg = "-";
                    reverse = "";
                }

                if(i == 2) {
                    neg = "-";
                    reverse = "-";
                }

                if(i == 3) {
                    reverse = "-";
                    neg = "-";
                }
                

                int jump = 0;
                int beg = length-2;

                if( i == 0) {
                    jump = length-2;
                    beg = 0;
                }

                while(movement < length)
                {
                    if(((movement == jump) && teeth % 2 == 0) && addTwo) {
                        svg += h+reverse+"2.0 ";//B.sides[index].depth*2; 
                        movement += 2;
                        teeth++;
                    }

                    else if(((movement == beg) && teeth % 2 == 0) && addTwo) {
                        svg += h+" "+reverse+(2-B.sides[index].depth); 
                        movement += 2;
                        teeth++;
                    }

                    else if((((movement == (length/2)-1) && teeth % 2 == 0) && !addTwo) && skip) { // Odd_Odd_Even
                        svg += h+reverse+"2.0";
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

                while(movement < length)
                {
                    boolean down = false;

                    if((movement == 0 || movement+2 == length) && teeth % 2 == 0) {
                        svg += h+reverse+(2-B.sides[index].depth);//B.sides[index].depth*2; 
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
        }
        svg += "\"/>";
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
                    toFile.write("<?xml version=\"1.0\" encoding=\"us-ascii\"?>");
                    toFile.write("\n<svg height=\"81.90cm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10cm\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">");
                    toFile.write("\n<style type=\"text/css\">\n.st0{fill:none;stroke:#000000;stroke-width:0.001;stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:4;}\n.st1{font-family:\"PerpetuaTitlingMT-Light\";}\n.st2{font-size:" + B.letterSizes[B.letterSize] + "px;}\n</style>");
                    toFile.write("\n<g id=\"dovetail\">");

                    int amount = 5;
                    if(B.hasTop)
                        amount++;

                    for(int i = 0; i < amount; i++) {
                        toFile.write("\n" + BoxType(B,i));
                        //System.out.println("New path created: " + BoxType(B,i));
                    }

                    toFile.write("\n</g>");
                    toFile.write("\n<text transform=\"matrix(1 0 0 1 " + B.letterX + "cm " + B.letterY + "cm)\" class=\"st1 st2\" alignment-baseline=\"center\" text-anchor=\"middle\" x=\"0\" y=\"0\">" + B.letter + "</text>");
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
}


