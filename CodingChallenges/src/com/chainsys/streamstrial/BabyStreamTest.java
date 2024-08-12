package com.chainsys.streamstrial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BabyStreamTest {

	public static void main(String[] args) {
		Baby product1=new Baby("Johnson soap","Johnson powder",800);
		Baby product2=new Baby("Himalaya soap","Himalaya powder",900);
		Baby product3=new Baby("ABC soap","Ponds powder",700);
		
		List<Baby> products=Arrays.asList(product1,product2,product3);
		List<Baby> getList =products.stream().filter(match->match.getRupees() > 800).collect(Collectors.toList());    
        getList.forEach(product-> System.out.println(product.getBabySoap()+"-"+product.getRupees()));

	}

}
