package Transportation;

public class Bustest {
    public static void main(String[] args) {
        Bus bus = new Bus();

        bus.CarState(true);

        bus.PassengerCheck(2);

        bus.OilCheck(-50);

        bus.CarState(false);

        bus.OilCheck(10);

        bus.CarState(true);

        bus.PassengerCheck(45);

        bus.PassengerCheck(5);

        bus.OilCheck(-55);
    }
}
