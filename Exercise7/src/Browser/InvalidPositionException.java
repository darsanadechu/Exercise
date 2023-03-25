package Browser;

//custom exception
class InvalidPositionException extends Exception
{
	public InvalidPositionException(String errorMessage)
	{
		super(errorMessage);
	}
}