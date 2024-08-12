package com.chainsys.streamstrial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class BookStreamTest {
	public static void main(String[] args) {
		Book book1=new Book("Pride and Prejudice","1813",200,"Jane Austen",50,"Elizabeth");
		Book book2=new Book("Brave New World","1931 ",100," Charles ",550,"Jane");
		Book book3=new Book("The Lord of the Rings","1993",200,"Ronald",1050,"William");
		List<Book> books=Arrays.asList(book1,book2,book3);
        List<Book> getList = books.stream().filter(match->match.getRupees() > 100).collect(Collectors.toList());    
        getList.forEach(getBook-> System.out.println(getBook.getBookName()+"-"+getBook.getRupees()));
	}
	
}
