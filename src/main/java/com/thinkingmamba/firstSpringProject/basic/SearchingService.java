package com.thinkingmamba.firstSpringProject.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchingService {
	@Autowired
	private SearchAlgorithm searchAlgorithm;

	public SearchingService(SearchAlgorithm searchAlgorithm) {
		this.searchAlgorithm = searchAlgorithm;
	}

	public int doSearch(int[] numbers, int number) {
		return searchAlgorithm.search(numbers, number);
	}
}