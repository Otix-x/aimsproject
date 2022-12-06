package aimsproject.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title);
        this.title = title;
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
    

    public void toString(DigitalVideoDisc dvd) {
        System.out.println("DVD - " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + " : " + dvd.getCost());
    }
    
    public boolean isMatch(String title) {
        String[] tokens = title.split(" ");
        for (String token : tokens) {
            if (this.getTitle().contains(token)) {
                return true;
            }
        }
        return false;
    }
}
