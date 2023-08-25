package model.product.dc;

import model.products.Editorial;
import model.products.Superheroes;
import model.products.Villanos;

/**
 *
 * @author isabella
 */
public class Dc implements Editorial {

    public Superheroes getSuperheroes() {
        return new Superman();
    }

    public Villanos getVillanos() {
        return new Lex_luthor();
    }
}
