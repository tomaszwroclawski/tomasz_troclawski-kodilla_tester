public class Grades {

    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;

        this.size++;
    }

    public int lastValue() { // zwraca ostatnio wpisaną ocenę
        if (this.size == 0) {
            return -1;
        }
        return this.grades[this.size - 1];
    }

    public int averageNote() { //ta metoda ma zwracać średnią ocen
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + this.grades[i];
        }
        return sum / this.size;
    }
}

