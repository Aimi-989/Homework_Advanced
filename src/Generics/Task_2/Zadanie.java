package Generics.Task_2;


public class Zadanie {

    public static void main(String[] args) {
        Book dickens = new Book();
        dickens.setAuthor("Charles Disckens");
         Library<Book> library = new Library<>();
         library.putBook(dickens);

    }

}



