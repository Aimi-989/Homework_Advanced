package Generics.Task_2_No_Generics;


public class Zadanie {

    public static void main(String[] args) {
        Book dickens = new Book();
        dickens.setAuthor("Charles Disckens");
         Library library = new Library();
         library.putBook(dickens);

    }

}



