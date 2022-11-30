package com.marian.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerce5Application {

	public static void main(String[] args) {
		
		
		MyStore gcu = new MyStore("GCU Shop");
		gcu.open();
		
		SpringApplication.run(ECommerce5Application.class, args);
		
		
	}

}
