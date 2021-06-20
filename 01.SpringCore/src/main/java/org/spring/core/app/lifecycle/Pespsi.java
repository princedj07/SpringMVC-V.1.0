package org.spring.core.app.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pespsi implements InitializingBean, DisposableBean {

	private double price;

	public double getPrice() {
		System.out.println("Pespsi.getPrice()");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Pespsi.setPrice()");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pespsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Pespsi.afterPropertiesSet()-----init");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Pespsi.destroy()");
		
	}
	
	
}
