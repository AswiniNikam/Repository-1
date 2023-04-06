package com.src;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*;

public class PrintSumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		
		Set<Integer> ans=list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(ans);
		
		
		
	}

}
