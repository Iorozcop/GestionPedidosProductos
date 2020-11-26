package com.everis.spring;

/**
 * Clase principal desde donde ejecutamos el programa y consumimos los servicios.
 * 
 * @author Isabel Orozco Puerto
 * 
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.everis.spring.services.EverisOrderServiceI;

@SpringBootApplication
public class EverisMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EverisMain.class, args);
	}

	@Autowired
	@Qualifier("peninsula")
	private EverisOrderServiceI orderPeninsularService;

	@Override
	public void run(String... args) throws Exception {

		// consumimos el servicio

		// crea pedido
		orderPeninsularService.createOrder("Maria Bernal", "Calle falsa 123", true);

		// añade producto
		orderPeninsularService.addProduct("camisa", 20);
		orderPeninsularService.addProduct("pantalón", 25);
		orderPeninsularService.addProduct("calcetines", 5);
		orderPeninsularService.addProduct("chaqueta", 40);
		orderPeninsularService.addProduct("blusa", 30);

		// muestra productos, precios y datos del pedido
		orderPeninsularService.showOrderAndProducts();

	}

}
