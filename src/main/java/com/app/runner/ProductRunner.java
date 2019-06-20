package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("----1-Output------------------------------------------");
		repo.getMyData() 
		.forEach(System.out::println);
		
		System.out.println("-----2--Output----------------------------------------");
		repo.getCostOnly() 
		.forEach(System.out::println);

		System.out.println("------3--Output---------------------------------------");
		repo.getInfo() 
		.forEach(p->System.out.println(p[0]+","+p[1]));
		
		
		System.out.println("-------4--Output--------------------------------------");
		repo.getNewData(5, 9.9)
		.forEach(System.out::println);
		
		
		  System.out.println("-------5--Output--------------------------------------");
		  repo.getMyDataName(3, 8.8).forEach(System.out::println);
		 
		  System.out.println("-------6--Output--------------------------------------");
		  repo.getMyData()
		  .forEach(System.out::println);
		 
	}

}
