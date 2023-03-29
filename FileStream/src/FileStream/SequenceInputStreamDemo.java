package FileStream;
import java.io.*;

public class SequenceInputStreamDemo {

	public static void main(String[] arg)
	{
		
		try
		{
		FileInputStream fin1 = new FileInputStream("/Users/darsana-temp/Documents/stream/file.txt");
		FileInputStream fin2 = new FileInputStream("/Users/darsana-temp/Documents/stream/file2.txt");
		FileInputStream fin3 = new FileInputStream("/Users/darsana-temp/Documents/stream/file3.txt");
		FileOutputStream fout2 = new FileOutputStream("/Users/darsana-temp/Documents/stream/file2.txt");
		FileOutputStream fout3 = new FileOutputStream("/Users/darsana-temp/Documents/stream/file3.txt");
		
		//write S8LA to file 2
		String name = " S8LA";
		byte[] ary = name.getBytes();
		fout2.write(ary);
		
		SequenceInputStream ss = new SequenceInputStream(fin1,fin2);
		int i;
		//write file1 and 2 to 3
		while((i=ss.read())!=-1)
		{
			fout3.write(i);
		}
		
		System.out.println("file content of file 3 : ");
		while((i=fin3.read())!=-1)
		{
			
			System.out.print((char)i);
		}
		
		System.out.println();
		System.out.println("copied two files to single file");
		fin1.close();
		fin2.close();
		fin3.close();
		fout2.close();
		fout3.close();
		ss.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
