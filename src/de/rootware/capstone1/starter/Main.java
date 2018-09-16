package de.rootware.capstone1.starter;

import de.rootware.capstone1.abstractfactory.FactoryA;

public class Main {

	public static void main(String[] args) {		
		Client c = new Client();
		c.setAbstractFactory(new FactoryA());
		c.generateProducts();
		c.useProducts();
	}

}
