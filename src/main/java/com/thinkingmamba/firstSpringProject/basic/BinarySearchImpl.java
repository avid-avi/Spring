package com.thinkingmamba.firstSpringProject.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl implements SearchAlgorithm {

	@Autowired
	public SortAlgorithm bubbleSort;

	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	public int search(int[] numbers, int num) {
		// do sorting
		int[] sortedNumbers = bubbleSort.sortIntegers(numbers);
		// do searching
		System.out.println("doing binary search....");
		// return index
		return sortedNumbers[2];
	}
}
