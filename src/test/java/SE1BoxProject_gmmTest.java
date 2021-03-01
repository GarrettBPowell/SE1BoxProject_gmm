import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.*;

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
    public void correctString()
    {
        try {
            assertEquals(true,box.coordinates("<path d=\"M 35.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"));
            assertEquals(true,box.coordinates("<path d=\"M 45.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"));
            assertEquals(true,box.coordinates("<path d=\"M 55.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"));

            assertEquals(false,box.coordinates("<path d=\"M 55.0 55.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"));

            assertEquals(true,box.coordinates("<path d=\"M 45.0 35.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"));
            assertEquals(true,box.coordinates("<path d=\"M 35.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"));
            assertEquals(true,box.coordinates("<path d=\"M 55.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />"));


        }
        catch (Exception e) {
            System.out.println("Wrong coordinates");
        }
    }
	
	@Test
	public void fileCreation()
	{
		try{
			int randA = (int)(Math.random() * 10000);
			int randB = (int)(Math.random() * 10000);
			
			assertTrue(box.createFile("Test File " + randA + " " + randB));
		}
		catch (Exception e) {
			System.out.println("Failed to create file, file may already exist, please delete file, or move file");
		}
	}
}



