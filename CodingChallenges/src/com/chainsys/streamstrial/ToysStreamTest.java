package com.chainsys.streamstrial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToysStreamTest {

	public static void main(String[] args) {
		Toys toy1=new Toys("Doll",2,300);
		Toys toy2=new Toys("Dolphin Ballon",1,50);
		Toys toy3=new Toys("Aeroplane",1,100);
		List<Toys> products=Arrays.asList(toy1,toy2,toy3);
        List<Toys> discount = products.stream().map(match->{match.setRupees(match.getRupees()*0.9); return match;}).collect(Collectors.toList());
        discount.forEach(match->System.out.println("Name: "+match.getToyName()+","+"Price: "+match.getRupees()));
		
	}

}
