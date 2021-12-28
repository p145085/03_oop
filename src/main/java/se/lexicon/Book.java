package se.lexicon;

public class Book {
    //3a. Create a class “Author” and create a class “Book”.
    //3b. Create the appropriate relationship between “Author” and “Book”.
    //i. One book can be written by only one author.
    //ii. One author can write one or more books.
    public Author author;
    public String title;

    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    public void printAuthorOfThisBook(){
        //3e. Add another method to print the author of a specific book.
        System.out.println("Author of this book is: " + this.author.firstName + " " + this.author.lastName);
    }
}
