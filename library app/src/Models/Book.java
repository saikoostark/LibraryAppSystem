package Models;

import java.time.LocalDate;
import java.util.*;

public class Book {
	private int ID;
	private String title;
	private String auther;
	private String publisher;
	private int pages;
	private LocalDate year;
	private String ISBN;
	private String Link;
	private int copies;
	private String tag;

	public Book() {
	}

	public Book(String title, String auther, String publisher, int pages, LocalDate year, String ISBN,
			String Link, int copies, String tag) {
		this.ID = ID;
		this.title = title;
		this.auther = auther;
		this.publisher = publisher;
		this.pages = pages;
		this.year = year;
		this.ISBN = ISBN;
		this.Link = Link;
		this.copies = copies;
		this.tag = tag;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return this.auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return this.pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public LocalDate getYear() {
		return this.year;
	}

	public void setYear(LocalDate year) {
		this.year = year;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getLink() {
		return this.Link;
	}

	public void setLink(String Link) {
		this.Link = Link;
	}

	public int getCopies() {
		return this.copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
