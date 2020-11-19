public class Colours {
    enum ColorsName {
        B, /* biały */
        C, /* czarny */
        F, /* fioletowy */
        K, /* kurde fajny */
        M, /* mandarynkowy */

    }

    public static void main(String[] args) {
        ColorsName ColorsName = Colours.ColorsName.B;
        switch (ColorsName) {
            case B:
                System.out.println("biały");
                break;
            case C:
                System.out.println("czarny");
                break;
            case F:
                System.out.println("fioletowy");
                break;
            case K:
                System.out.println("kurde fajny");
                break;
            case M:
                System.out.println("mandarynkowy");
                break;
        }
    }
}

