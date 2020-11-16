public class Person {

    String name;
    double age;
    double height;

    public Person(String name,double age, double height){
        this.name = name;
        this.age = age;
        this.height=height;
    }
    public void checkAgeToHeight(){
        if (this.name !=null){
            if(age>30 && height>160) {
                System.out.println("Person is older than 30  and higher than 160 cm ");
            }
            else
            {System.out.println("Person is 30 (or younger) or 160 cm (or shorter)");
            }
        }
    }
}
