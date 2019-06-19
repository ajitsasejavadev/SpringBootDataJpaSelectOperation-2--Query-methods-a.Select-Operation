package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {


		repo.getMyData() 
		.forEach(System.out::println);
		System.out.println("----1-------------------------------------------");

		repo.getCostOnly() 
		.forEach(System.out::println);
		System.out.println("-----2------------------------------------------");

		repo.getInfo() 
		.forEach(System.out::println);
		System.out.println("------3-----------------------------------------");

		repo.getNewData(5, 9.9)
		.forEach(System.out::println);
		System.out.println("-------4----------------------------------------");

		/*
		 * repo.getMyDataName(3, 8.8) .forEach(System.out::println);
		 */
		
		/*
		 * repo.getMyData() .forEach(System.out::println);
		 */
	}

}
