package FileStream;
import java.io.FileInputStream;


public class FileInputStreamDemo {

	public static void main(String[] arg)
	{
		
		try
		{
			
			FileInputStream fin = new FileInputStream("/Users/darsana-temp/Documents/stream/file.txt");
			int i;
			
			System.out.println("available no of bytes : "+fin.available());
			System.out.println("file content : ");
			
			while((i=fin.read())!=-1)
			{
				
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println("file channel : "+fin.getChannel());
			System.out.println("file descriptor : "+fin.getFD());
			
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
