package module2;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1940;
        System.out.println(year);
        {
            if (year%4!=0){
                System.out.println("Rok nie przestępny");
            } else if (year%100!=0){
                System.out.println("Rok przestępny");
            } else if (year%400!=0){
                System.out.println("Rok nie przestępny");
            } else {
                System.out.println("Rok przestępny");
            }
        }
    }
}




