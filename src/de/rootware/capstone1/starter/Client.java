package de.rootware.capstone1.starter;

import de.rootware.capstone1.abstractfactory.AbstractFactory;
import de.rootware.capstone1.abstractfactory.AbstractProduct1;
import de.rootware.capstone1.abstractfactory.AbstractProduct2;

public class Client {
	private AbstractFactory factory = null;
	private AbstractProduct1 product1 = null;		
	private AbstractProduct2 product2 = null;

	public void setAbstractFactory(AbstractFactory factory) {
	    this.factory = factory;
	  }
	
	public void generateProducts() {
		
		if (this.factory != null) {
			this.product1 = this.factory.createProduct1();
			this.product2 = this.factory.createProduct2();
		}
	}
	
	public void useProducts() {
		
		if (this.product1 != null && this.product2 != null) {
			this.product1.doSomething();
			this.product2.dosomething(5, 9);;
		}
	}
	
}
