package Browser;

//custom exception
class InvalidURLException extends Exception
{
	public InvalidURLException(String errorMessage)
	{
		super(errorMessage);
	}
}
