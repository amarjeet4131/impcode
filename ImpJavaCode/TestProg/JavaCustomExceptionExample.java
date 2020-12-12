package TestProg;


/**
 * My custom exception class.
 */
class AlsCustomException extends Exception
{
  public AlsCustomException(String message)
  {
    super(message);
  }
}


/**
 * A class to test (throw) the custom exception we've created.
 * @author alvin alexander, devdaily.com
 *
 */
public class JavaCustomExceptionExample
{
  public static void main(String[] args) throws AlsCustomException
  {
    // create a new foo
	  
	  
	  getBar(1);
	  
	 
			  
			  
  }

private static String getBar(int i)throws AlsCustomException {
	// TODO Auto-generated method stub
	{
	    if (i == 0)
	    {
	      // throw our custom exception
	      throw new AlsCustomException("Anything but zero ...");
	    }
	    else
	    {
	      return "Thanks";
	    }
	  }
}
}