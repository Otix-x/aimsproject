    //The Cart class will contain a list of DigitalVideoDisc objects and have methods capable of modifying the list. 

package aimsproject.hust.soict.dsai.aims.cart;

import aimsproject.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];    //An array to store a list of DigitalVideoDisc
    private int qtyOrdered = 0;     // To keep track of how many DVD are in the cart

    public int getQtyOrdered(){
        return qtyOrdered;
    }

    // The method addDigitalVideoDisc(DigitalVideoDisc disc) to add an item to the list
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("ERROR! The cart is full");
            return ;
        }

        itemsOrdered[qtyOrdered] = disc;
        System.out.println("This item has been added !");
        qtyOrdered++;
        if(qtyOrdered == MAX_NUMBERS_ORDERED - 1){
            System.out.println("The cart is almost full");
        }
    }

    // The method removeDigitalVideoDisc(DigitalVideoDisc disc) to remove the item passed by argument from the list.
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
         for(int i = 0; i < qtyOrdered; ++i){
            if(itemsOrdered[i] == disc){
                itemsOrdered[i] = itemsOrdered[qtyOrdered-1];
                System.out.println("The disc has been removed");
                qtyOrdered--;
                return;
            }
         }
         System.out.println("Disc is not found in the cart");
    }

    // Overloading addDigitalVideoDisc method by different types of parameters  
    void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        if(dvdList.length > MAX_NUMBERS_ORDERED){
            System.out.println("ERROR! The cart is full");
            return ;
        }
        else {
            System.out.println("The disc has been added");
        }
    }

    // Overloading addDigitalVideoDisc method by different the number of parameter
    void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("ERROR! The cart is full");
            return ;
        }
        else {
            System.out.println("The disc has been added");
        }
    }

    

    // The totalCost() method which loops through the values of the array and sums the costs of the individual DigitalVideoDiscs
    float totalCost(){
        float total = 0;
        for (int i = 0; i < qtyOrdered; ++i){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void displayCart(){
        System.out.println("∞∞ CART ∞∞");
        for(int j = 0; j < qtyOrdered; ++j){
            System.out.print(itemsOrdered[j].getTitle() + ": ");
            System.out.println(itemsOrdered[j].getCost());
        }

        System.out.println("-----------------------");
        System.out.print("Total cost: " + totalCost());

    }

    public void print(){
        System.out.println("*****************Cart*****************");
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; ++i){
            System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************");
    }

}


