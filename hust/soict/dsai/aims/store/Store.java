package aimsproject.hust.soict.dsai.aims.store;

import aimsproject.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    // itemsInStore is a static array of DigitalVideoDisc
    private static DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
    // addDVD methods
    public static void addDVD(DigitalVideoDisc disc){
        for(int i = 0; i < itemsInStore.length; ++i){
            if(itemsInStore[i] == null){
                itemsInStore[i] = disc;
                return;
            }
        }
    }

    // removeDVD methods
    public static void removeDVD(DigitalVideoDisc disc){
        for(int i = 0; i < itemsInStore.length; ++i){
            if(itemsInStore[i] == disc){
                itemsInStore[i] = itemsInStore[itemsInStore.length-1];
                return;
            }
        }
    }

    public void print(){
        for(int i = 0; i < itemsInStore.length; ++i){
            if(itemsInStore[i] != null){
                System.out.println(itemsInStore[i].getTitle()+" - "+itemsInStore[i].getCategory()+" - "+itemsInStore[i].getDirector()+" - "+itemsInStore[i].getLength()+" - "+itemsInStore[i].getCost());
            }
        }
    }
    
}
