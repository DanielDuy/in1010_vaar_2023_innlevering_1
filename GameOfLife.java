public class GameOfLife {
    public static void main(String [] args) {
        Verden verden1 = new Verden(8, 12);
        for (int i = 0; i < 4; i++) {
            verden1.tegn();
            verden1.oppdatering();
        }
    }
}
