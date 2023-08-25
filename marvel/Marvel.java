package model.product.marvel;

import model.product.marvel.Loki;
import model.product.marvel.Spiderman;
import model.products.Editorial;
import model.products.Villanos;


/**
 *
 * @author isabella
 */
public class Marvel implements Editorial {
    
	public Spiderman getSuperheroes() {
		return new Spiderman();
	}

	public Villanos getVillanos() {
		return new Loki();
	}
    
}
