import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;

import java.io.File; 
import java.io.IOException;
import java.util.*;
import java.io.*;

/**
import org.junit.*;
**/

public class SE1BoxProject_gmmTest
{
     SE1BoxProject_gmm box;
    
    @Before
    public void initialize() {
    box = new SE1BoxProject_gmm();
    }

    @Test
    public void fileCreation()
    {
        try{
            int randA = (int)(Math.random() * 10000);
            int randB = (int)(Math.random() * 10000);
            
            assertTrue(box.createFile("Test fileCreation " + randA + " " + randB));
        }
        catch (Exception e) {
            System.out.println("Test fileCreation: Failed to create file, file may already exist, please delete file, or move file");
        }
    }

    @Test
    public void fileCreationAndRead()
    {
        try{
            int randA = (int)(Math.random() * 10000);
            int randB = (int)(Math.random() * 10000);
            File newFile = new File("Test fileCreationAndRead " + randA + " " + randB + ".svg");
            
            //file made
            assertTrue(box.createFile("Test fileCreationAndRead " + randA + " " + randB));
            
            //create file reader
            BufferedReader fromFile = new BufferedReader(new FileReader(newFile)); 
            
            //assert strings
            String firstLine = "<?xml version='1.0' encoding='us-ascii'?>";
            String secondLine = "<svg height=\"81.90mm\" viewBox=\"0.0 0.0 120.10 81.90\" width=\"120.10mm\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:cc=\"http://creativecommons.org/ns#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:inkscape=\"http://www.inkscape.org/namespaces/inkscape\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:svg=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">";
            String thirdLine = "<g id=\"dovetail\" style=\"fill:none;stroke-linecap:round;stroke-linejoin:round;\">";

            String fourthLine = "</g>";
            String fifthLine = "</svg>";
            
            assertEquals(firstLine, fromFile.readLine());
            assertEquals(secondLine, fromFile.readLine());
            assertEquals(thirdLine, fromFile.readLine());

            fromFile.readLine();
            
            assertEquals(fourthLine, fromFile.readLine());
            assertEquals(fifthLine, fromFile.readLine());
        }
        catch (Exception e) {
            System.out.println("Failed to create file, file may already exist, please delete file, or move file");
        }
    }


    @Test
    public void addPath9()
    {
        String  svgPath = "";
        try{
            String width = "9";
            String height = "9";
            String length = "9";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 9\n " + svgPath);
        }
    }

    @Test
    public void addPath8()
    {
        String  svgPath = "";
        try{
            String width = "8";
            String height = "8";
            String length = "8";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 8 \n" + svgPath);
        }
    }
    
    @Test
    public void addPath7()
    {
        String  svgPath = "";
        try{
            String width = "7";
            String height = "7";
            String length = "7";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 7 \n" + svgPath);
        }
    }

    @Test
    public void addPath6()
    {
       String  svgPath = "";
        try{
            String width = "6";
            String height = "6";
            String length = "6";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 6 \n" + svgPath);
        }
    }

    @Test
    public void addPath5()
    {
        String  svgPath = "";
        try{
            String width = "5";
            String height = "5";
            String length = "5";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 5 \n" + svgPath);
        }
    }
    
    @Test
    public void addPath4()
    {
        String  svgPath = "";
        try{
            String width = "4";
            String height = "4";
            String length = "4";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h -2.0 v 1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h 2.0 v -1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 4 \n" + svgPath );
        }
    }
    
        @Test
    public void addPath3()
    {
        String  svgPath = "";
        try{
            String width = "3";
            String height = "3";
            String length = "3";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 2.0 v -1.0 h 1.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 3 \n" + svgPath);
        }
    }
    
    @Test
    public void addPath448()
    {
        String  svgPath = "";
        try{
            String length = "4";
            String width = "4";
            String height = "8";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h -2.0 v 1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h 2.0 v -1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 4,4,8 \n" + svgPath);
        }
    }
    
    @Test
    public void addPath456()
    {
        String  svgPath = "";
        try{
            String width = "4";
            String length = "5";
            String height = "6";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 4,5,6 \n" + svgPath);
        }
    }
    
    @Test
    public void addPath774()
    {
        String  svgPath = "";
        try{
            String width = "7";
            String length = "7";
            String height = "4";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 7,7,4 \n" + svgPath);
        }
    }
    
    @Test
    public void addPath778()
    {
        String  svgPath = "";
        try{
            String width = "7";
            String length = "7";
            String height = "8";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 7,7,8 \n" + svgPath);
        }
    }
    
    @Test
    public void addPath444()
    {
        String  svgPath = "";
        try{
            String width = "4";
            String length = "4";
            String height = "4";
            svgPath = box.pathCreation(length, width, height);
            assertEquals("  <path d=\"M 35.0 35.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h -2.0 v 1.0 h -2.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h 2.0 v -1.0 h 2.0 \" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />", svgPath);
        }
        catch (Exception e) {
            System.out.println("Failed to create path of size 4,4,4 \n" + svgPath);
        }
    }
    
    @Test
    public void makeBox444()
    {
        String expect = "A 4 4 1.0 5 5\nA 4 4 1.0 19 5\nB 4 4 1.0 33 5\nB 4 4 1.0 5 19\nBot 4 4 1.0 19 19\nTop 4 4 1.0 33 19\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 4, 4, 4, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box 4 by 4 by 4");
        }
    }
    
    @Test
    public void makeBox555()
    {
        String expect = "A 5 5 0.5 5 5\nA 5 5 0.5 20 5\nB 5 5 0.5 35 5\nB 5 5 0.5 5 20\nBot 5 5 0.5 20 20\nTop 5 5 0.5 35 20\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 0.5);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box 5 by 5 by 5");
        }
    }
    
    @Test
    public void makeBox666()
    {
        String expect = "A 6 6 1.0 5 5\nA 6 6 1.0 21 5\nB 6 6 1.0 37 5\nB 6 6 1.0 5 21\nBot 6 6 1.0 21 21\nTop 6 6 1.0 37 21\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 6, 6, 6, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box 6 by 6 by 6");
        }
    }
    
    @Test
    public void makeBox777()
    {
        String expect = "A 7 7 1.0 5 5\nA 7 7 1.0 22 5\nB 7 7 1.0 39 5\nB 7 7 1.0 5 22\nBot 7 7 1.0 22 22\nTop 7 7 1.0 39 22\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 7, 7, 7, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box 7 by 7 by 7");
        }
    }

    @Test
    public void makeBox456()
    {
        String expect = "A 4 6 1.0 5 5\nA 4 6 1.0 19 5\nB 5 6 1.0 34 5\nB 5 6 1.0 5 21\nBot 4 5 1.0 19 21\nTop 4 5 1.0 34 20\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 4, 5, 6, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }

    @Test
    public void makeBox567()
    {
        String expect = "A 5 7 1.0 5 5\nA 5 7 1.0 20 5\nB 6 7 1.0 36 5\nB 6 7 1.0 5 22\nBot 5 6 1.0 20 22\nTop 5 6 1.0 36 21\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 6, 7, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void makeBox191921()
    {
        String expect = "A 19 21 1.0 5 5\nA 19 21 1.0 34 5\nB 19 21 1.0 63 5\nB 19 21 1.0 5 36\nBot 19 19 1.0 34 36\nTop 19 19 1.0 63 34\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 19, 19, 21, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void makeBox19194()
    {
        String expect = "A 19 4 1.0 5 5\nA 19 4 1.0 34 5\nB 19 4 1.0 63 5\nB 19 4 1.0 5 19\nBot 19 19 1.0 34 19\nTop 19 19 1.0 63 34\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 19, 19, 4, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void makeBox4421()
    {
        String expect = "A 4 21 1.0 5 5\nA 4 21 1.0 19 5\nB 4 21 1.0 33 5\nB 4 21 1.0 5 36\nBot 4 4 1.0 19 36\nTop 4 4 1.0 33 19\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 4, 4, 21, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void makeBox41921()
    {
        String expect = "A 4 21 1.0 5 5\nA 4 21 1.0 19 5\nB 19 21 1.0 48 5\nB 19 21 1.0 5 36\nBot 4 19 1.0 19 36\nTop 4 19 1.0 48 34\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 4, 19, 21, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void makeBox19421()
    {
        String expect = "A 19 21 1.0 5 5\nA 19 21 1.0 34 5\nB 4 21 1.0 48 5\nB 4 21 1.0 5 36\nBot 19 4 1.0 34 36\nTop 19 4 1.0 48 19\n";
        String filename = "Make box";
        Box newBox = new Box(filename, true, 19, 4, 21, 1.0);
        try{
            assertEquals(expect, newBox.printBox());
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Odd_Odd_OddorEven555SideA()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 1.0);
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 0).contains("M 5.0 5.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 h 1.0v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Odd_Odd_OddorEven555SideB()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 1.0);
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 1).contains("M 20.0 5.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 h 1.0v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Odd_Odd_OddorEven555SideA2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 1.0);
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 2).contains("M 35.0 5.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 h 1.0v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Odd_Odd_OddorEven555SideB2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 1.0);
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 3).contains("M 5.0 20.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 h 1.0v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Odd_Odd_OddorEven555SideBot()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 1.0);
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 4).contains("M 20.0 20.0 v -1.0 h 1.0 v -1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Odd_Odd_OddorEven555SideTop()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 1.0);
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 5).contains("M 35.0 20.0 v -1.0 h 1.0 v -1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Even_Even_EvenorOddA1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 10, 8, 12, 1.0);
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 0).contains("M 5.0 5.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Even_Even_EvenorOddA2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 10, 8, 12, 1.0);
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 1).contains("M 25.0 5.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));        
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Even_Even_EvenorOddB1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 10, 8, 12, 1.0);
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 2).contains("M 43.0 5.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Even_Even_EvenorOddB2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 10, 8, 12, 1.0);
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 3).contains("M 5.0 27.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
    @Test
    public void Even_Even_EvenorOddTop()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 10, 8, 12, 1.0);
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 4).contains("M 25.0 27.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 2.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -2.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
        }
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	@Test
    public void Odd_Even_Odd_A_and_Bot()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 6, 7, 1.5);
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 0).contains("M 5.0 5.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
			assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 4).contains("M 21.0 22.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 2.0 h 1.0 v 1.0 h -1.0 v 1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -2.0 h -1.0 v -1.0 h 1.0 v -1.0"));
		}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	@Test
    public void Odd_Even_Even_A2_and_B2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 5, 6, 6, 1.0);
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 1).contains("M 21.0 5.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
			assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 3).contains("M 5.0 21.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
		}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	@Test
    public void Even_Odd_Odd_A2_and_Top()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 8, 9, 11, 0.5);
        try{
            assertTrue(classTest.Even_Odd_OddorEven(newBox, 1).contains("M 23.0 5.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
			assertTrue(classTest.Even_Odd_OddorEven(newBox, 5).contains("M 42.0 24.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 2.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -2.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
		}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	@Test
    public void Even_Odd_Even_A1_and_B2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 8, 9, 12, 1.0);
        try{
            assertTrue(classTest.Even_Odd_OddorEven(newBox, 0).contains("M 5.0 5.0 h 2.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0"));
			assertTrue(classTest.Even_Odd_OddorEven(newBox, 3).contains("M 5.0 27.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -2.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
		}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	@Test
    public void Odd_Odd_Even_A_and_B()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 17, 15, 8, 1.0);
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 0).contains("M 5.0 5.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 2.0h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -2.0h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
			assertTrue(classTest.Odd_Odd_OddorEven(newBox, 2).contains("M 57.0 5.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 1.0 v 1.0 h 1.0 v -1.0 h 2.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -1.0 v 2.0h 1.0 v 1.0 h -1.0 v 1.0 h 1.0 v 1.0 h -2.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v 1.0 h -1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0 h -1.0 v -2.0h 1.0 v -1.0 h -1.0 v -1.0 h 1.0 v -1.0"));
		}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
}