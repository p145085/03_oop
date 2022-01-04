package se.lexicon;

import java.time.LocalDate;

public class Author {
    //3a. Create a class “Author” and create a class “Book”.
    //3b. Create the appropriate relationship between “Author” and “Book”.
    //i. One book can be written by only one author.
    //ii. One author can write one or more books.
    public String firstName;
    public String lastName;
    public LocalDate yearOfBirth;
    public Book[] books;

    public Author(String firstName,
                  String lastName,
                  LocalDate yearOfBirth,
                  Book[] books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.books = books;
    }

    public Author(String firstName, LocalDate yearOfBirth, Book[] books) {
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.books = books;
    }

    public void printBooksOfAuthor(){
        //3d. Add a method that prints all books that have been written by a specific author.
        if (this.lastName == null){
            System.out.println("Printing all books written by " + this.firstName + ".");
        } else
            System.out.println("Printing all books written by " + this.firstName + " " + this.lastName + ".");
        for(int i = 0; i < books.length; i++){
           System.out.println(books[i].title);
       }
    }

    public void printAuthorWasBorn(){
        if (this.lastName == null){
            System.out.println(this.firstName + " was born in " + this.yearOfBirth);
        } else
            System.out.println(this.firstName + " " + this.lastName + " was born in " + this.yearOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null){
            throw new IllegalArgumentException("firstName was null.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null){
            throw new IllegalArgumentException("lastName was null.");
        }
        this.lastName = lastName;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        if(yearOfBirth == null){
            throw new IllegalArgumentException("yearOfBirth was null.");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
