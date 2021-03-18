import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;

import java.io.File; 
import java.io.IOException;
import java.util.*;
import java.io.*;

/**
import static org.junit.Assert.assertTrue;
import org.junit.*;
/**
*
*
**/

public class SE1BoxProject_gmmTest
{
     SE1BoxProject_gmm box;
    
    @Before
    public void initialize() {
    box = new SE1BoxProject_gmm();
    }
    
    //test add func 1
    @Test
    public void helloBox() 
    {
        //testAdd1
        try {

        assert(true);
        } catch (Exception e) {
            System.out.println("Hello Box Error");
        }
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
            System.out.println("Failed to create path of size 9");
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
            System.out.println("Failed to create path of size 9 \n" + svgPath + " .");
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
            System.out.println("Failed to create path of size 9 \n" + svgPath + " .");
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
            System.out.println("Failed to create path of size 9 \n" + svgPath + " .");
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
            System.out.println("Failed to create path of size 9 \n" + svgPath + " .");
		}
    }
}
