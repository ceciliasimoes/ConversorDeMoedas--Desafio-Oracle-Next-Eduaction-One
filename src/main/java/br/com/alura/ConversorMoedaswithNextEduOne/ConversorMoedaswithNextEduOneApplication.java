package br.com.alura.ConversorMoedaswithNextEduOne;

import br.com.alura.ConversorMoedaswithNextEduOne.services.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorMoedaswithNextEduOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConversorMoedaswithNextEduOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.exibeMenu();

	}
}