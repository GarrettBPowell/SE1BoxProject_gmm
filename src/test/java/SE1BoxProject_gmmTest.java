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
    public void Odd_Odd_Even_A1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 17, 15, 8, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 0).contains("M 1.0 1.0 h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0 v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v2.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h-2.0 v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v-2.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Even_A2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 17, 15, 8, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 1).contains("M 19.0 1.0 h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0 v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v2.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h-2.0 v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v-2.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Even_B1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 17, 15, 8, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 2).contains("M 37.0 1.0 h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0 v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v2.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h-2.0 v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v-2.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }

	@Test
    public void Odd_Odd_Even_B2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 17, 15, 8, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 3).contains("M 1.0 10.0 h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0 v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v2.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h-2.0 v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v-2.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Even_Bot()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 17, 15, 8, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 4).contains("M 17.0 10.0 h1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h1.0v1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v1.0h-1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h-1.0v-1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v-1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Even_Top()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 17, 15, 8, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 5).contains("M 35.0 10.0 h1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h1.0v1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v1.0h-1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h-1.0v-1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v-1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
		@Test
    public void Even_Even_Even_A1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 10, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 0).contains("M 1.0 1.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v0.7h-1.7v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-2.0v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_A2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 10, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 1).contains("M 12.0 1.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v0.7h-1.7v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-2.0v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_B1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 10, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 2).contains("M 23.0 1.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v0.7h-1.7v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-2.0v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_B2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 10, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 3).contains("M 1.0 12.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v0.7h-1.7v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-2.0v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_Top()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 10, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 4).contains("M 12.0 12.0 h2.0 v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h1.7v2.0 h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v1.7h-2.0 v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-1.7v-2.0 h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v-1.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_Bot()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 10, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 5).contains("M 23.0 12.0 h2.0 v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h1.7v2.0 h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v1.7h-2.0 v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-1.7v-2.0 h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v-1.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Odd_A1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 11, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 0).contains("M 1.0 1.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0 v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h-2.0 v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h-1.7v-0.7h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Odd_A2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 11, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 1).contains("M 12.0 1.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0 v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h-2.0 v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h-1.7v-0.7h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Odd_B1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 11, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 2).contains("M 23.0 1.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0 v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h-2.0 v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h-1.7v-0.7h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Odd_B2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 11, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 3).contains("M 1.0 13.0 h1.7v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h2.0 v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h-2.0 v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h-1.7v-0.7h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v-0.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Odd_Bot()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 11, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 4).contains("M 12.0 13.0 h2.0 v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h1.7v2.0 h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v1.7h-2.0 v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-1.7v-2.0 h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v-1.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Odd_Top()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 10, 10, 11, 0.3, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 5).contains("M 23.0 13.0 h2.0 v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h 1.0v 0.3h 1.0v -0.3h1.7v2.0 h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v 1.0h -0.3v 1.0h 0.3v1.7h-2.0 v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h -1.0v -0.3h -1.0v 0.3h-1.7v-2.0 h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v -1.0h 0.3v -1.0h -0.3v-1.7"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_A1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 5, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 0).contains("M 1.0 1.0 h 1.9v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_A2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 5, 5, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 1).contains("M 7.0 1.0 h 1.9v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_B1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 5, 5, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 2).contains("M 13.0 1.0 h 1.9v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_B2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 5, 5, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 3).contains("M 1.0 7.0 h 1.9v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_Top()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 5, 5, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 4).contains("M 7.0 7.0 h1.9v -0.1h 1.0v 0.1h1.9v1.9h 0.1v 1.0h -0.1v1.9h-1.9v 0.1h -1.0v -0.1h-1.9v-1.9h -0.1v -1.0h 0.1v-1.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Odd_A1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 16, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 0).contains("M 1.0 1.0 h1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h-1.9v-0.9h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v-0.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Odd_A2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 16, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 1).contains("M 18.0 1.0 h1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h-1.9v-0.9h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v-0.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Odd_B1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 16, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 2).contains("M 35.0 1.0 h 1.9v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Odd_B2()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 16, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 3).contains("M 1.0 7.0 h 1.9v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Odd_Top()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 16, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 4).contains("M 7.0 7.0 h 1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.9v 2.0h 0.1v 1.0h -0.1v 1.9h -1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -2.0h -0.1v -1.0h 0.1v -1.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Odd_Bot()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 5, 16, 5, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 5).contains("M 24.0 7.0 h 1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.9v 2.0h 0.1v 1.0h -0.1v 1.9h -1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -2.0h -0.1v -1.0h 0.1v -1.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_A11()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 7, 7, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 0).contains("M 1.0 1.0 h 1.9v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_A21()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 7, 7, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 1).contains("M 13.0 1.0 h 1.9v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_B11()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 7, 7, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 2).contains("M 25.0 1.0 h 1.9v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_B21()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 7, 7, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 3).contains("M 1.0 9.0 h 1.9v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h-2.0 v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_Top1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 7, 7, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 4).contains("M 9.0 9.0 h1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h1.9v1.9h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v1.9h-1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h-1.9v-1.9h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v-1.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Odd_Odd_Bot1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 7, 7, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Odd_OddorEven(newBox, 5).contains("M 21.0 9.0 h1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h1.9v1.9h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v1.9h-1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h-1.9v-1.9h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v-1.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Even_A11()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 8, 8, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 0).contains("M 1.0 1.0 h1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v0.9h-1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h-2.0v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v-0.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Even_A21()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 8, 8, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 1).contains("M 10.0 1.0 h1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h2.0v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v0.9h-1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h-2.0v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v-0.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Even_B11()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 8, 8, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 2).contains("M 19.0 1.0 h 1.9v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h -1.9v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -2.0 v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Even_B21()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 8, 8, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 3).contains("M 1.0 10.0 h 1.9v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 2.0 v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h -1.9v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -2.0 v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Even_Top1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 8, 8, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 4).contains("M 13.0 10.0 h 1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.9v 2.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.9h -1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -2.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Odd_Even_Even_Bot1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, true, 11, 8, 8, 0.1, "NULL", "NULL");
        try{
            assertTrue(classTest.Odd_Even_EvenorOdd(newBox, 5).contains("M 22.0 10.0 h 1.9v -0.1h 1.0v 0.1h 1.0v -0.1h 1.0v 0.1h 1.0v -0.1h 1.9v 2.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.0h 0.1v 1.0h -0.1v 1.9h -1.9v 0.1h -1.0v -0.1h -1.0v 0.1h -1.0v -0.1h -1.0v 0.1h -1.9v -2.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.0h -0.1v -1.0h 0.1v -1.9"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	public void Even_Even_Even_A11()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 16, 16, 18, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 0).contains("M 1.0 1.0 h1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v0.0h-1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h-2.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v-0.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_A21()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 16, 16, 18, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 1).contains("M 18.0 1.0 h1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v0.0h-1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h-2.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v-0.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_B11()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 16, 16, 18, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 2).contains("M 35.0 1.0 h1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v0.0h-1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h-2.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v-0.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_B21()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 16, 16, 18, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 3).contains("M 1.0 20.0 h1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h2.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v0.0h-1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h-2.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v-0.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	
	@Test
    public void Even_Even_Even_Bot1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 16, 16, 18, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 4).contains("M 18.0 20.0 h2.0 v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h1.0v2.0 h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v1.0h-2.0 v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h-1.0v-2.0 h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v-1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
	@Test
    public void Even_Even_Even_Top1()
    {
        SE1BoxProject_gmm classTest = new SE1BoxProject_gmm();
        String filename = "Make box";
        Box newBox = new Box(filename, false, 16, 16, 18, 1.0, "NULL", "NULL");
        try{
            assertTrue(classTest.Even_Even_EvenorOdd(newBox, 5).contains("M 35.0 20.0 h2.0 v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h 1.0v 1.0h 1.0v -1.0h1.0v2.0 h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v 1.0h -1.0v 1.0h 1.0v1.0h-2.0 v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h -1.0v -1.0h -1.0v 1.0h-1.0v-2.0 h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v -1.0h 1.0v -1.0h -1.0v-1.0"));
			}
        catch (Exception e){
            System.out.println("Failed to create box");
        }
    }
}