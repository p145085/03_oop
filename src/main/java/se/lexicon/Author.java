package se.lexicon;

public class Author {
    //3a. Create a class “Author” and create a class “Book”.
    //3b. Create the appropriate relationship between “Author” and “Book”.
    //i. One book can be written by only one author.
    //ii. One author can write one or more books.
    public String firstName;
    public String lastName;
    public int yearOfBirth;
    public Book[] books;

    public Author(String firstName,
                  String lastName,
                  int yearOfBirth,
                  Book[] books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.books = books;
    }

    public void printBooks(){
        //3d. Add a method that prints all books that have been written by a specific author.
        for(int i = 0; i < books.length; i++){
           System.out.println(books[i].title);
       }
    }

}
