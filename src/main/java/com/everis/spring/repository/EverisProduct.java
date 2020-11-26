package com.everis.spring.repository;

/**
 * Clase "Repositorio / Entidad" de los productos
 * 
 * @author Isabel Orozco Puerto
 * 
 */

public class EverisProduct {

	/** id del producto */
	private static int id = 0;

	/** nombre del producto */
	private String name;

	/** precio del producto con el iva o ipsi añadido */
	private double pvpIva;

	/** precio del producto sin iva o ipsi */
	private double pvp;

	/**
	 * Constructor sobrecargado
	 * 
	 * @param name
	 * @param pvp
	 */
	public EverisProduct(String name, double pvp) {
		this.name = name;
		this.pvp = pvp;
		id = id + 1;
	}

	/**
	 * Constructor vacío
	 */
	public EverisProduct() {

	}

	// GETTER AND SETTER

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pvpIva
	 */
	public double getPvpIva() {
		return pvpIva;
	}

	/**
	 * @param pvpIva the pvpIva to set
	 */
	public void setPvpIva(double pvpIva) {
		this.pvpIva = pvpIva;
	}

	/**
	 * @return the pvp
	 */
	public double getPvp() {
		return pvp;
	}

	/**
	 * @param pvp the pvp to set
	 */
	public void setPvp(double pvp) {
		this.pvp = pvp;
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
		EverisProduct.id = id;
	}

}
