package com.everis.spring.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.everis.spring.repository.EverisOrder;
import com.everis.spring.repository.EverisProduct;

/**
 * Servicio de gestión de pedidos para península
 * 
 * @author Isabel Orozco Puerto
 * 
 */

@Service("comunidad")
public class EverisOrderCommunitiesServiceImpl implements EverisOrderServiceI {

	EverisOrder newOrder = new EverisOrder();

	@Override
	public EverisOrder createOrder(String name, String address, boolean peninsular) {

		if (peninsular == false) {
			newOrder = new EverisOrder(name, address, peninsular);
		} else {
			System.out.println("--------------------------------------------------------------");
			System.out.println("El indicador de compra peninsular debe estar a False en este servicio");
			newOrder.setPeninsula(true);
		}

		return newOrder;
	}

	@Override
	public void addProduct(String name, double price) {

		if (newOrder.isPeninsula() == false) {
			EverisProduct newProduct = new EverisProduct(name, price);
			newOrder.getProductsList().add(newProduct);
		} else {
			System.out.println("--------------------------------------------------------------");
			System.out.println("No se ha podido realizar el pedido");
		}
	}

	@Override
	public void showOrderAndProducts() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Id pedido: " + newOrder.getId() + " Cliente: " + newOrder.getClientName() + " Dirección: "
				+ newOrder.getAddress());
		ArrayList<EverisProduct> productList = newOrder.getProductsList();
		double total = 0;
		System.out.println("--------------------------------------------------------------");
		for (EverisProduct product : productList) {
			product.setPvpIva(product.getPvp() * 1.04);
			total = total + product.getPvpIva();

			System.out.println("producto: " + product.getName() + " ||  precio sin IPSI: " + product.getPvp()
					+ " ||  precio(IPSI incluido): " + product.getPvpIva());
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("El total de la compra es: " + total + " IPSI incluido");
	}

}
