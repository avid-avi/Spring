package com.thinkingmamba.firstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexBusinessService {
	@Autowired
	private SortAlgorithm sortAlgo;
	
	public ComplexBusinessService(SortAlgorithm sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	
	public void sort() {
		sortAlgo.sort();
	}
}
