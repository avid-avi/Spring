package com.thinkingmamba.firstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thinkingmamba.firstSpringProject.basic.SearchingService;


@SpringBootApplication
public class FirstBasicSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstBasicSpringProjectApplication.class, args);
		SearchingService searchService = (SearchingService) ctx.getBean("searchingService");
		int result = searchService.doSearch(new int[] {3,1,4}, 4);
		System.out.println(result);
		
		/*SortAlgorithm sortAlgorithm = new BubbleSort();
		SearchAlgorithm binarySearch = new BinarySearchImpl(sortAlgorithm);
		SearchingService searchSearvice = new SearchingService(binarySearch);
		int result = searchSearvice.doSearch(new int[] {3,1,4}, 4);
		System.out.println(result);*/
	}
}
