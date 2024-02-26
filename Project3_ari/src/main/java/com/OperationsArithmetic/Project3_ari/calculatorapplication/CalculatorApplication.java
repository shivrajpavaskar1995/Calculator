package com.OperationsArithmetic.Project3_ari.calculatorapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class,args);

	}

	@GetMapping("/add")
	public double add(@RequestParam double num1,@RequestParam double num2) 
		{
			return num1+num2;
		}
	
	@GetMapping("/subtract")
	public double subtract(@RequestParam double num1,@RequestParam double num2)
	{
		return num1-num2;
	}
	
	@GetMapping("/multiply")
	public double multiply(@RequestParam double num1,@RequestParam double num2)
	{
		return num1*num2;
	}
	
	@GetMapping("/divide")
	public double divide(@RequestParam double num1,@RequestParam double num2)
	{
		return num1/num2;
	}
	
	
	
}
