package FileStream;
import java.io.*;



public class BufferredReaderWriterDemo {
	
	public static void main(String[] arg)
	{
		try
		{
			FileWriter file = new FileWriter("/Users/darsana-temp/Documents/stream/file4.txt");
			BufferedWriter writer = new BufferedWriter(file);
			
			
			writer.write("MACE");
			writer.newLine();
			writer.write("Kothamangalam");
			writer.newLine();
			writer.write("Ernakulam");
			writer.close();
			
			System.out.println("contents:");
			FileReader file1 = new FileReader("/Users/darsana-temp/Documents/stream/file4.txt");
			BufferedReader reader = new BufferedReader(file1);
			String line;
			while((line=reader.readLine())!=null)
				System.out.println(line);
			
		
			reader.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
