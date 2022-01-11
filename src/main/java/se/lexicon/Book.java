package se.lexicon;

public class Book {
    //3a. Create a class “Author” and create a class “Book”.
    //3b. Create the appropriate relationship between “Author” and “Book”.
    //i. One book can be written by only one author.
    //ii. One author can write one or more books.
    public Author author;
    public String title;
    private boolean owned;

    public Book(Author author, String title, boolean owned) {
        this.author = author;
        this.title = title;
        this.owned = owned;
    }

    public void printAuthorOfThisBook(){
        //3e. Add another method to print the author of a specific book.
        if (this.author.lastName == null){
            System.out.println("The author of " + this.title + " is " + this.author.firstName + ".");
        } else
            System.out.println("The author of " + this.title + " is " + this.author.firstName + " " + this.author.lastName + ".");
    }

    public void printTitleOfThisBook(){
        System.out.println("Title:" + this.title);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        if(author == null){
            throw new IllegalArgumentException("author was null.");
        }
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null){
            throw new IllegalArgumentException("title was null.");
        }
        this.title = title;
    }
}
