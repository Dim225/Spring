package Transportation;

public class TaxiTest {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.PassengerCheck(2);

        taxi.DestinationCheck("서울역");

        taxi.DestinationLen(2);
    }
}
