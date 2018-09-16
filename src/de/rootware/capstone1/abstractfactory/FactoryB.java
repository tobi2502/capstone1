package de.rootware.capstone1.abstractfactory;

import de.rootware.capstone1.abstractfactory.AbstractFactory;
import de.rootware.capstone1.abstractfactory.AbstractProduct1;
import de.rootware.capstone1.abstractfactory.AbstractProduct2;

public class FactoryB extends AbstractFactory {

	@Override
	public AbstractProduct1 createProduct1() {
		// TODO Auto-generated method stub
		return new Product1B();
	}

	@Override
	public AbstractProduct2 createProduct2() {
		// TODO Auto-generated method stub
		return new Product2B();
	}

}
