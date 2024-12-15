package org.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Elevador elevador = new Elevador();

		System.out.println("Elevador inicializado no andar " + elevador.getAndarAtual());

		elevador.mover(3);

		elevador.mover(1);

		System.out.println("Elevador chegou ao andar " + elevador.getAndarAtual());
	}
}
