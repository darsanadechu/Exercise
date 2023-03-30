package Hack;
import java.io.*;

//Hacker class
class Hacker
{
	
	//add to hacker file
	void addToFile()
	{
		try
		{
			FileWriter fout = new FileWriter("/Users/darsana-temp/Documents/stream/History.txt");
			BufferedWriter writer = new BufferedWriter(fout);
			
			Browser B = new Browser();
			for(String url : B.history)
			{
				writer.write(url);
				writer.newLine();
			}
			
			writer.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	//fetch file
	void fetchFile()
	{
		try
		{
			
			FileReader fin = new FileReader("/Users/darsana-temp/Documents/stream/History.txt");
			BufferedReader reader = new BufferedReader(fin);
			Browser B = new Browser();
			
			System.out.println("file contents :");
			String url;
			while((url=reader.readLine())!=null)
			{
				System.out.println(url);
			}
			
			reader.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	//modify hacker file and history
	void modify(String url)
	{
		try
		{
		
			FileWriter fout = new FileWriter("/Users/darsana-temp/Documents/stream/History.txt");
			BufferedWriter writer = new BufferedWriter(fout);
			Browser B = new Browser();
		
			
			//modify file
			for(String str:B.history)
			{
				writer.write(str);
				writer.newLine();
			}
			if(!B.history.contains(url))
			{
				writer.write(url);
				writer.newLine();
				System.out.println("modified");
			}
			
			
			writer.close();
			fout.close();
			
			FileReader fin = new FileReader("/Users/darsana-temp/Documents/stream/History.txt");
			BufferedReader reader = new BufferedReader(fin);
			
			String s;
			B.history.clear();
			while((s=reader.readLine())!=null)
			{
				B.history.add(s);
			}
			
			
			reader.close();
			fin.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

