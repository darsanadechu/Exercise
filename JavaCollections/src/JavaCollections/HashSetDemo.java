package JavaCollections;
import java.util.HashSet;


class Book
{
	float price;
	String bookName;
	String author;
	
	Book(float price,String bookName,String author)
	{
		this.price = price;
		this.bookName = bookName;
		this.author = author;
	}
}

public class HashSetDemo {

	public static void main(String[] arg)
	{
		
		HashSet<Book> books = new HashSet<>();
		
		Book B1 = new Book(500,"Harry Potter","JK Rowling");
		Book B2 = new Book(450,"Jungle Book","Rudyard Kipling");
		Book B3 = new Book(400,"Stuart Little","E.B. White");
		
		books.add(B1);
		books.add(B2);
		books.add(B3);
		
		for(Book b:books)
			System.out.println("Name : "+b.bookName+" ,Author : "+b.author+" ,Price : "+b.price);
		
		HashSet<Book> books1 = new HashSet<>(books);
		Book B4 = new Book(425,"Black Beauty","Anna Sewell");
		books1.add(B4);
		
		System.out.println();
		
		HashSet<String> bookName = new HashSet<>();
		
		for(Book b:books1)
		{
			System.out.println("Name : "+b.bookName+" ,Author : "+b.author+" ,Price : "+b.price);
			bookName.add(b.bookName);
		}
		
		System.out.println();
		System.out.println("book names: ");
		for(String str:bookName)
			System.out.println(str);
		
		bookName.removeIf(str->str.contains("Black Beauty"));
		
		System.out.println();
		System.out.println("book names after removing Black Beauty: ");
		for(String str:bookName)
			System.out.println(str);
	}
}
