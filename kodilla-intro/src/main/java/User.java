public class User {

    String usName;
    int usAge;


    public User(String usName, int usAge) {
        this.usName = usName;
        this.usAge = usAge;

    }

    public static void main(String[] args) {
        User Krzys = new User("Krzys", 38);
        User Edek= new User("Edek", 36);
        User Ola = new User("Ola", 45);
        User Ewka= new User("Ewka", 38);
        User Nati = new User("Nati", 34);
        User Karolcia= new User("Karolcia", 37);
        User Januszek = new User("Januszek", 15);

        User[] users = {Krzys, Edek, Ola, Ewka, Nati, Karolcia, Januszek};

        int tempAge = 0;
        double tempHeight = 0;
        for (User value : users) {
            tempAge += value.usAge;

        }
        int averageAge = tempAge / users.length;
        double averageHeight = tempHeight / users.length;
        System.out.println("Srednia wieku uzytkowników to " + averageAge);


        for (User value : users) {
            if (value.usAge <= averageAge)
                System.out.println("Uzytkownicy, ktorych wiek jest ponizej sredniej to " + value.usName);
        }
    }
}
