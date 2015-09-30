package com.tutorial.jaxb.test;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "com.tutorial.jaxb.test")
public class BookStore {
	private ArrayList<Book> bookList;
	private String name;
	private String location;
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
