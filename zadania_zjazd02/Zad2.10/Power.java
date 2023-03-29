public class Power {
    private int x;

    public Power(int x) {
        this.x = x;
    }

    public void potega() {
        int wynik = 1;
        for (int i = 0; i < 11; i++) {
            wynik *= x;
            System.out.println(x + " do potęgi " + (i+1) + " wynosi: " + wynik);
        }
    }
}