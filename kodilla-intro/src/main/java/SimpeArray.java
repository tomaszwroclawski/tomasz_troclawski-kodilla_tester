public class SimpeArray {
    public static void main(String[] args){
        String[] books = new String[5];
        books[0] = "Ruda, córka Cwiego";
        books[1] = "Żydzi na przełomie wieków";
        books[2] = "Cmentarze żydowskie na Sląsku";
        books[3] = "Stosunki polsko-żydowskie";
        books[4] = "Żydzi w Trójmieście";
        System.out.println(books[3]);
        String myBooks = books[3];
        System.out.println(myBooks);
        int numberOfElements = books.length;
        System.out.println(numberOfElements);
        System.out.println("Moja tablica zawiera "+ numberOfElements+" elementów" );
    }


}
