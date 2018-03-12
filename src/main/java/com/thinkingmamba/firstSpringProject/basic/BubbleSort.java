package com.thinkingmamba.firstSpringProject.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {

	@Override
	public int[] sortIntegers(int[] numbers) {
		System.out.println("Doing bubble sorting...");
		return numbers;
	}
}
