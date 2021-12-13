package br.edu.infnet.appcanal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppcanalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppcanalApplication.class, args);
	}

}
