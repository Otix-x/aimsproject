package aimsproject.hust.soict.dsai.test.store;

import aimsproject.hust.soict.dsai.aims.media.DigitalVideoDisc;
import aimsproject.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        // Create a new Store
        Store store = new Store(); 

        // Create new DVD objects and add them to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        Store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Store.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        Store.addDVD(dvd3);

        // Test the print method
        // store.print();
        // To-do: Test the remove method
        Store.removeDVD(dvd3);
        store.print();
        
    }
}
