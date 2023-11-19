package br.com.dsList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableMBeanExport
public class DsListApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsListApplication.class, args);
	}

}
