package com.thinkingmamba.firstSpringProject.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {

	@Override
	public int[] sortIntegers(int[] numbers) {
		System.out.println("Doing quick sorting...");
		return numbers;
	}
}
