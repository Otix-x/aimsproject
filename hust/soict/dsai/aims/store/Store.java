package aimsproject.hust.soict.dsai.aims.store;

import java.util.ArrayList;

import aimsproject.hust.soict.dsai.aims.media.Media;
public class Store {
    // itemsInStore is a static array of DigitalVideoDisc
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    // addDVD methods
    public void addMedia(Media disc){
        itemsInStore.add(disc);
    }

    public void addMedia(Media[] dvdList){
        for(int i = 0; i < dvdList.length; ++i){
            itemsInStore.add(dvdList[i]);
        }
    }

    public void removeMedia(Media disc){
        itemsInStore.remove(disc);
    }

    public void removeMedia(int id){
        for(int i = 0; i < itemsInStore.size(); ++i){
            if(itemsInStore.get(i).getId() == id){
                itemsInStore.remove(i);
                break;
            }
        }
    }

    public void print(){
        for(int i = 0; i < itemsInStore.size(); ++i){
            if(itemsInStore.get(i) != null){
                System.out.println(itemsInStore.get(i).getTitle()+" - "+itemsInStore.get(i).getCategory()+" - "+itemsInStore.get(i).getCost());
            }
        }
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
    
}
