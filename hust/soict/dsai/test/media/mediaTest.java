package aimsproject.hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import aimsproject.hust.soict.dsai.aims.media.Media;
import aimsproject.hust.soict.dsai.aims.media.CompactDisc;
import aimsproject.hust.soict.dsai.aims.media.DigitalVideoDisc;
import aimsproject.hust.soict.dsai.aims.media.Book;

public class mediaTest {
    public static void main(String[] argv){
        List<Media> mediae = new ArrayList<Media>();
        CompactDisc CD = new CompactDisc("AAA", "BBB", "CCC", 10, 10);
        DigitalVideoDisc DVD = new DigitalVideoDisc("DDD", "EEE", "FFF", 20, 20);
        Book Book = new Book("GGG", "HHH", 30);

        mediae.add(CD);
        mediae.add(DVD);
        mediae.add(Book);

        for (Media media : mediae) {
            System.out.println(media.toString());
        }
    }
}
