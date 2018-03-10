package com.thinkingmamba.firstSpringProject;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {	
	
	@Override
	public void sort() {
		System.out.println("Sorting by bubble sort algorithm");
	}
}
