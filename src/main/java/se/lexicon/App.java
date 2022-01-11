package se.lexicon;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      1c. In the main program make instance of “Car” and call the method “drive”.
//        Car car1 = new Car(1, 1992, "Fiesta", "Blue", "V32");
//        car1.drive();

        //2e. In the main program create instance of that “Rectangle” and ask user for height and
        //width and then print calculated area.
//        Rectangle rect1 = new Rectangle();
//        System.out.println(rect1.getArea2(5, 10));

        //3c. In the main program create an array of authors where each author has at least one book.

        Book[] MarcusAurelius_books = new Book[1];
        Book[] Plato_books = new Book[2];
        Book[] JonathanStroud_books = new Book[1];
        Book[] HPLovecraft_books = new Book[2];
        Book[] Homeros_books = new Book[2];
        Book[] MartinHeidegger_books = new Book[1];
        Book[] Frazer_books = new Book[1];
        Book[] Gibson_books = new Book[1];
        Book[] Gluchovskij_books = new Book[1];
        Book[] Sketchley_books = new Book[1];
        Book[] Omnibus_books = new Book[1];
        Book[] Twain_books = new Book[1];
        Book[] Machiavelli_books = new Book[1];
        Book[] SunTzu_books = new Book[1];
        Book[] MohamedouOuldSlahi_books = new Book[1];
        Book[] NealStephenson_books = new Book[1];

        Author MarcusAurelius = new Author("Marcus", "Aurelius", LocalDate.of(121,1 , 1), MarcusAurelius_books);
        Author Plato = new Author("Plato", LocalDate.of(-428, 1, 1), Plato_books);
        Author JonathanStroud = new Author("Jonathan", "Stroud", LocalDate.of(1970, 10, 27), JonathanStroud_books);
        Author Lovecraft = new Author("Howard Phillips", "Lovecraft", LocalDate.of(1890,8,20), Lovecraft);
        Author Homeros = new Author("Homeros", LocalDate.of(-800,1,1), Homeros_books);
        Author Heidegger = new Author("Martin", "Heidegger", LocalDate.of(1889,9,26), MartinHeidegger_books);
        Author Frazer = new Author("Sir James", "Frazer", LocalDate.of(1854, 1, 1), Frazer_books);
        Author Gibson = new Author("William", "Gibson", LocalDate.of(1948, 3, 17), Gibson_books);
        Author Gluchovskij = new Author("Dmitrij", "Gluchovskij", LocalDate.of(1979, 6, 12), Gluchovskij_books);
        Author Sketchley = new Author("Martin", "Sketchley", LocalDate.of(1968, 1, 1), Sketchley_books);
        Author Omnibus = new Author("Graham Masterton", "Omnibus", LocalDate.of(1946, 1, 16), Omnibus_books);
        Author Twain = new Author("Mark", "Twain", LocalDate.of(1835, 11, 30), Twain_books);
        Author Machiavelli = new Author("Niccolò", "Machiavelli", LocalDate.of(1469, 5, 3), Machiavelli_books);
        Author SunTzu = new Author("Sun", "Tzu", LocalDate.of(-544, 1, 1), SunTzu_books);
        Author MohamedouOuldSlahi = new Author("Mohamedou Ould", "Slahi", LocalDate.of(1970, 12, 21), MohamedouOuldSlahi_books);
        Author NealStephenson = new Author("Neal", "Stephenson", LocalDate.of(1959, 10, 31), NealStephenson_books);

        Book meditations = new Book(MarcusAurelius, "the Meditations", true);
        Book therepublic = new Book(Plato, "the Republic", true);
        Book trialanddeath = new Book(Plato, "Trial and Death of Socrates", false);
        Book bartimaeus = new Book(JonathanStroud, "the Bartimaeus Trilogy", false);
        Book necronomicon = new Book(Lovecraft, "Necronomicon", true);
        Book callofcthulhu = new Book(Lovecraft, "The call of Cthulhu", true);
        Book theiliad = new Book(Homeros, "The Iliad", true);
        Book theodyssey = new Book(Homeros, "The Odyssey", true);
        Book beingandtime = new Book(Heidegger, "Being and Time", true);
        Book thegoldenbough = new Book(Frazer, "The Golden Bough", true);
        Book neuromancer = new Book(Gibson, "Neuromancer", true);
        Book metro2035 = new Book(Gluchovskij, "Metro 2035", true);
        Book thedestinymask = new Book(Sketchley, "The Destiny Mask", true);
        Book foo = new Book(Omnibus, "Tengu/TheDevilsOfDDay/Mirror/CharnelHouse", true);
        Book tomsawyerhuckleberryfinn = new Book(Twain, "Tom Sawyer & Huckleberry Finn", true);
        Book theprince = new Book(Machiavelli, "The Prince", true);
        Book artofwar = new Book(SunTzu, "The art of war", true);
        Book guantanamo = new Book(MohamedouOuldSlahi, "Guantánamo, a diary", true);
        Book snowcrash = new Book(NealStephenson, "Snow Crash", true);

        MarcusAurelius_books[0] = meditations;
        Plato_books[0] = therepublic;
        Plato_books[1] = trialanddeath;
        JonathanStroud_books[0] = bartimaeus;
        HPLovecraft_books[0] = necronomicon;
        HPLovecraft_books[1] = callofcthulhu;
        Homeros_books[0] = theiliad;
        Homeros_books[1] = theodyssey;
        MartinHeidegger_books[0] = beingandtime;
        Frazer_books[0] = thegoldenbough;
        Gibson_books[0] = neuromancer;
        Gluchovskij_books[0] = metro2035;
        Sketchley_books[0] = thedestinymask;
        Omnibus_books[0] = foo;
        Twain_books[0] = tomsawyerhuckleberryfinn;
        Machiavelli_books[0] = theprince;
        SunTzu_books[0] = artofwar;
        MohamedouOuldSlahi_books[0] = guantanamo;
        NealStephenson_books[0] = snowcrash;

        //3c.
        Author[] arrayOfAuthors = new Author[16];
        arrayOfAuthors[0] = MarcusAurelius;
        arrayOfAuthors[1] = Plato;
        arrayOfAuthors[2] = JonathanStroud;
        arrayOfAuthors[3] = Lovecraft;
        arrayOfAuthors[4] = Homeros;
        arrayOfAuthors[5] = Heidegger;
        arrayOfAuthors[6] = Frazer;
        arrayOfAuthors[7] = Gibson;
        arrayOfAuthors[8] = Gluchovskij;
        arrayOfAuthors[9] = Sketchley;
        arrayOfAuthors[10] = Omnibus;
        arrayOfAuthors[11] = Twain;
        arrayOfAuthors[12] = Machiavelli;
        arrayOfAuthors[13] = SunTzu;
        arrayOfAuthors[14] = MohamedouOuldSlahi;
        arrayOfAuthors[15] = NealStephenson;


        //3d. Add a method that prints all books that have been written by a specific author.


        //3e. Add another method to print the author of a specific book.


    }
}
