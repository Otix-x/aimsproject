package aimsproject;

public class CartTest {
    public static void main(String[] args){
        // Create a new Cart
        Cart cart = new Cart(); 

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        cart.print();
        // To-do: Test the remove method
    }
}