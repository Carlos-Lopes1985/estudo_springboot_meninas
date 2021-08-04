package com.estudo;

import com.estudo.entity.Cliente;
import com.estudo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class EstudojavaApplication implements CommandLineRunner {

	//Injeção de dependencia - estudar
	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {

		SpringApplication.run(EstudojavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente c1 = new Cliente(null, "Dani","11792993706", LocalDate.of(1986,04,10));
		Cliente c2 = new Cliente();

		c2.setName("Thayna");
		c2.setCpfCnpj("11792993706");
		c2.setDataNascimento(LocalDate.now());

		//clienteRepository.save(c1);

		clienteRepository.saveAll(Arrays.asList(c1,c2));
	}
}
