package FileStream;
import java.io.FileOutputStream;


public class FileOutputStreamdemo {

	public static void main(String[] arg)
	{
		
		try
		{
			
			FileOutputStream fout = new FileOutputStream("/Users/darsana-temp/Documents/stream/file.txt");
			//write with single byte
			fout.write(68);
			fout.write(65);
			fout.write(82);
			fout.write(83);
			fout.write(65);
			fout.write(78);
			fout.write(65);
			
			String name = " SABU";
			byte[] ary = name.getBytes();
			
			//write array of bytes
			fout.write(ary);
			
			fout.close();
			
			System.out.println("success : wrote DARSANA SABU to file");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
