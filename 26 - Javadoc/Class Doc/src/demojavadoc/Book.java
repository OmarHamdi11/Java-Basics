package demojavadoc;

/**
 * this class is for books in a library
 * @author Omar Hamdi Ellafy
 * @version 1.2.0
 * @since 2007
 */
public class Book {
    private String name;
    private final long id;
    boolean isAvailable;

    Book(){
        name = "Unknown";
        id = 0L;
        isAvailable = false;
    }

    /**
     *parameterized constructor
     * @param name this parameter is holding book name
     * @param id this parameter is holding book id
     * @param isAvailable this parameter tells is the book is available or not
     */
    Book(String name , long id , boolean isAvailable){
        this.name = name;
        this.id = id;
        this.isAvailable = isAvailable;
    }

    /**
     *
     * @param name enable admin to set book name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @return enable user and admin to get book name
     */
    public String getName(){
        return  this.name;
    }

    /**
     *
     * @return enable admin to get book id
     */
    public long getId(){
        return this.id;
    }

    /**
     *
     * @param isAvailable enable admin to set if a book is available or not
     */
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    /**
     * Issue a Book to a Student
     * @param name it's refer to book name
     * @throws Exception if book has any issue it will throw an exception
     */
    public void issue(String name) throws Exception {

    }

    /**
     *
     * @return is the book is available it will return true
     */
    public boolean available(){
        return this.isAvailable;
    }

}
