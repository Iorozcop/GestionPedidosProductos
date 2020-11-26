package com.everis.spring.repository;

import java.util.ArrayList;

/**
 * Clase "Repositorio / Entidad" de los pedidos.
 * 
 * @author Isabel Orozco Puerto
 * 
 */

public class EverisOrder {

	/** id del pedido */
	private static int id = 0;

	/** Nombre del cliente */
	private String clientName;

	/** Dirección de envío */
	private String address;

	/** Atributo indicador de entrega */
	private boolean peninsula;

	/** lista de productos */
	private ArrayList<EverisProduct> productsList = new ArrayList<EverisProduct>();

	/**
	 * Constructor sobrecargado
	 * 
	 * @param clientName
	 * @param address
	 * @param peninsula
	 */
	public EverisOrder(String clientName, String address, boolean peninsula) {
		this.clientName = clientName;
		this.address = address;
		this.peninsula = peninsula;
		id = id + 1;
	}

	/**
	 * Constructor vacío
	 */
	public EverisOrder() {
	}

	// GETTER AND SETTER

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		EverisOrder.id = id;
	}

	/**
	 * @return the peninsula
	 */
	public boolean isPeninsula() {
		return peninsula;
	}

	/**
	 * @param peninsula the peninsula to set
	 */
	public void setPeninsula(boolean peninsula) {
		this.peninsula = peninsula;
	}

	/**
	 * @return the productsList
	 */
	public ArrayList<EverisProduct> getProductsList() {
		return productsList;
	}

	/**
	 * @param productsList the productsList to set
	 */
	public void setProductsList(ArrayList<EverisProduct> productsList) {
		this.productsList = productsList;
	}

}
