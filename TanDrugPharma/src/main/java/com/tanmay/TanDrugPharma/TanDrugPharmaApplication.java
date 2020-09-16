package com.tanmay.TanDrugPharma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tanmay.TanDrugPharma")
public class TanDrugPharmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TanDrugPharmaApplication.class, args);
	}

}
