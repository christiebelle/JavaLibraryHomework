import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Books> bookshelf;

    public Borrower(String name){
        //@name
        this.name = name;
        //@bookshelf =[ ]
        this.bookshelf = new ArrayList<Books>();
    }

    public void addBook(Books book){
        this.bookshelf.add(book);
    }

    public Books removeBook(){
        return this.bookshelf.remove(0);
    }

    public int booksOnShelf(){
        return this.bookshelf.size();
    }
}
