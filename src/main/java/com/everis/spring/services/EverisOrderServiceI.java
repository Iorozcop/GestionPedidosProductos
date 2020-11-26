package com.everis.spring.services;

import com.everis.spring.repository.EverisOrder;

/**
 * Servicio de gestión de pedidos
 * 
 * @author Isabel Orozco Puerto
 * 
 */

public interface EverisOrderServiceI {

	/**
	 * Método que crea un pedido
	 * 
	 * @param name
	 * @param address
	 * @param peninsular
	 * @return
	 */
	public EverisOrder createOrder(String name, String address, boolean peninsular);

	/**
	 * Método para añadir productos al pedido
	 * 
	 * @param name
	 * @param price
	 */
	public void addProduct(String name, double price);

	/**
	 * Método que muestra los datos del pedido, los productos y sus precios con
	 * IVA o IPSI incluido
	 */
	public void showOrderAndProducts();

}
