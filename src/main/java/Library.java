import java.util.ArrayList;

public class Library {

        private int capacity;
        private ArrayList<Books> stock;

        public Library(int capacity){
            //@capacity
            this.capacity = capacity;
            //@stock =[ ]
            this.stock = new ArrayList<Books>(); //stock = Books.new
        }

        public int noOfBooks(){
            return this.stock.size();
        }

        public void addNewBook(Books book){
            if(this.stock.size() < this.capacity) this.stock.add(book);
        }

        public void borrowBook(Borrower person) {
            if (this.stock.size() < this.capacity) {
                this.stock.add(person.removeBook());
            }
        }

        public Books removeBook(){
            return this.stock.remove(0);
        }
    }