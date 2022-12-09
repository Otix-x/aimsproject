package aimsproject.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category, float cost) {
        super(title,category,cost);        
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super(title,category,cost);
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id,title,category,cost);
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost) {
        super(id,title,category,cost);
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

    @Override
	public String toString() {
		return "Book - " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + "[" + this.getAuthors() + "]" + " - " + this.getCost() + "$" ;
	}
}
