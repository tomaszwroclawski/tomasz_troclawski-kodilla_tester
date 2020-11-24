package module2;

public class Notebook {
    String weight;
    int price;
    int checkPrice;
    int checkYear;
    int year;
    int checkYourMoney;
    int money;


    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.money=money;


    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price < 1000) {
            System.out.println("This price is good.");
        } else if (this.price > 1001) {
            System.out.println("This notebook is expensive.");
        } else {
            System.out.println("This price is good.");
        }
    }

    public void checkYear() {
        if (this.year <= 2000) {
            System.out.println("To jest rocznik 2000");
        } else if (this.year <= 2004) {
            System.out.println("To jest rocznik 2004");
        } else if (this.year >= 2020) {
            System.out.println("To jest rocznik 2020");
        } else {
            System.out.println("To jest rocznik 2000");
        }


    }

    public void checkWeight() {
        if (convert(this.weight) <= 600) {
            System.out.println("to jest waga poniżej lub równa 600g");
        } else if (convert(this.weight) <= 1600) {
            System.out.println("To jest waga 1600g");
        } else if
        (convert(this.weight) >= 1601) {
            System.out.println("To jest waga pow 1600g");
        } else {
            System.out.println("to jest waga poniżej lub równa  600g");


        }
    }

    private Integer convert(String imput) {
        String newString = imput.replace("g", "").replace("G", "");
        Integer newInteger = Integer.valueOf(newString);
        return newInteger;
    }


    public void checkYourMoney() {
        int money = 1000;


        System.out.println("To jest twój budżet:" + "  " + money + "  zł");

        if (money >= 500) {
            System.out.println("Zwraca wartość Notebook za  " + this.price + " zł, wyprodukowany w  " + this.year);


        }
        else if (money >= 1000)
        {
            System.out.println("Zwraca wartość Notebook za   " + this.price + " zł, wyprodukowany w  " + this.year);

        }
        else if (money >= 1500)
        {
            System.out.println("Zwraca wartość Notebook za   " + this.price + " zł, wyprodukowany w  " + this.year);
        }
        else if (money < 500)
        {
            System.out.println("Musisz wygospodarować minimum 500 zł");
        }

        String budget = money <= 500 ? "kupisz za tą kasę oldNotebook": "  ";
        String budget1 = money >= 1000 ? "kupisz za tą kasę Notebook lub 2 oldNotebook":"  ";
        String budget2 = money >= 1500 ? "kupisz za tą kasę newNotebook lub 3 oldNotebooki lub 1oldNotebook i 1Notebook minimum i zostanie ci trochę reszty": "  ";
        System.out.println(budget);
        System.out.println(budget1);
        System.out.println(budget2);
    }
}












