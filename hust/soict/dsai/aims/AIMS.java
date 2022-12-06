// An Internet Media Store
package aimsproject.hust.soict.dsai.aims;

import aimsproject.hust.soict.dsai.aims.cart.Cart;
import aimsproject.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class AIMS {
    public static void main(String[] args){
        // Create a new Cart
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

        anOrder.removeDigitalVideoDisc(dvd1);

        // Print total cost of the items in the cart
        anOrder.displayCart();

    }
}
