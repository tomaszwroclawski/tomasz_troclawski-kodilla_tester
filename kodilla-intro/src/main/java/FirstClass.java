public class FirstClass {

    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g",1000,2020);
        System.out.println(notebook.weight);
        System.out.println(notebook.price);
        System.out.println(notebook.year);
        notebook.checkPrice();
        notebook.checkYear();
        notebook.checkWeight();






        Notebook heavyNotebook = new Notebook("2000g",1500,2000);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);
        System.out.println(heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();
        heavyNotebook.checkWeight();




        Notebook oldNotebook = new Notebook("1600g",500, 2004);
        System.out.println(oldNotebook.weight);
        System.out.println(oldNotebook.price);
        System.out.println(oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
        oldNotebook.checkWeight();

        System.out.println(notebook.weight+" "+notebook.price+" "+notebook.year);
        System.out.println(heavyNotebook.weight+" "+heavyNotebook.price+" "+heavyNotebook.year);
        System.out.println(oldNotebook.weight+" "+oldNotebook.price+" "+oldNotebook.year);


        System.out.println("To jest oferta dla Ciebie :");

        notebook.checkYourMoney();
        heavyNotebook.checkYourMoney();
        oldNotebook.checkYourMoney();


    }
}
