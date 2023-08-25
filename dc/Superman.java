package model.product.dc;

import model.products.Superheroes;

/**
 *
 * @author isabella
 */
public class Superman implements Superheroes {
    @Override
    public String getmessage() {
        return "¡Soy Superman de DC!";
    }
}