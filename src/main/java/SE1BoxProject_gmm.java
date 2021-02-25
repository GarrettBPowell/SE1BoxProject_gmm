/**
 * SE1 Laser Box Project
 * Marlon Miller Matute, Garrett Powell, Michael Thorson
 */
public class SE1BoxProject_gmm
{
    public static void main( String[] args )
    {
        System.out.println("<path d=\"M 45.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0\" stroke=\"rgb(255,0,0)\" stroke-width=\"0.20\" />");
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
}
