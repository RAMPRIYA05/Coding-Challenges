package com.chainsys.streamstrial;

public class Book {
	
	
	
		private String bookName;
		private String publishedYear;
		private int noOfPages;
		private String authorName;
		private double rupees;
		private String publisherName;
		
		public Book(String bookName, String publishedYear, int noOfPages, String authorName, double rupees,
				String publisherName) {
			super();
			this.bookName = bookName;
			this.publishedYear = publishedYear;
			this.noOfPages = noOfPages;
			this.authorName = authorName;
			this.rupees = rupees;
			this.publisherName = publisherName;
			
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getPublishedyear() {
			return publishedYear;
		}
		public void setPublishedYear(String publishedYear) {
			this.publishedYear = publishedYear;
		}
		public int getNoOfPages() {
			return noOfPages;
		}
		public void setNoOfPages(int noOfPages) {
			this.noOfPages = noOfPages;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public double getRupees() {
			return rupees;
		}
		public void setRupees(double rupees) {
			this.rupees = rupees;
		}
		public String getPublisherName() {
			return publisherName;
		}
		public void setPublisherName(String publisherName) {
			this.publisherName = publisherName;
		}
		@Override
		public String toString() {
			return "Book [bookName=" + bookName + ", publishedYear=" + publishedYear + ", noOfPages=" + noOfPages
					+ ", authorName=" + authorName + ", rupees=" + rupees + ", publisherName=" + publisherName + "]";
		}
		
		
		
		
		
	}
