package aimsproject.hust.soict.dsai.aims.media;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public Book(String title) {
        super();
        this.title = title;
        
    }

    public Book(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super();
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        for(String author : this.authors){
            if(author.equals(authorName)){
                System.out.println("Author already exists");
                return;
            }
        }
        this.authors.add(authorName);
    }

    public void removeAuthor(String authorName){
        for(String author : this.authors){
            if(author.equals(authorName)){
                this.authors.remove(authorName);
                return;
            }
        }
        System.out.println("Author not found");
    }
}
