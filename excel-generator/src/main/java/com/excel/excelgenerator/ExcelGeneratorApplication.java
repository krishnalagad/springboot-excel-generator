package com.excel.excelgenerator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcelGeneratorApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(ExcelGeneratorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Project started.");
	}

}
