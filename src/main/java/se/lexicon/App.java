package se.lexicon;

import java.sql.Array;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      1c. In the main program make instance of “Car” and call the method “drive”.
        Car car1 = new Car(1, 1992, "Fiesta", "Blue", "V32");
        car1.drive();

        //2e. In the main program create instance of that “Rectangle” and ask user for height and
        //width and then print calculated area.
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1.getArea2(5, 10));

        //3c. In the main program create an array of authors where each author has at least one book.

        Book[] MA_Books = new Book[1];
        Book[] PL_Books = new Book[2];
        Book[] JS_Books = new Book[1];

        Author MA = new Author("Marcus", "Aurelius", 121, MA_Books);
        Author PL = new Author("Plato", "", -428, PL_Books);
        Author JS = new Author("Jonathan", "Stroud", 1970, JS_Books);

        Book meditations = new Book(MA, "the Meditations");
        Book republic = new Book(PL, "the Republic");
        Book trialanddeath = new Book(PL, "Trial and Death of Socrates");
        Book bartimaeus = new Book(JS, "the Bartimaeus Trilogy");

        MA_Books[0] = meditations;
        PL_Books[0] = republic;
        PL_Books[1] = trialanddeath;
        JS_Books[0] = bartimaeus;

        //3c.
        Author[] arrayOfAuthors = new Author[3];
        arrayOfAuthors[0] = MA;
        arrayOfAuthors[1] = PL;
        arrayOfAuthors[2] = JS;


        //3d. Add a method that prints all books that have been written by a specific author.

        MA.printBooks();
        PL.printBooks();

        //3e. Add another method to print the author of a specific book.
        meditations.printAuthorOfThisBook();
    }
}
