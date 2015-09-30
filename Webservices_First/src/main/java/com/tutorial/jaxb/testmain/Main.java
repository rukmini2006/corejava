package com.tutorial.jaxb.testmain;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.tutorial.jaxb.test.Book;
import com.tutorial.jaxb.test.BookStore;
/**
 * 
 * @author Jayram
 *standalone = Yes in the generated xml 
 *means you haven't referred the xml contents from outside
 */
public class Main {

	private static final String BOOKSTORE_XML = "./rukminiBookstore-jaxb.xml";

	public static void main(String[] args) throws JAXBException, IOException {
		
		/*ArrayList< Book> bookList = new ArrayList<Book>();
		
		Book book1 = new Book();
		book1.setIsbn("2342");
		book1.setName("core java");
		book1.setAuthor("James fogg");
		book1.setPublisher("Excel");
		bookList.add(book1);
		
		

		Book book2 = new Book();
		book1.setIsbn("23424444");
		book1.setName("dotnet");
		book1.setAuthor("Hurry fogg");
		book1.setPublisher("Orieelu");
		bookList.add(book2);
		
		
		BookStore bookStore = new BookStore();
		bookStore.setName("Excel store");
		bookStore.setLocation("Concord");
		bookStore.setBookList(bookList);
		
		JAXBContext context = JAXBContext.newInstance(BookStore.class) ;
		Marshaller marshall = context.createMarshaller();
		marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
		marshall.marshal(bookStore, System.out);
		marshall.marshal(bookStore, new File(BOOKSTORE_XML));*/
		
		ArrayList<Book> bookList = new ArrayList<Book>();

		// create books
		Book book1 = new Book();
		book1.setIsbn("909-8876548");
		book1.setName("Core Java");
		book1.setAuthor("James Goslin");
		book1.setPublisher("Excel");
		bookList.add(book1);
		
		
		Book book2 = new Book();
		book2.setIsbn("674-9829475");
		book2.setName("Dot Net");
		book2.setAuthor("Charles Don");
		book2.setPublisher("Oreilly");
		bookList.add(book2);
/*
		Book book3 = new Book();
		book1.setIsbn("909-8876dfsd548");
		book1.setName("Core Java2");
		book1.setAuthor("James Goslindfgdf");
		book1.setPublisher("Exce2333l");
		bookList.add(book3);*/

		// create bookstore, assigning book
		BookStore bookstore = new BookStore();
		bookstore.setName("Excel Store");
		bookstore.setLocation("Concord");
		bookstore.setBookList(bookList);

		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(BookStore.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		m.marshal(bookstore, System.out);

		// Write to File
		m.marshal(bookstore, new File(BOOKSTORE_XML));

		// get variables from our xml file, created before
		System.out.println();
		System.out.println("Output from our XML File: ");
		Unmarshaller um = context.createUnmarshaller();
		BookStore bookstore2 = (BookStore) um.unmarshal(new FileReader(
				BOOKSTORE_XML));
		ArrayList<Book> list = bookstore2.getBookList();
		for (Book book : list) {
			System.out.println("Book: " + book.getName() + " from "
					+ book.getAuthor());
		}
	}
}
		
		/*System.out.println("Output from xml file ");
		Unmarshaller um = context.createUnmarshaller();
		BookStore bookstore2=(BookStore) um.unmarshal(new FileReader(BOOKSTORE_XML));
		ArrayList<Book> list = bookstore2.getBookList();
		for(Book book : list){
			System.out.println("Book: "+book.getName() + " from " +book.getAuthor());*/
		
		
		


